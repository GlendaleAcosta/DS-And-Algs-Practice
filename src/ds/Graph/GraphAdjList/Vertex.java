package ds.Graph.GraphAdjList;

import java.util.LinkedList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{
    String name;
    List<Edge> adjList;
    int distance;
    Vertex predecessor;

    public Vertex(String name) {
        this.name = name;
        this.adjList = new LinkedList<>();
        this.predecessor = null;
    }

    @Override
    public int compareTo(Vertex v) {
        return Integer.compare(this.distance, v.distance);
    }
}
