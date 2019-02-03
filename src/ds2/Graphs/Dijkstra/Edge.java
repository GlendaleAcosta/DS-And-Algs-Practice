package ds2.Graphs.Dijkstra;

public class Edge {
    public Node adjNode;
    public int weight;

    public Edge(int weight, Node node) {
        this.weight = weight;
        this.adjNode = node;
    }
}
