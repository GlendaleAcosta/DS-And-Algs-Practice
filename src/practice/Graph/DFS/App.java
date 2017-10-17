package practice.Graph.DFS;

public class App {
    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(0, 4);

        g.addEdge(1, 4);
        g.addEdge(1, 8);

        g.addEdge(3, 0);
        g.addEdge(3, 4);

        g.addEdge(4, 0);
        g.addEdge(4, 3);
        g.addEdge(4, 1);
        g.addEdge(4, 7);

        g.addEdge(6, 7);
        g.addEdge(6, 5);
        g.addEdge(6, 9);

        g.addEdge(7, 4);
        g.addEdge(7, 8);
        g.addEdge(7, 6);

        g.addEdge(8, 1);
        g.addEdge(8, 7);


        g.DFS();
    }
}
