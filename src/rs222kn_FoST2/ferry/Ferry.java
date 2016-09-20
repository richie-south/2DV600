package rs222kn_FoST2.ferry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ferry implements FerryInterface {
  private final int MAX_PASSENGERS = 200;
  private final int MAX_SPACE = 40;
  private int moneyEarned = 0;
  private double spaceUsed = 0;
  private ArrayList<Passenger> passengers;
  private ArrayList<Vehicle> vehicles;

  public Ferry(){
    passengers = new ArrayList<>();
    vehicles = new ArrayList<>();
  }

  @Override
  public int countPassengers() {
    return passengers.size();
  }

  @Override
  public int countVehicleSpace() {
    return (int)spaceUsed;
  }

  @Override
  public int countMoney() {
    return moneyEarned;
  }

  @Override
  public void embark(Vehicle v) {
    if(hasSpaceFor(v) && countPassengers() + v.getTotalPassengers() <= MAX_PASSENGERS){
      vehicles.add(v);
      spaceUsed += v.getSpace();
      moneyEarned += v.getVehicleCost();

      v.getPassengers().forEach(p -> embark(p));
    }
  }

  @Override
  public void embark(Passenger p) {
    if(hasRoomFor(p)){
      passengers.add(p);
      moneyEarned += p.getCost();
    }
  }

  @Override
  public void disembark() {
    passengers.clear();
    vehicles.clear();
    spaceUsed = 0;
  }

  @Override
  public boolean hasSpaceFor(Vehicle v) {
    return spaceUsed + v.getSpace() > MAX_SPACE || !vehicles.contains(v);
  }

  @Override
  public boolean hasRoomFor(Passenger p) {
    return countPassengers() + 1 <= MAX_PASSENGERS || !passengers.contains(p);
  }

  @Override
  public String toString(){
    String result = "";

    result += "Total passengers: " + countPassengers() + "\n" +
        "Total Vehicles: " + countVehicleSpace() + "\n" +
        "Money earned: " + moneyEarned + "kr \nVehicle info:";

    Iterator<Vehicle> vIterator = vehicles.iterator();
    while (vIterator.hasNext()){
      Vehicle v = vIterator.next();
      result += "\n==========================\n";
      result += "Type: " + v.getType() + ",\n" +
          " Space used: " + v.getSpace() + ",\n" +
          " Passengers: " + v.getTotalPassengers() + ",\n" +
          " Cost for passenger: " + v.getPassengerCost() + ",\n" +
          " Cost for vehicle: " + v.getVehicleCost();
    }

    return result;
  }

  @Override
  public Iterator<Vehicle> iterator() {
    return new Iterator<Vehicle>() {

      private int vehiclesCount = 0;

      @Override
      public boolean hasNext() {
        return vehiclesCount < vehicles.size();
      }

      @Override
      public Vehicle next() {
        return vehicles.get(vehiclesCount++);
      }

    };
  }
}
