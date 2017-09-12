package ds.Trees.BinarySearchTree.isBinarySearchTree;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertNode(root, data);
    }

    public Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    public void printInorder(Node node) {
        if (node == null) return;

        printInorder(node.left);
        System.out.println(node.data);
        printInorder(node.right);
    }

    public int getMin() {
        Node current = this.root;
        while(current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int getMax() {
        Node current = this.root;
        while(current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public boolean isBinaryTree() {
        int min = getMin();
        int max = getMax();
        return this.isBSTUtil(root, min, max);
    }

    private boolean isBSTUtil(Node node, int min, int max) {
        if (node == null)
            return true;
        if (node.data < min || node.data > max)
            return false;
        return (isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right, node.data + 1, max));
    }
}
