package ds2.Graphs.DFS_adjList_Rec;

import java.util.LinkedList;

public class Node {
    public int data;
    public LinkedList<Node> adj;

    public Node(int n) {
        data = n;
        adj = new LinkedList<>();
    }

    public void push(Node n) {
        adj.add(n);
    }
}
