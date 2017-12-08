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

        g.Kahns();
    }
}
