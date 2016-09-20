package rs222kn_FoST2.ferry;

public class Passenger {
  private int cost = 0;

  public Passenger(int cost){
    this.cost = cost;
  }

  public Passenger(){
    this.cost = 20;
  }

  public int getCost(){
    return this.cost;
  }
}
