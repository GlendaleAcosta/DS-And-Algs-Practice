package ds2.Graphs.PrimMST;

public class Edge {
    public int weight;
    public Node adjNode;

    public Edge(int weight, Node n) {
        this.weight = weight;
        adjNode = n;
    }
}
