package ds.Graph.TopologicalSort.KahnsAlgorithm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Graph {
    private int v;
    private LinkedList<Integer> adj[];

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
    }

    public void topologicalSort() {
        int inDegree[]= new int [v];

        for(int i = 0; i < v; i++) {
            Iterator<Integer> it = adj[i].iterator();
            while(it.hasNext()) {
                int j = it.next();
                inDegree[j]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < v; i++) {
            if (inDegree[i] == 0)
                q.add(i);
        }

        while(!q.isEmpty()) {
            int u = q.poll();
            for(int node: adj[u]) {
                if(--inDegree[node] == 0)
                    q.add(node);
            }
            System.out.print(u + " ");
        }
    }
}
