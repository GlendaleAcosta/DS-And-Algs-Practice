package ds2.Graphs.DFS_adjList_Iter;

import ds.Stack.Stack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);

        node1.add(node2);
        node1.add(node5);
        node1.add(node6);

        node2.add(node3);
        node2.add(node4);

        node6.add(node7);
        node6.add(node8);

        node8.add(node9);
        node9.add(node10);

        DFS(node1);


    }

    public static void DFS(Node curr) {
        HashSet<Node> visited = new HashSet<>();
        LinkedList<Node> stack = new LinkedList<>();

        stack.push(curr);
        visited.add(curr);

        while(!stack.isEmpty()) {
            Node n = stack.poll();
            System.out.println(n.data);
            Iterator<Node> it = n.adj.listIterator();
            while(it.hasNext()) {
                Node m = it.next();
                if (!visited.contains(m)) {
                    stack.push(m);
                }
            }
        }
    }
}
