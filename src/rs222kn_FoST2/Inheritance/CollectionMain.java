package rs222kn_FoST2.Inheritance;

public class CollectionMain {
  public static void main(String[] args)  {
    ArrayIntList a1 = new ArrayIntList();

    System.out.println("ArrayIntList");

    System.out.println("isEmpty: " + a1.isEmpty());
    System.out.println("add: 10, 5 ,20");
    a1.add(10);
    a1.add(5);
    a1.add(20);
    System.out.println("toString: " + a1.toString());
    System.out.println("isEmpty: " + a1.isEmpty());
    System.out.println("addAt: val: 100 pos: 1");
    a1.addAt(100, 1);
    System.out.println("toString: " + a1.toString());
    System.out.println("get index 1: " + a1.get(1));
    System.out.println("indexOf 100: " + a1.indexOf(100));
    System.out.println("remove pos: 0");
    a1.remove(0);
    System.out.println("toString: " + a1.toString());

    System.out.println("");
    System.out.println("");
    System.out.println("ArrayIntStack");
    ArrayIntStack as1 = new ArrayIntStack();

    System.out.println("isEmpty: " + as1.isEmpty());
    System.out.println("push: 1, 2, 3");
    as1.push(1);
    as1.push(2);
    as1.push(3);
    System.out.println("toString: " + as1.toString());
    System.out.println("pop: " + as1.pop());
    System.out.println("toString: " + as1.toString());
    System.out.println("peek: " + as1.peek());

  }
}
