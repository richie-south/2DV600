package rs222kn_FoST2.ferry;

public class FerryMain {

  public static void main(String[] args){

    Car c1 = new Car(4);
    Car c2 = new Car(2);
    Lorry l1 = new Lorry(1);
    Lorry l2 = new Lorry(2);
    Bicycke b1 = new Bicycke();
    Bus bu1 = new Bus(20);
    Bus bu2 = new Bus(20);
    Bus bu3 = new Bus(10);
    Bus bu4 = new Bus(20);
    Passenger p1 = new Passenger();

    Ferry f1 = new Ferry();
    f1.embark(c1);
    f1.embark(c2);
    f1.embark(l1);
    f1.embark(b1);
    f1.embark(bu1);
    f1.embark(bu2);
    f1.embark(bu3);
    f1.embark(bu4);

    f1.embark(bu4);


    System.out.println(f1.toString());
    System.out.println("hasSpaceFor, Lorry:  " + f1.hasSpaceFor(l2));
    System.out.println("hasRoomFor: " + f1.hasRoomFor(p1));
    System.out.println("==Disembark==");
    f1.disembark();
    System.out.println(f1.toString());
  }
}
