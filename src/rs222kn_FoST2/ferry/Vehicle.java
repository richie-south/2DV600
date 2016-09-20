package rs222kn_FoST2.ferry;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
  private double space;
  private int totalPassengers;
  private int passengerCost;
  private int vehicleCost;
  private String type;
  private ArrayList<Passenger> passengerInVehicle;

  public Vehicle(){
     passengerInVehicle = new ArrayList<Passenger>();
  }

  // set:s

  public void setSpace(double space){
    this.space = space;
  }

  public void setTotalPassengers(int totalPassengers){
    this.totalPassengers = totalPassengers;
  }

  public void setPassengerCost(int passengerCost){
    this.passengerCost = passengerCost;
  }

  public void setVehicleCost(int vehicleCost){
    this.vehicleCost = vehicleCost;
  }

  public void setType(String type){
    this.type = type;
  }

  // get:s

  protected int getVehicleCost(){
    return this.vehicleCost;
  }

  protected double getSpace(){
    return this.space;
  }

  protected int getPassengerCost(){
    return this.passengerCost;
  }

  protected int getTotalPassengers(){
    return this.totalPassengers;
  }

  public String getType(){
    return type;
  }

  protected abstract String VehicleInfo();

  protected List<Passenger> getPassengers(){
    for(int i = 0; i < getTotalPassengers();i++){
      passengerInVehicle.add(new Passenger(getPassengerCost()));
    }
    return passengerInVehicle;
  }
}
