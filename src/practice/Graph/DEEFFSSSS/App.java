package practice.Graph.DEEFFSSSS;

public class App {
    public static void main(String[] args) {
        Graph g = new Graph(14);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 5);

        g.addEdge(1, 0);
        g.addEdge(1, 2);
        g.addEdge(1, 4);

        g.addEdge(2, 0);
        g.addEdge(2, 1);

        g.addEdge(3, 4);
        g.addEdge(3, 7);

        g.addEdge(4, 1);
        g.addEdge(4, 3);
        g.addEdge(4, 7);

        g.addEdge(5, 0);

        g.addEdge(6, 9);

        g.addEdge(7, 3);
        g.addEdge(7, 4);
        g.addEdge(7, 8);
        g.addEdge(7, 9);

        g.addEdge(8, 7);

        g.addEdge(9, 6);


        //
        g.addEdge(10, 11);
        g.addEdge(10, 13);

        g.addEdge(11, 10);
        g.addEdge(11, 12);

        g.addEdge(12, 11);

        g.addEdge(13, 10);

        g.DeeFS(0);
    }
}
