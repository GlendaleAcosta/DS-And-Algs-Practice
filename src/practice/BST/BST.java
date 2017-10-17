package practice.BST;

import java.util.LinkedList;
import java.util.Stack;

public class BST {
    Node root;

    public BST(int data) {
        root = new Node(data);
    }

    public void addNode(int data) {
        root = addNodeRec(root, data);
    }

    private Node addNodeRec(Node curr, int data) {
        if (curr == null)
            return new Node(data);

        if (data < curr.data)
            curr.left = addNodeRec(curr.left, data);
        else if (data > curr.data)
            curr.right = addNodeRec(curr.right, data);

        return curr;
    }


    public void inOrderDFS(Node root) {
        if (root == null)
            return;

        inOrderDFS(root.left);
        System.out.print(root.data + " ");
        inOrderDFS(root.right);
    }

    public int findMin(Node root) {
        if (root.left != null)
            return findMin(root.left);

        return root.data;
    }

    public int getNodeCount(Node root, int count) {
        if (root == null)
            return count;

        count = getNodeCount(root.left, count);
        count++;
        count = getNodeCount(root.right, count);
        return count;
    }

    public Node getLCA(Node root, int n1, int n2) {
        if (root == null)
            return null;

        if (root.data > n1 && root.data > n2)
            return getLCA(root.left, n1, n2);
        if (root.data < n1 && root.data < n2)
            return getLCA(root.right, n1, n2);

        return root;
    }

    public void printInOrderSuccessor(Node root, int n) {
        LinkedList<Node> stack = new LinkedList<>();
        root = printInOrderSuccessorRec(root, n, stack);
        if (root == null) {
            return;
        }
        if (root.right != null) {
            int min = findMin(root.right);
            System.out.println(n + " - " + min);
            return;
        }
        else {
            while(!stack.isEmpty()) {
                Node top = stack.poll();
                if (top.data > n) {
                    System.out.println(n + " - " + top.data);
                    return;
                }
            }
        }

    }

    public Node printInOrderSuccessorRec(Node root, int n, LinkedList stack) {
        if (root == null)
            return null;
        if (root.data > n) {
            stack.push(root);
            return printInOrderSuccessorRec(root.left, n, stack);
        }
        if (root.data < n) {
            stack.push(root);
            return printInOrderSuccessorRec(root.right, n, stack);
        }
        return root;
    }

}
