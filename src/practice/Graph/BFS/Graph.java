package practice.Graph.BFS;

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

    public void BFS(int s) {
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while(!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> it = adjList[s].iterator();
            while(it.hasNext()) {
                int n = it.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
