package rs222kn_FoST2.ferry;

/**
 * Created by richardsoderman on 2016-09-19.
 */
public class Bicycke extends Vehicle{
  private final int MAX_PASSENGERS = 1;

  public Bicycke(){
    this.setVehicleCost(40);
    this.setSpace(0.2);
    this.setTotalPassengers(1);
    this.setType("bicycle");
  }

  @Override
  protected String VehicleInfo() {
    return "type: " + this.getType() + " Passengers: " + this.getTotalPassengers();
  }
}
