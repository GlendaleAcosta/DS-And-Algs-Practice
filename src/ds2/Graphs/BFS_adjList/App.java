package ds2.Graphs.BFS_adjList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//        Node node5 = new Node(5);
//        Node node6 = new Node(6);
//        Node node7 = new Node(7);
//
//        // Create Graph
//        node1.push(node2);
//        node1.push(node3);
//        node1.push(node4);
//
//        node2.push(node5);
//
//        node4.push(node6);
//        node4.push(node7);

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

        node1.push(node2);
        node1.push(node5);
        node1.push(node6);

        node2.push(node3);
        node2.push(node4);

        node6.push(node7);
        node6.push(node8);

        node8.push(node9);
        node9.push(node10);



        HashSet<Node> visited = new HashSet<>();
        LinkedList<Node> queue = new LinkedList<>();

        queue.push(node1);
        visited.add(node1);

        while(queue.size() > 0) {
            Node curr = queue.poll();
            System.out.println(curr.data);
            Iterator<Node> it = curr.adj.listIterator();
            while(it.hasNext()) {
                Node n = it.next();
                if (!visited.contains(n)) {
                    visited.add(n);
                    queue.add(n);
                }
            }

        }
    }
}
