package ds.Graph.PrimsLazyAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Prims {
    private List<Vertex> unvisitedVertices;
    private List<Edge> spanningTree;
    private PriorityQueue<Edge> edgePQ;
    private double fullCost;

    public Prims(List<Vertex> unvisitedList ) {
        this.spanningTree = new ArrayList<>();
        this.unvisitedVertices = unvisitedList;
        this.edgePQ = new PriorityQueue<>();
    }

    public void primsAlgorithm(Vertex vertex) {
        this.unvisitedVertices.remove(vertex);
        while(!unvisitedVertices.isEmpty()) {
            for(Edge edge: vertex.getAdjacencies()) {
                if (this.unvisitedVertices.contains(edge.getEndVertex())) {
                    this.edgePQ.add(edge);
                }

            }

            Edge minEdge = this.edgePQ.remove();

            this.spanningTree.add(minEdge);
            this.fullCost += minEdge.getWeight();

            vertex = minEdge.getEndVertex();
            this.unvisitedVertices.remove(vertex);
        }
    }

    public void printMST() {
        System.out.println("MST cost: " + this.fullCost);
        for(Edge edge: spanningTree) {
            System.out.println(edge.getStartVertex() + " - " + edge.getEndVertex());
        }
    }

}
