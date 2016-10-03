package rs222kn_assign3.rs222kn;

import rs222kn_assign3.graphs.DirectedGraph;
import rs222kn_assign3.graphs.Node;

import java.util.*;
import java.util.stream.IntStream;

public class MyGraph<E> implements DirectedGraph<E> {
  private Map<E, MyNode<E>> item2node;
  private Set<Node<E>> heads;
  private Set<Node<E>> tails;

  public MyGraph(){
    item2node = new HashMap<E, MyNode<E>>();
    heads = new HashSet<Node<E>>();
    tails = new HashSet<Node<E>>();
  }

  @Override
  public Node<E> addNodeFor(E item) {
    if(item == null){
      throw new NullPointerException();
    }

    if(!item2node.containsKey(item)){
      MyNode<E> node = new MyNode<E>(item);
      tails.add(node);
      heads.add(node);
      item2node.put(item, node);
    }

    return item2node.get(item);
  }

  @Override
  public Node<E> getNodeFor(E item) {
    if(item == null){
      throw new RuntimeException();
    }
    if(!item2node.containsKey(item)){
      throw new RuntimeException();
    }
    return item2node.get(item);
  }

  @Override
  public boolean addEdgeFor(E from, E to) {
    if(from == null || to == null){
      throw new RuntimeException();
    }

    MyNode<E> src = (MyNode<E>) addNodeFor(from);
    MyNode<E> tgt = (MyNode<E>) addNodeFor(to);

    if(src.hasSucc(tgt)){
      return false;
    }
    src.addSucc(tgt);
    tgt.addPred(src);

    tails.remove(src);
    heads.remove(tgt);

    return true;
  }

  @Override
  public boolean containsNodeFor(E item) {
    if(item == null){
      throw new RuntimeException();
    }
    return item2node.get(item) != null;
  }

  @Override
  public int nodeCount() {
    return item2node.size();
  }

  @Override
  public Iterator<Node<E>> iterator() {
    HashMap<E, Node<E>> t = new HashMap<E, Node<E>>();
    for(MyNode<E> node : item2node.values()){
      t.put(node.item(), (Node<E>)node);
    }
    return t.values().iterator();
  }

  @Override
  public Iterator<Node<E>> heads() {
    return  heads.iterator();
  }

  @Override
  public int headCount() {
    return heads.size();
  }

  @Override
  public Iterator<Node<E>> tails() {
    return tails.iterator();
  }

  @Override
  public int tailCount() {
    return tails.size();
  }

  @Override
  public List<E> allItems() {
    List<E> myList = new ArrayList<E>();
    for(MyNode<E> node : item2node.values()){
      myList.add(node.item());
    }
    return myList;
  }

  @Override
  public int edgeCount() {
    return item2node.values().stream().mapToInt(n -> n.outDegree()).sum();
  }

  @Override
  public void removeNodeFor(E item) {
    if(item == null || item2node.get(item) == null){
      throw new RuntimeException();
    }

    MyNode<E> toRemove = item2node.get(item);
    if(toRemove.isHead()){
     heads.remove(toRemove);
    }
    if(toRemove.isTail()){
      tails.remove(toRemove);
    }

    for(MyNode<E> node: item2node.values()){
      if(node.hasPred(toRemove)){
        node.removePred(toRemove);
        if(node.isHead()){
          heads.add(node);
        }
      }
      if(node.hasSucc(toRemove)){
        node.removeSucc(toRemove);
        if(node.isTail()){
          heads.add(node);
        }
      }
    }
    toRemove.disconnect();
    item2node.remove(item);

  }

  @Override
  public boolean containsEdgeFor(E from, E to) {
    if(from == null || to == null){
      throw new RuntimeException();
    }

    if(containsNodeFor(from) && containsNodeFor(to)){
      return item2node.get(from).hasSucc(item2node.get(to));
    }
    return false;
  }

  @Override
  public boolean removeEdgeFor(E from, E to) {
    if(from == null || to == null){
      throw new RuntimeException();
    }

    if(containsEdgeFor(from, to)){
      MyNode<E> a = item2node.get(from);
      MyNode<E> b = item2node.get(to);
      a.removeSucc(b);
      b.removePred(a);

      if(a.isHead()){
        heads.add(a);
      }
      if(a.isTail()) {
        tails.add(a);
      }
      if(b.isHead()){
        heads.add(b);
      }
      if(b.isTail()){
        tails.add(b);
      }
      return true;
    }
    return false;
  }

  @Override
  public String toString(){

    String result = "";
    for(MyNode<E> node : item2node.values()){
      result += "\n node [";
      result +=  node + "]";
    }
    for(MyNode<E> node : item2node.values()){
      Iterator<Node<E>> prefsIterator = node.predsOf();
      result += "\n" + node +" => predecessors: ";
      while (prefsIterator.hasNext()){
        result += "[" + prefsIterator.next() + "]";
      }

      Iterator<Node<E>> succsIterator = node.succsOf();
      result += "\n" + node + " => successors: ";
      while (succsIterator.hasNext()){
        result += "[" + succsIterator.next() + "]";
      }
    }

    return result;
  }
}
