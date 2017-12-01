package ds.Graph.Dijkstra2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {
    public void computePath(Vertex sourceVertex) {
        sourceVertex.setDistance(0);
        PriorityQueue<Vertex> pQ = new PriorityQueue<>();
        pQ.add(sourceVertex);

        while(!pQ.isEmpty()) {
            Vertex currentVertex = pQ.poll();

            for(Edge edge: currentVertex.getAdjacenciesList()) {
                Vertex v = edge.getEndVertex();

                double newDistance = currentVertex.getDistance() + edge.getWeight();
                if (newDistance < v.getDistance()) {
                    pQ.remove(v);
                    v.setDistance(newDistance);
                    v.setPredecessor(currentVertex);
                    pQ.add(v);
                }
            }
        }
    }

    public List<Vertex> getShortestPathTo(Vertex targetVertex) {
        List<Vertex> shortestPathToTarget = new ArrayList<>();
        for(Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()) {
            shortestPathToTarget.add(vertex);
        }

        Collections.reverse(shortestPathToTarget);
        return shortestPathToTarget;
    }
}
