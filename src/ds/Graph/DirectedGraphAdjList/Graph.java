package ds.Graph.DirectedGraphAdjList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Graph {
    int maxSize;
    int size;
    Map<String, Vertex> vertices;

    public Graph(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        vertices = new HashMap<>(maxSize);
    }

    public void insertVertex(String key) {
        Vertex v = new Vertex(key);
        vertices.put(key, v);
    }

    public Vertex getVertexPls(String key) {
        return vertices.get(key);
    }

    public void addEdge(String key1, String key2) {
        Vertex v1 = getVertexPls(key1);
        Vertex v2 = getVertexPls(key2);
        v1.adjList.add(v2);
    }

    public void Kahns() {
        Map<Vertex, Integer> inDegree = new HashMap<>();
        for(String key : vertices.keySet()) {
            Vertex v = this.getVertexPls(key);
            if (!inDegree.containsKey(v)) {
                inDegree.put(v, 0);
            }
            for(Vertex node : v.adjList) {
                if (!inDegree.containsKey(node)) {
                    inDegree.put(node, 0);
                }
                int updatedInDegree = inDegree.get(node) + 1;
                inDegree.remove(node);
                inDegree.put(node, updatedInDegree);
            }
        }
        Queue<Vertex> q = new LinkedList<>();
        for(Vertex v : inDegree.keySet()) {
            int i = inDegree.get(v);
            if (i == 0) {
                q.add(v);
            }
        }

        while(!q.isEmpty()) {
            Vertex u =  q.poll();
            for(Vertex v : u.adjList) {
                int updatedInDegree = inDegree.get(v) - 1;
                inDegree.remove(v);
                inDegree.put(v, updatedInDegree);
                if (updatedInDegree == 0) {
                    q.add(v);
                }
            }
            System.out.print(u.key + ", ");
        }
    }
}
