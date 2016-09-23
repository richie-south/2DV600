package rs222kn_FoST2.tasks_5;

import java.util.Iterator;

public class HashWordSet implements WordSet{
  private int size;
  private Node[] bukets = new Node[8];

  @Override
  public void add(Word word) {
    int pos = getBucketNumber(word);
    Node node = bukets[pos];
    while(node != null){
      if(node.word.equals(word)){
        return;
      }else{
        node = node.next;
      }
    }

    node = new Node(word);
    node.next = bukets[pos];
    bukets[pos] = node;
    size++;
    if(size == bukets.length){
      rehash();
    }
  }

  @Override
  public boolean contains(Word word) {
    int pos = getBucketNumber(word);
    Node node = bukets[pos];
    while(node != null){
      if(node.word.equals(word)){
        return true;
      }else{
        return false;
      }
    }
    return false;
  }

  @Override
  public int size() {
    return size;
  }

  private int getBucketNumber(Word word){
    int hc = word.hashCode();
    if(hc < 0){
      hc = -hc;
    }
    return hc % bukets.length;
  }

  private void rehash(){
    Node[] temp = bukets;
    bukets = new Node[2*temp.length];
    size = 0;
    for(Node n : temp){
      if(n == null){
        continue;
      }
      while(n != null){
        add(n.word);
        n = n.next;
      }
    }
  }

  private class Node {
    Word word;
    Node next = null;

    public Node (Word word) {
      this.word = word;
    }

    @Override
    public String toString (){
      return word.toString();
    }
  }

  @Override
  public Iterator iterator(){
    return new HashSetIterator();
  }

  private class HashSetIterator implements  Iterator<Word>{
    private Node node;
    private int buketIndex;

    public HashSetIterator(){
      node = null;
      buketIndex = -1;
    }

    public boolean hasNext(){
      if(node != null && node.next != null){
        return true;
      }
      for (int i = buketIndex + 1; i < bukets.length; i++) {
        if(bukets[i] != null){
          return true;
        }
      }
      return false;
    }

    public Word next(){
      if(node != null && node.next != null){
        node = node.next;
      }else{
        do {
          buketIndex++;
          if(buketIndex == bukets.length){
            throw new IndexOutOfBoundsException();
          }
          node = bukets[buketIndex];
        }while(node == null);
      }
      return node.word;
    }
  }
}
