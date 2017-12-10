package ds.Graph.DirectedGraphAdjList;

public class App {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.insertVertex("A");
        g.insertVertex("B");
        g.insertVertex("C");
        g.insertVertex("D");
        g.insertVertex("E");
        g.insertVertex("F");

        g.addEdge("F", "A");
        g.addEdge("F", "C");

        g.addEdge("E", "A");
        g.addEdge("E", "B");

        g.addEdge("C", "D");

        g.addEdge("D", "B");

//        g.Kahns();

        Graph g2 = new Graph(5);
        g2.insertVertex("A");
        g2.insertVertex("B");
        g2.insertVertex("C");
        g2.insertVertex("D");
        g2.insertVertex("E");

        g2.addEdge("B", "A");
        g2.addEdge("A", "C");
        g2.addEdge("C", "B");
        g2.addEdge("A", "D");
        g2.addEdge("D", "E");

        g2.printSCC();

    }
}
