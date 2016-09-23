package rs222kn_FoST2.tasks_5;

import rs222kn_FoST2.exercise_4.Queue;

import java.util.Iterator;

public class TreeWordSet implements WordSet{
  private int size = 0;
  private Node root = null;


  @Override
  public void add(Word word) {
    if(root == null){
      root = new Node(word);
    }else if(contains(word)){
      return;
    }else{
      root.add(word);
    }
    size++;
  }

  @Override
  public boolean contains(Word word) {
    if(root == null){
      return false;
    }
    return root.contains(word);
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public Iterator<Word> iterator() {
    return new TreeSetIterator();
  }

  private class TreeSetIterator implements Iterator<Word>{
    Queue<Node> queue;
    Iterator<Node> queueIterator;

    public TreeSetIterator(){
      queue = new Queue();
      addToQueue(root);
      queueIterator = queue.iterator();
    }

    public void addToQueue(Node node) {
      if(node.left != null){
        addToQueue(node.left);
      }
      queue.enqueue(node);
      if (node.right != null){
        addToQueue(node.right);
      }
    }

    public boolean hasNext() {
      return queueIterator.hasNext();
    }

    public Word next() {
      return queueIterator.next().value;
    }
  }


  private class Node {
    Word value;
    Node left = null;
    Node right = null;

    Node(Word word){
      value = word;
    }

    public void add(Word word){
     if(word.compareTo(value) < 0){
       if(left == null){
         left = new Node(word);
       }else{
         left.add(word);
       }
     }else if (word.compareTo(value) > 0){
       if(right == null){
         right = new Node(word);
       }else{
         right.add(word);
       }
     }
    }

    public boolean contains(Word word){
      if(word.compareTo(value) < 0){
        if(left == null){
          return false;
        }else{
          return left.contains(word);
        }
      }else if(word.compareTo(value) > 0){
        if(right == null){
          return false;
        }else{
          return right.contains(word);
        }
      }
      return true;
    }
  }
}
