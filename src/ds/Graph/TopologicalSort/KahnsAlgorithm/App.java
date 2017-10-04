package ds.Graph.TopologicalSort.KahnsAlgorithm;

public class App {
    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.addEdge(0, 1);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.addEdge(6, 1);
        g.addEdge(6, 2);

        g.topologicalSort();
        // 0 = A
        // 1 = B
        // 2 = C
        // 3 = D
        // 4 = E
        // 5 = F
        // 6 = Do

//        Graph g = new Graph(6);
//        g.addEdge(5, 2);
//        g.addEdge(5, 0);
//        g.addEdge(4, 0);
//        g.addEdge(4, 1);
//        g.addEdge(2, 3);
//        g.addEdge(3, 1);
//
//        g.topologicalSort();
    }
}
