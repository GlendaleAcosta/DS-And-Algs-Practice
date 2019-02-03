package ds2.Graphs.Dijkstra;

public class App {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addNode("A");
        g.addNode("B");
        g.addNode("C");
        g.addNode("D");
        g.addNode("E");

        Node A = g.getNode("A");
        Node B = g.getNode("B");
        Node C = g.getNode("C");
        Node D = g.getNode("D");
        Node E = g.getNode("E");

        A.addAdjacentNode(2, C);
        A.addAdjacentNode(4, B);

        B.addAdjacentNode(3, C);
        B.addAdjacentNode(2, D);
        B.addAdjacentNode(3, E);

        C.addAdjacentNode(1, B);
        C.addAdjacentNode(4, D);
        C.addAdjacentNode(5, E);

        E.addAdjacentNode(1, D);

        g.dijkstra("A", "E");
    }
}
