package rs222kn_FoST2.exercise_4;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class QueueTest {

  @Test
  public void size() throws Exception {
    int size = 1000000;
    Queue q = makeQueueWithElements(size);
    assertEquals(size, q.size());
  }

  @Test
  public void isEmpty() throws Exception {
    Queue q = new Queue<>();
    assertTrue(q.isEmpty());
    for (int i = 0; i < 1000000; i++) {
      q.enqueue(i);
    }

    assertFalse(q.isEmpty());

    for (int i = 0; i < 1000000; i++) {
      q.dequeue();
    }
    assertTrue(q.isEmpty());
  }

  @Test
  public void enqueue() throws Exception {
    Queue q = new Queue<>();
    assertTrue(q.isEmpty());
    q.enqueue(1);
    assertFalse(q.isEmpty());
    assertEquals(1, q.first());

    int size = 1000000;
    Queue q1 = makeQueueWithElements(size);
    assertEquals(size, q1.size());
  }

  @Test (expected = IndexOutOfBoundsException.class)
  public void dequeue() throws Exception {
    Queue q = new Queue<>();
    q.enqueue(1);
    assertFalse(q.isEmpty());
    assertEquals(1, q.dequeue());
    assertTrue(q.isEmpty());

    q.dequeue();
  }

  @Test (expected = IndexOutOfBoundsException.class)
  public void first() throws Exception {
    Queue q = makeQueueWithElements(1000000);
    assertEquals(0, q.first());

    Queue q2 = makeQueueWithElements(0);
    q2.first();
  }

  @Test (expected = IndexOutOfBoundsException.class)
  public void last() throws Exception {
    Queue q = makeQueueWithElements(1000000);
    assertEquals(999999, q.last());

    Queue q2 = makeQueueWithElements(0);
    q2.last();
  }

  @Test (expected = NullPointerException.class)
  public void iterator() throws Exception {
    int[] vals = new int[2000];
    Queue q = new Queue<>();
    for (int i = 0; i < vals.length; i++) {
      vals[i] = i;
      q.enqueue(vals[i]);
    }
    assertTrue(vals.length == q.size());
    Iterator qIterator = q.iterator();

    int i = 0;
    while(qIterator.hasNext()){
      assertTrue((int)qIterator.next() == vals[i]);
      i++;
    }

    // should throw error!
    Queue q2 = makeQueueWithElements(0);
    Iterator qIterator2 = q2.iterator();
    qIterator2.hasNext();
    qIterator2.next();
  }


  private Queue makeQueueWithElements(int size){
    Queue q = new Queue<>();
    for (int i = 0; i < size; i++) {
      q.enqueue(i);
    }
    return q;
  }

}