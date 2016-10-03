package rs222kn_assign3.rs222kn;

import rs222kn_assign3.graphs.DirectedGraph;
import rs222kn_assign3.graphs.GML;

/**
 * Created by richardsoderman on 2016-09-30.
 */
public class MyGML<E> extends GML<E> {

  public MyGML(DirectedGraph<E> d){
    super(d);
  }

  @Override
  public String toGML() {
    return null;
  }
}
