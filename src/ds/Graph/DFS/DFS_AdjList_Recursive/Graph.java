package ds.Graph.DFS.DFS_AdjList_Recursive;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int numOfVertices;
    private LinkedList<Integer> adj[];

    public Graph(int v) {
        numOfVertices = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void DFS(int v) {
        boolean visited[] = new boolean[numOfVertices];
        DFSUtil(v, visited);
    }

    private void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> it = adj[v].listIterator();
        while(it.hasNext()) {
            int n = it.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }
}
