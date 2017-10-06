package ds.Graph.DijkstrasAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {

    public void computePath(Vertex sourceVertex) {
        sourceVertex.setDistance(0);
        PriorityQueue<Vertex> pQueue = new PriorityQueue<>();
        pQueue.add(sourceVertex);

        while(!pQueue.isEmpty()) {
            Vertex actualVertex = pQueue.poll();

            for(Edge edge: actualVertex.getAdjacenciesList()) {
                Vertex v = edge.getTargetVertex();
                double newDistance = actualVertex.getDistance() + edge.getWeight();
                if (newDistance < v.getDistance()) {
                    pQueue.remove(v);
                    v.setDistance(newDistance);
                    v.setPredecessor(actualVertex);
                    pQueue.add(v);
                }
            }

        }
    }

    public List<Vertex> getShortestPathTo(Vertex targetVertex) {
        List<Vertex> shortestPathToTarget = new ArrayList<>();

        for(Vertex v = targetVertex; v != null; v = v.getPredecessor()) {
            shortestPathToTarget.add(v);
        }

        Collections.reverse(shortestPathToTarget);
        return shortestPathToTarget;
    }
}
