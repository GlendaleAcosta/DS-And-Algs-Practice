package ds.Graph.PrimsLazyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Vertex> vertexList = new ArrayList<>();

        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");

        vertexList.add(vertexA);
        vertexList.add(vertexB);
        vertexList.add(vertexC);

        vertexA.addEdge(new Edge(1, vertexA, vertexB));
        vertexA.addEdge(new Edge(1, vertexA, vertexC));
        vertexB.addEdge(new Edge(10, vertexB, vertexC));

        vertexB.addEdge(new Edge(1, vertexB, vertexA));
        vertexC.addEdge(new Edge(1, vertexC, vertexA));
        vertexC.addEdge(new Edge(10, vertexC, vertexB));

        Prims prim = new Prims(vertexList);
        prim.primsAlgorithm(vertexC);
        prim.printMST();
    }
}
