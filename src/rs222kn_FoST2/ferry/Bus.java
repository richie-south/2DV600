package rs222kn_FoST2.ferry;

/**
 * Created by richardsoderman on 2016-09-19.
 */
public class Bus extends Vehicle{
  private final int MAX_PASSENGERS = 20;

  public Bus(int passengers) throws IndexOutOfBoundsException{
    if(passengers > MAX_PASSENGERS || passengers < 1){
      throw new IndexOutOfBoundsException();
    }

    this.setVehicleCost(200);
    this.setSpace(4);
    this.setPassengerCost(10);
    this.setTotalPassengers(passengers);
    this.setType("buss");
  }

  @Override
  protected String VehicleInfo() {
    return "type: " + this.getType() + " Passengers: " + this.getTotalPassengers();
  }
}
