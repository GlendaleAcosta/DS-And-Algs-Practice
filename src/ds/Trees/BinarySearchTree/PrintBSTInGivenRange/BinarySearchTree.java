package ds.Trees.BinarySearchTree.PrintBSTInGivenRange;

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

    public void printInRange(Node node, int k1, int k2) {
        if (node == null) return;

        if (k1 < node.data) {
            printInRange(node.left, k1, k2);
        }

        if (k1 <= node.data && k2 >= node.data) {
            System.out.print(node.data + " ");
        }

        if (k2 > node.data) {
            printInRange(node.right, k1, k2);
        }
    }
}
