package ds.Graph.DirectedGraphAdjList;

import java.util.*;

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

    // STRONGLY CONNECTED COMPONENT SHIET
    // AKA MUTHFRACKIN KOSARAJU'S ALGORITHM SHIET
    // ------------------------------------
    private void fillOrder(String key, HashSet<String> visited, Stack<String> stack) {
        Vertex curr = this.getVertexPls(key);
        visited.add(key);

        Iterator<Vertex> it = curr.adjList.iterator();
        while(it.hasNext()) {
            Vertex v = it.next();
            if (!visited.contains(v.key)) {
                fillOrder(v.key, visited, stack);
            }
        }

        stack.push(key);
    }

    private Graph getTranspose() {
        Graph g = new Graph(this.size);
        for(String key : this.vertices.keySet()) {
            Vertex v = this.getVertexPls(key);
            if (!g.vertices.containsKey(key)) {
                g.insertVertex(key);
            }
            Iterator<Vertex> it = v.adjList.iterator();
            while(it.hasNext()) {
                String key2 = it.next().key;
                if (!g.vertices.containsKey(key2)) {
                    g.insertVertex(key2);
                }
                g.addEdge(key2, key);
            }
        }

        return g;
    }

    private void dfsUtil(Vertex v, HashSet<String> visited) {
        visited.add(v.key);
        System.out.print(v.key + " ");

        Iterator<Vertex> it = v.adjList.iterator();
        while(it.hasNext()) {
            Vertex next = it.next();
            if (!visited.contains(next.key)) {
                dfsUtil(next, visited);
            }
        }
    }

    public void printSCC() {
        Stack<String> stack = new Stack<>();

        HashSet<String> visited = new HashSet<>(this.size);

        for(String key : vertices.keySet()) {
            if (!visited.contains(key)) {
                fillOrder(key, visited, stack);
            }
        }

        Graph graph2 = this.getTranspose();

        visited.clear();

        while(!stack.isEmpty()) {
            String currKey = stack.pop();
            if (!visited.contains(currKey)) {
                System.out.print("SCC: ");
                Vertex transposedCurr = graph2.getVertexPls(currKey);
                graph2.dfsUtil(transposedCurr, visited);
                System.out.println();
            }
        }
    }

}
