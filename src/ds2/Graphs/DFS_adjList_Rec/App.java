package ds2.Graphs.DFS_adjList_Rec;

import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        // Create Graph
        node1.push(node2);
        node1.push(node3);
        node1.push(node4);

        node2.push(node5);

        node4.push(node6);
        node4.push(node7);

        DFS(node1);
    }

    public static void DFS(Node curr) {
        HashSet<Node> visited = new HashSet<>();
        visited.add(curr);

        dfsUtil(curr, visited);
    }

    public static void dfsUtil(Node n, HashSet<Node> visited) {
        visited.add(n);
        System.out.println(n.data);

        Iterator<Node> it = n.adj.listIterator();
        while(it.hasNext()) {
            Node curr = it.next();
            if (!visited.contains(curr)) {
                dfsUtil(curr, visited);
            }
        }
    }
}
