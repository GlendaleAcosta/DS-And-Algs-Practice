package ds.Graph.GraphAdjList;

public class Edge implements Comparable<Edge>{
    Vertex startVertex;
    Vertex endVertex;
    int weight;

    public Edge(Vertex startVertex, Vertex endVertex, int weight) {
        this.startVertex = startVertex;
        this.endVertex = endVertex;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge otherEdge) {
        return Integer.compare(this.weight, otherEdge.weight);
    }
}
