package ds2.Graphs.DFS_adjList_Iter;

import java.util.LinkedList;

public class Node {
    public int data;
    public LinkedList adj;

    public Node(int n) {
        data = n;
        adj = new LinkedList();
    }

    public void add(Node n) {
        adj.add(n);
    }
}
