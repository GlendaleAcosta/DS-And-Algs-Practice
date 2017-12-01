package ds.Graph.Dijkstra2;

public class App {
    public static void main(String[] args) {
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");

        vertexA.addNeighbor(new Edge(1, vertexA, vertexB));
        vertexA.addNeighbor(new Edge(3, vertexA, vertexC));
        vertexB.addNeighbor(new Edge(1, vertexB, vertexC));

        DijkstrasAlgorithm algorithm = new DijkstrasAlgorithm();
        algorithm.computePath(vertexA);

        System.out.println(algorithm.getShortestPathTo(vertexC));
    }
}
