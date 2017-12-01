package ds.Graph.GraphAdjList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Graph {
    HashMap<String, Vertex> vertices;
    int size;
    int maxSize;

    public Graph(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        vertices = new HashMap<>(maxSize);
    }

    public Vertex getVertex(String letter) {
        return vertices.get(letter);
    }


    public void insertVertex(String letter) {
        if (size >= maxSize) return;
        Vertex newVertex = new Vertex(letter);
        vertices.put(letter, newVertex);
        size++;
    }

    public void addAnEdge(String vertexKey1, String vertexKey2, int weight) {
        Vertex vA = getVertex(vertexKey1);
        Vertex vB = getVertex(vertexKey2);

        vA.adjList.add(new Edge(vA, vB, weight));
        vB.adjList.add(new Edge(vB, vA, weight));
    }

    public void Dijkstra(String start, String end) {
        Vertex startV =  getVertex(start);

        PriorityQueue<Vertex> pQ = new PriorityQueue<>();
        for(String key : vertices.keySet()) {
            vertices.get(key).distance = Integer.MAX_VALUE;
        }

        startV.distance = 0;
        pQ.add(startV);

        while(!pQ.isEmpty()) {
            Vertex curr = pQ.poll();
            for(Edge edge: curr.adjList) {
                Vertex adjVertex = edge.endVertex;
                int potentialDist = curr.distance + edge.weight;
                if (potentialDist < adjVertex.distance) {
                    pQ.remove(adjVertex);
                    adjVertex.distance = potentialDist;
                    adjVertex.predecessor = curr;
                    pQ.add(adjVertex);
                }
            }
        }

        // print shortest path
        Vertex v = getVertex(end);
        System.out.println("Dijkstra's Shortest Path: ");
        printDijkstra(v);
    }

    private void printDijkstra(Vertex curr) {
        if (curr.predecessor == null) {
            System.out.print(curr.name + ", ");
        } else {
            printDijkstra(curr.predecessor);
            System.out.print(curr.name + ", ");
        }
    }


}
