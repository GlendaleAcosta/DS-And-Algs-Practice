package ds2.Graphs.Dijkstra;

import java.util.LinkedList;

public class Node {
    public String name;
    public LinkedList<Edge> adjList;

    public Node(String name) {
        this.name = name;
        adjList = new LinkedList<>();
    }

    public void addAdjacentNode(int weight, Node n) {
        adjList.add(new Edge(weight, n));
    }
}
