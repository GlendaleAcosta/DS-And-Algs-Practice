package ds.Graph.TopologicalSort.BasicTopologicalSort;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    private int v; // # of vertices
    private LinkedList<Integer> adj[]; // adjacency list

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void topologicalSort() {
        Stack stack = new Stack();

        boolean visited[] = new boolean[v];

        for(int i = 0; i < v; i++)
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);

        while(!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private void topologicalSortUtil(int v, boolean visited[], Stack stack) {
        visited[v] = true;
        int i;

        Iterator<Integer> it = adj[v].iterator();
        while(it.hasNext()) {
            i = it.next();
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }

        stack.push(new Integer(v));
    }

}
