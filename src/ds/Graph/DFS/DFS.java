package ds.Graph.DFS;

import java.util.List;
import java.util.Stack;

public class DFS {
    private Stack<Vertex> stack;

    public DFS() {
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex> vertexList) {
        for(Vertex v: vertexList) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsWithStack(v);
            }
        }
    }

    private void dfsWithStack(Vertex root) {
        stack.add(root);
        root.setVisited(true);

        while(!stack.isEmpty()) {
            Vertex actual = this.stack.pop();
            System.out.print(actual + " ");
            for(Vertex v: actual.getNeighborList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }
    }
}
