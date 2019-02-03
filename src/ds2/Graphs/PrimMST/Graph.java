package ds2.Graphs.PrimMST;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    public HashMap<String, Node> vertices;

    public Graph() {
        vertices = new HashMap<>();
    }

    public void addNode(String name) {
        vertices.put(name, new Node(name));
    }

    public Node getNode(String name) {
        return vertices.get(name);
    }

    public void prims(Node n) {
        HashSet<Node> visited = new HashSet<>();

    }
}
