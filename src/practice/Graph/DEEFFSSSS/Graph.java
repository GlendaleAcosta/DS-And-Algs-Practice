package practice.Graph.DEEFFSSSS;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    int V;
    LinkedList<Integer> adj [];

    public Graph(int vertices) {
        V = vertices;
        adj = new LinkedList[vertices];
        for(int i = 0; i < vertices; i++)
            adj[i] = new LinkedList<>();
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Search everything
    public void DeeFS() {
        boolean visited[] = new boolean[V];
        for(int i = 0; i < V; i++) {
            if (!visited[i]) {
                DeeFSUtil(visited, i);
                System.out.println();
            }
        }
    }

    // search from a node
    public void DeeFS(int v) {
        boolean visited[] = new boolean[V];

        DeeFSUtil(visited, v);
    }

    public void DeeFSUtil(boolean visited[], int v) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> it = adj[v].listIterator();
        while(it.hasNext()) {
            int n = it.next();
            if (!visited[n])
                DeeFSUtil(visited, n);
        }
    }
}
