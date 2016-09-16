package rs222kn_assign1.Queue;

import java.util.Iterator;
import java.util.Objects;

public class Queue implements QueueInterface {
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
  public void enqueue(Object element) {
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
  public Object dequeue() throws IndexOutOfBoundsException {
    if(isEmpty()){
      throw new IndexOutOfBoundsException();
    }else{
      Node toRemove = head;
      head = head.getNext();
      size--;
      return toRemove.getNode();
    }
  }

  @Override
  public Object first() {
    if (isEmpty()) {
      throw new IndexOutOfBoundsException();
    }
    return head.getNode();
  }

  @Override
  public Object last() {
    if (isEmpty()) {
      throw new IndexOutOfBoundsException();
    }
    return tail.getNode();
  }

  @Override
  public boolean contains(Object o) {
    Iterator<Object> iterator = iterator();
    while(iterator.hasNext()){
      if(o == iterator.next()){
        return true;
      }
    }
    return false;
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
    private Object node;

    public Node(Object element){
      node = element;
    }

    public Object getNode(){
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


