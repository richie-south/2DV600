package rs222kn_FoST2.ferry;

/**
 * Created by richardsoderman on 2016-09-19.
 */
public class Lorry extends Vehicle{
  private final int MAX_PASSENGERS = 2;

  public Lorry(int passengers) throws IndexOutOfBoundsException{
    if(passengers > MAX_PASSENGERS || passengers < 1){
      throw new IndexOutOfBoundsException();
    }

    this.setVehicleCost(300);
    this.setSpace(8);
    this.setPassengerCost(15);
    this.setTotalPassengers(passengers);
    this.setType("Lorry");
  }

  @Override
  protected String VehicleInfo() {
    return "Type: " + this.getType() + " Passengers: " + this.getTotalPassengers();
  }
}
