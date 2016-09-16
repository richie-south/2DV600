package rs222kn_assign1.Queue;

/**
 * Created by richardsoderman on 2016-09-10.
 */
public class QueueMain {
  public static void main(String[] args) {
    Queue q = new Queue();

    System.out.println("isEmpty: " + q.isEmpty());

    System.out.println("Add 4 nodes");
    q.enqueue("1");
    q.enqueue("2");
    q.enqueue("3");
    q.enqueue("4");

    System.out.println("Size: " + q.size());
    System.out.println("isEmpty: " + q.isEmpty());
    System.out.println("dequeue: " + q.dequeue());
    System.out.println("Size: " + q.size());
    System.out.println("head is: " + q.first());
    System.out.println("tail is: " + q.last());

    System.out.println("contains 2: " + q.contains("2"));
    System.out.println("contains 3: " + q.contains("3"));
    System.out.println("contains 4: " + q.contains("4"));

  }
}
