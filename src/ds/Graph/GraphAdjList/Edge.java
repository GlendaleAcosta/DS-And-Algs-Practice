package ds.Graph.GraphAdjList;

public class Edge {
    Vertex startVertex;
    Vertex endVertex;
    int weight;

    public Edge(Vertex startVertex, Vertex endVertex, int weight) {
        this.startVertex = startVertex;
        this.endVertex = endVertex;
        this.weight = weight;
    }
}
