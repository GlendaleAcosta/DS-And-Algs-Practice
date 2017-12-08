package ds.Graph.DirectedGraphAdjList;

import java.util.LinkedList;

public class Vertex {
    LinkedList<Vertex> adjList;
    String key;

    public Vertex(String key) {
        this.key = key;
        adjList = new LinkedList<>();
    }
}
