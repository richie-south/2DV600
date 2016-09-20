package rs222kn_FoST2.exercise_4;

import java.util.Iterator;

public class Queue<E> implements IQueue<E>{
  private Node head;
  private Node tail;
  private int size = 0;

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public void enqueue(E element) {
    if (head == null){
      head = new Node(element);
      tail = head;
    }else{
      tail.setNext(new Node(element));
      tail = tail.getNext();
    }
    size++;
  }

  @Override
  public E dequeue() {
    if(isEmpty()){
      throw new IndexOutOfBoundsException();
    }
    Node toRemove = head;
    head = head.getNext();
    size--;
    return toRemove.getNode();
  }

  @Override
  public E first() {
    if (isEmpty()) {
      throw new IndexOutOfBoundsException();
    }
    return head.getNode();
  }

  @Override
  public E last() {
    if (isEmpty()) {
      throw new IndexOutOfBoundsException();
    }
    return tail.getNode();
  }

  @Override
  public Iterator iterator() {
    return new Iterator() {
      private Node _head = head;

      public boolean hasNext() {
        if (isEmpty()) {
          throw new NullPointerException();
        }
        return _head != null;
      }

      public Object next() {
        if (isEmpty()){
          throw new NullPointerException();
        }

        Node ret = _head;
        _head = _head.getNext();
        return ret.getNode();
      }
    };
  }

  private class Node {
    private Node next = null;
    private E node;

    public Node(E element){
      node = element;
    }

    public E getNode(){
      return node;
    }

    public void setNext(Node node){
      next = node;
    }

    public Node getNext(){
      return next;
    }
  }
}
