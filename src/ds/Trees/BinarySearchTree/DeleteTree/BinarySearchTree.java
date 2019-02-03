package ds.Trees.BinarySearchTree.DeleteTree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree(int data) {
        root = new Node(data);
    }

    public void Insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void printTreeInOrder(Node node) {
        if (node == null) return;

        printTreeInOrder(node.left);
        System.out.print(node.data + " ");
        printTreeInOrder(node.right);
        List<Integer> test = new ArrayList<>();
//        test.sort(10, new SortByStart());

    }

    public void deleteTree(Node node) {
        if (node == null) return;

        deleteTree(node.left);
        deleteTree(node.right);
        node = null;

        List<Integer> list = new ArrayList<>();
//        list.ad
    }
}

class SortByStart implements Comparator<Integer>
{

    public int compare(Integer p1, Integer p2)
    {
        return p1 - p2;
    }
}
