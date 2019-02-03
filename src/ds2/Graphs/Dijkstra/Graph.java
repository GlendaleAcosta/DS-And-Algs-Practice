package ds2.Graphs.Dijkstra;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Graph {
    public HashMap<String, Node> map;

    public Graph() {
        map = new HashMap<>();
    }

    public void addNode(String name) {
        map.put(name, new Node(name));
    }

    public Node getNode(String name) {
        return map.get(name);
    }

    public void dijkstra(String name, String endName) {
        Node start = this.getNode(name);
        PriorityQueue<Node> PQ = new PriorityQueue<>();

        HashMap<String, Integer> distances = new HashMap<>();
        HashMap<Node, Node> predecessors = new HashMap<>();
        for(String key : map.keySet())  {
            distances.put(key, Integer.MAX_VALUE);
        }

        distances.remove(start);
        distances.put(start.name, 0);

        PQ.add(start);

        while(!PQ.isEmpty()) {
            Node curr = PQ.poll();
            for(Edge e : curr.adjList) {
                int potentialDist = distances.get(curr.name) + e.weight;
                if (potentialDist < distances.get(e.adjNode.name)) {
                    PQ.remove(e.adjNode);
                    distances.remove(e.adjNode.name);
                    distances.put(e.adjNode.name, potentialDist);
                    predecessors.remove(e.adjNode);
                    predecessors.put(e.adjNode, curr);
                    System.out.println(e.adjNode.name);
                    PQ.add(e.adjNode);
                }
            }
        }

        Node n = map.get(endName);
        printDijkstra(n, predecessors);
    }

    private void printDijkstra(Node curr, HashMap<Node, Node> predecessors) {
        if (predecessors.get(curr) == null) {
            System.out.print(curr.name + ", ");
        } else {
            printDijkstra(predecessors.get(curr), predecessors);
            System.out.print(curr.name + ", ");
        }
    }
}
