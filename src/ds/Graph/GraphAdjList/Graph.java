package ds.Graph.GraphAdjList;

import java.util.*;

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
        Vertex startV = getVertex(start);

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
        System.out.println();
        System.out.println();
    }

    private void printDijkstra(Vertex curr) {
        if (curr.predecessor == null) {
            System.out.print(curr.name + ", ");
        } else {
            printDijkstra(curr.predecessor);
            System.out.print(curr.name + ", ");
        }
    }

    public void Prim(String key) {

        List<Edge> spanningTree = new ArrayList<>();
        HashSet<Vertex> visited = new HashSet<>(this.size);
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        Vertex curr = this.getVertex(key);
        visited.add(curr);
        int totalCost = 0;

        while(visited.size() < this.size) {
            for(Edge edge : curr.adjList)
                if (!visited.contains(edge.endVertex))
                    pQ.add(edge);

            Edge minEdge = pQ.remove();
            spanningTree.add(minEdge);
            totalCost += minEdge.weight;

            curr = minEdge.endVertex;
            visited.add(curr);
        }

        // print MST
        this.printPrim(totalCost, spanningTree);
    }


    private void printPrim(int totalCost, List<Edge> spanningTree) {
        System.out.println("Prim's Algorithm MST");
        System.out.println("MST cost: " + totalCost);
        for(Edge edge: spanningTree) {
            System.out.print("[" + edge.startVertex.name + " - " + edge.endVertex.name + "], ");
        }
        System.out.println();
    }
}
