package ds2.Graphs.BFS_adjList;

import java.util.LinkedList;

public class Node {
    public LinkedList<Node> adj;
    public int data;

    public Node(int n) {
        adj = new LinkedList<Node>();
        data = n;
    }

    public void push(Node n) {
        adj.push(n);
    }
}
