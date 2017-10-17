package practice.Graph.DFS;

import java.util.Iterator;
import java.util.LinkedList;
// Answer: 0 2 3 4 1 8 7 6 5 9
public class Graph {
    int vertices;
    int size;
    LinkedList<Integer>[] adjList;

    public Graph(int v) {
        vertices = v;
        size = 0;
        adjList = new LinkedList[v];
        for(int i = 0; i < v; i++)
            adjList[i] = new LinkedList<>();
    }

    public void addEdge(int i, int w) {
        adjList[i].add(w);
    }

    public void DFS() {
        boolean visited [] = new boolean[vertices];

        for(int i = 0; i < vertices; i++)
            if(!visited[i])
                DFSUtil(i, visited);
    }

    private void DFSUtil(int i, boolean[] visited) {
        visited[i] = true;
        System.out.print(i + " ");

        Iterator<Integer> it = adjList[i].iterator();
        while(it.hasNext()) {
            int n = it.next();
            if(!visited[n])
                DFSUtil(n, visited);
        }
    }
}
