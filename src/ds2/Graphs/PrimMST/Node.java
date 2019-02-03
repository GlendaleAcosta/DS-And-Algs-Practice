package ds2.Graphs.PrimMST;

import java.util.LinkedList;

public class Node {
    String name;
    public LinkedList<Edge> adjNodes;

    public Node(String name) {
        this.name = name;
        adjNodes = new LinkedList<>();
    }

    public void addAdjNode(Node n, int weight) {
        Edge e = new Edge(weight, n);
        this.adjNodes.add(e);
    }
}
