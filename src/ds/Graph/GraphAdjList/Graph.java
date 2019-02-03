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
        // get starting vertex
        // create priority queue
        // set all vertices to have a distance of infinity
        // set starting vertex distance to 0
        // add starting vertex to priority queue
        // while priority queue is not empty
        //      pop the queue and get the node
        //      go through its adjacent list and get the edges and vertices
        //      get the tempDistance = currDistance + edge.weight
        //      if (tempDistance < otherVertex.distance)
        //          remove otherVertex from priority Queue if it's in there
        //          set otherVertex's distance to be the tempDistance
        //          set otherVertex's predecessor to be the current Node
        //          Add otherVertex to priorityQueue


        // To Print:
        // Start from the last node
        // Recursively check the predecessor and print the data
        // if the node is null, do nothing

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

    public boolean isBipartite() {
        Map<String, Integer> colorHash = new HashMap<>();
        for(String key: vertices.keySet())
            colorHash.put(key, -1);

        for(String key: vertices.keySet()) {
            if (colorHash.get(key) == -1)
                if (isBipartiteUtil(key, colorHash) == false)
                    return false;
        }

        return true;
    }

    public boolean isBipartiteUtil(String src, Map<String, Integer> colorHash) {
        colorHash.remove(src);
        colorHash.put(src, -1);

        LinkedList<Vertex> q = new LinkedList<>();
        q.add(this.getVertex(src));

        while(!q.isEmpty()) {
            Vertex u = q.poll();

            for(Edge e : u.adjList) {
                String key2 = e.endVertex.name;
                if (colorHash.get(key2) == -1) {
                    colorHash.remove(key2);
                    colorHash.put(key2, 1 - colorHash.get(u.name));
                    q.push(this.getVertex(key2));
                } else if (colorHash.get(key2) == colorHash.get(u.name)) {
                    return false;
                }
            }
        }
        return true;
    }
}
