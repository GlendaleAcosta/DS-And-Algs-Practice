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
    }
}
