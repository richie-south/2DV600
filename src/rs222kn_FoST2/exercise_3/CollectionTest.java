package rs222kn_FoST2.exercise_3;

import org.junit.Test;
import rs222kn_FoST2.Inheritance.ArrayIntList;
import rs222kn_FoST2.Inheritance.ArrayIntStack;

import static org.junit.Assert.*;

public class CollectionTest {

  @Test
  public void push() throws Exception {
    ArrayIntStack a = new ArrayIntStack();
    assertTrue(a.isEmpty());
    a.push(1);
    a.push(2);
    assertFalse(a.isEmpty());
    assertEquals(2, a.size());
  }

  @Test (expected = IndexOutOfBoundsException.class)
  public void pop() throws Exception {
    ArrayIntStack a = new ArrayIntStack();
    a.push(1);
    a.push(2);
    assertEquals(2, a.size());
    assertEquals(2, a.pop());
    assertEquals(1, a.size());

    a.pop();
    a.pop();
  }

  @Test (expected = IndexOutOfBoundsException.class)
  public void peek() throws Exception {
    ArrayIntStack a = new ArrayIntStack();
    a.push(1);
    a.push(2);
    assertEquals(2, a.size());
    assertEquals(2, a.peek());
    assertEquals(2, a.size());

    a.pop();
    a.pop();
    a.peek();
  }



  @Test
  public void add() throws Exception {
    ArrayIntList a = new ArrayIntList();
    assertTrue(a.isEmpty());
    a.add(1);
    a.add(2);
    assertEquals(2, a.size());
    assertFalse(a.isEmpty());
  }

  @Test (expected = IndexOutOfBoundsException.class)
  public void addAt() throws Exception {
    ArrayIntList a = new ArrayIntList();
    a.add(10);
    a.add(11);
    a.add(8);
    a.addAt(20, 2);
    assertEquals(20, a.get(2));
    a.addAt(10, 10);
  }



  @Test (expected = IndexOutOfBoundsException.class)
  public void remove() throws Exception {
    ArrayIntList a = new ArrayIntList();
    a.add(1);
    a.remove(0);
    assertEquals(0, a.size());
    a.remove(100);
  }

  @Test (expected = IndexOutOfBoundsException.class)
  public void get() throws Exception {
    ArrayIntList a = new ArrayIntList();
    a.add(1);
    a.add(3);
    a.add(10);
    assertEquals(10, a.get(2));
    a.get(100);
  }

  @Test
  public void indexOf() throws Exception {
    ArrayIntList a = new ArrayIntList();
    a.add(1);
    a.add(3);
    a.add(10);
    assertEquals(1, a.indexOf(3));
    assertEquals(-1, a.indexOf(12));
  }

}