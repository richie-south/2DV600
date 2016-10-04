package rs222kn_assign3.rs222kn;

/**
 * Created by richardsoderman on 2016-10-04.
 */

import rs222kn_assign3.graphs.DFS;
import rs222kn_assign3.graphs.DirectedGraph;
import rs222kn_assign3.graphs.Node;

import java.util.List;

public class MyDFS<T> implements DFS<Integer> {

  @Override
  public List<Node<Integer>> dfs(DirectedGraph<Integer> graph, Node<Integer> root) {
    return null;
  }

  @Override
  public List<Node<Integer>> dfs(DirectedGraph<Integer> graph) {
    return null;
  }

  @Override
  public List<Node<Integer>> postOrder(DirectedGraph<Integer> g, Node<Integer> root) {
    return null;
  }

  @Override
  public List<Node<Integer>> postOrder(DirectedGraph<Integer> g) {
    return null;
  }

  @Override
  public List<Node<Integer>> postOrder(DirectedGraph<Integer> g, boolean attach_dfs_number) {
    return null;
  }

  @Override
  public boolean isCyclic(DirectedGraph<Integer> graph) {
    return false;
  }

  @Override
  public List<Node<Integer>> topSort(DirectedGraph<Integer> graph) {
    return null;
  }

}
