package ds.Trees.BinarySearchTree.DeleteTree;

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
    }

    public void deleteTree(Node node) {
        if (node == null) return;

        deleteTree(node.left);
        deleteTree(node.right);
        node = null;
    }
}
