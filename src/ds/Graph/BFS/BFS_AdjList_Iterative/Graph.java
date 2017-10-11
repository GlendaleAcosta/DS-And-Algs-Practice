package ds.Graph.BFS.BFS_AdjList_Iterative;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    int vertices;
    LinkedList<Integer> adjList[];

    public Graph(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for(int i = 0; i < v; i++)
            adjList[i] = new LinkedList<>();
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    public void bfs(int node) {
        boolean [] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[node] = true;
        queue.add(node);

        while(!queue.isEmpty()) {
            node = queue.pop();
            System.out.print(node + " ");

            Iterator<Integer> it = adjList[node].listIterator();
            while(it.hasNext()) {
                int v = it.next();
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }

    }
}
