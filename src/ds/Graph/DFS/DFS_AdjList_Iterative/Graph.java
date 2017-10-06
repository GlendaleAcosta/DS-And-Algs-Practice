package ds.Graph.DFS.DFS_AdjList_Iterative;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Graph {
    int numOfVertices;
    LinkedList<Integer>[] adjList;


    public Graph(int v) {
        numOfVertices = v;
        adjList = new LinkedList[v];
        for(int i = 0; i < v; ++i)
            adjList[i] = new LinkedList<>();
    }

    public void addEdge(int v, int w) {
            adjList[v].add(w);
    }

    public void DFS(int s) {
        Vector<Boolean> visited = new Vector<>();
        for(int i = 0; i < numOfVertices; i++)
            visited.add(false);

        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while(!stack.empty()) {
            s = stack.peek();
            stack.pop();

            if (!visited.get(s)) {
                System.out.print(s + " ");
                visited.set(s, true);
            }

            Iterator<Integer> it = adjList[s].iterator();

            while(it.hasNext()) {
                int v = it.next();
                if (!visited.get(v))
                    stack.push(v);
            }
        }
    }

}
