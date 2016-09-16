package rs222kn_FoST2.ferry;

import java.util.Iterator;

public class Ferry implements FerryInterface {

  @Override
  public int countPassengers() {
    return 0;
  }

  @Override
  public int countVehicleSpace() {
    return 0;
  }

  @Override
  public int countMoney() {
    return 0;
  }

  @Override
  public void embark(Vehicle v) {

  }

  @Override
  public void embark(Passenger p) {

  }

  @Override
  public void disembark() {

  }

  @Override
  public boolean hasSpaceFor(Vehicle v) {
    return false;
  }

  @Override
  public boolean hasRoomFor(Passenger p) {
    return false;
  }

  @Override
  public Iterator<Vehicle> iterator() {
    return null;
  }
}
