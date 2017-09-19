package ds.Trees.BinarySearchTree.FindLowestCommonAncestor;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree(int data) {
        root = new Node(data);
    }

    public void Insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }

        if (data < node.data) {
            node.left = insertRec(node.left, data);
        } else if (data > node.data) {
            node.right = insertRec(node.right, data);
        }

        return node;
    }

    public void printInOrder(Node node) {
        if (node == null) return;

        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    public Node LCA(Node node, int n1, int n2) {
        if (node == null) return null;

        if (node.data > n1 && node.data > n2) {
            return LCA(node.left, n1, n2);
        }
        if (node.data < n1 && node.data < n2) {
            return LCA(node.right, n1, n2);
        }
        return node;
    }
}
