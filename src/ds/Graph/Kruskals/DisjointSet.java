package ds.Graph.Kruskals;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
    private int nodeCount = 0;
    private int setCount = 0;
    private List<Node> rootNodes; // representatives

    public DisjointSet(List<Vertex> vertices) {
        this.rootNodes = new ArrayList<>(vertices.size());
        makeSets(vertices);

    }

    public int find(Node n) {
        Node currentNode = n;
        while(currentNode.getParent() != null) {
            currentNode = currentNode.getParent();
        }
        Node rootNode = currentNode;

        currentNode = n;
        while(currentNode != rootNode) {
            Node temp = currentNode.getParent();
            currentNode.setParent(rootNode);
            currentNode = temp;
        }
        return rootNode.getId();
    }

    public void makeSets(List<Vertex> vertices) {
        for(Vertex v: vertices)
            makeSet(v);
    }

    public void makeSet(Vertex v) {
        Node n = new Node(0, rootNodes.size(), null);
        v.setNode(n);
        this.rootNodes.add(n);
        this.setCount++;
        this.nodeCount++;
    }

}
