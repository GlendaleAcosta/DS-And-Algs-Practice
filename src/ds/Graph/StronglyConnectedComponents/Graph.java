package ds.Graph.StronglyConnectedComponents;

import ds.Graph.DFS.BasicDFS1.DFS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public Graph getTranspose() {
        Graph g = new Graph(V);
        for(int i = 0; i < V; i++) {
            Iterator<Integer> it = adj[i].listIterator();
            while(it.hasNext()) {
                g.adj[it.next()].add(i);
            }
        }
        return g;
    }

    public void fillOrder(int v, boolean visited[], Stack stack) {
        visited[v] = true;
        Iterator<Integer> i = adj[v].iterator();
        while(i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                fillOrder(n, visited, stack);
        }
        stack.push(new Integer(v));
    }

    public void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");
        int n;
        Iterator<Integer> i = adj[v].iterator();
        while(i.hasNext()) {
            n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    public void printSCCs() {
        Stack stack = new Stack();

        boolean visited[] = new boolean[V];
        for(int i = 0; i < V; i++)
            visited[i] = false;

        for(int i = 0; i < V; i++)
            if (visited[i] == false)
                fillOrder(i, visited, stack);

        Graph gr = getTranspose();

        for(int i = 0; i < V; i++)
            visited[i] = false;

        while(!stack.isEmpty()) {
            int v = (int)stack.pop();
            if (visited[v] == false) {
                gr.DFSUtil(v, visited);
                System.out.println();
            }

        }
    }
}
