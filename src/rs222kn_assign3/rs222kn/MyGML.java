package rs222kn_assign3.rs222kn;

import rs222kn_assign3.graphs.DirectedGraph;
import rs222kn_assign3.graphs.GML;
import rs222kn_assign3.graphs.Node;

import java.util.Iterator;

public class MyGML<E> extends GML<E> {

  public MyGML(DirectedGraph<E> d){
    super(d);
  }

  @Override
  public String toGML() {
    String result = "graph [";
    // node
    int id = 0;
    Iterator graphIteratorNode = graph.iterator();
    while(graphIteratorNode.hasNext()){
      result += "\n\tnode [";
      result += "\n\t\tid " + id;
      result += "\n\t\tlabel \"" + graphIteratorNode.next() + "\"";
      result += "\n\t]";
      id++;
    }

    // edge
    Iterator graphIteratorEdge = graph.iterator();
    while(graphIteratorEdge.hasNext()){
      MyNode myNode = (MyNode)graphIteratorEdge.next();
      Iterator myNodeIterator = myNode.succsOf();
      while(myNodeIterator.hasNext()){
        result += "\n\tedge [";
        result += "\n\t\tsource " + myNode;
        result += "\n\t\ttarget " + myNodeIterator.next();
        result += "\n\t]";
      }
    }
    return result += "\n]";
  }
}
