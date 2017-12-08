package ds.Graph.GraphAdjList;

public class App {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.insertVertex("A");
        graph.insertVertex("B");
        graph.insertVertex("C");
        graph.insertVertex("D");
        graph.insertVertex("E");
        graph.insertVertex("F");

        graph.addAnEdge("A", "B", 1);
        graph.addAnEdge("A", "C", 4);
        graph.addAnEdge("B", "C", 2);
        graph.addAnEdge("B", "E", 7);
        graph.addAnEdge("C", "D", 2);
        graph.addAnEdge("D", "E", 2);
        graph.addAnEdge("D", "F", 4);
        graph.addAnEdge("E", "F", 1);

        graph.Dijkstra("A", "F");

        graph.Prim("A");


        Graph graph2 = new Graph(6);
        graph2.insertVertex("A");
        graph2.insertVertex("B");
        graph2.insertVertex("C");
        graph2.insertVertex("D");
        graph2.insertVertex("E");
        graph2.insertVertex("F");

        graph2.addAnEdge("A", "B", 1);
        graph2.addAnEdge("B", "C", 1);
        graph2.addAnEdge("C", "D", 1);
        graph2.addAnEdge("D", "E", 1);
        graph2.addAnEdge("E", "F", 1);
        graph2.addAnEdge("F", "A", 1);

        boolean isBipartite = graph2.isBipartite();
        System.out.println("Bipartite: " + isBipartite);
    }
}
