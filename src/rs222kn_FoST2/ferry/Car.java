package rs222kn_FoST2.ferry;

public class Car extends Vehicle{

  private final int MAX_PASSENGERS = 4;

  public Car(int passengers) throws IndexOutOfBoundsException{
    if(passengers > MAX_PASSENGERS || passengers < 1){
      throw new IndexOutOfBoundsException();
    }

    this.setVehicleCost(100);
    this.setSpace(1);
    this.setPassengerCost(15);
    this.setTotalPassengers(passengers);
    this.setType("car");
  }

  @Override
  protected String VehicleInfo() {
    return "type: " + this.getType() + " Passengers: " + this.getTotalPassengers();
  }
}
