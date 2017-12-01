package practice.Graph.BEEEFFSSSS;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    int V;
    LinkedList<Integer> adj[];

    public Graph(int vertices) {
        V = vertices;
        adj = new LinkedList[V];
        for(int i = 0; i < V; i++)
            adj[i] = new LinkedList<>();
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void BFS(int v) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

//        visited[v] = true;
        queue.add(v);

        while(!queue.isEmpty()) {
            v = queue.poll();
            visited[v] = true;
            System.out.print(v + " ");

            Iterator<Integer> it = adj[v].listIterator();
            while(it.hasNext()){
                int n = it.next();
                if (!visited[n]) {
                    queue.add(n);
//                    visited[n] = true;
                }
            }

        }
    }
}
