package ds.Trees.BinarySearchTree.BSTGetNodeCount;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        this.root = null;
    }

    public void insert(int key) {
        root = insertNode(root, key);
    }

    public Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertNode(root.left, key);
        else if (key > root.key)
            root.right = insertNode(root.right, key);
        return root;
    }

    public void printInOrder(Node node) {
        if (node == null) return;

        printInOrder(node.left);
        System.out.println(node.key);
        printInOrder(node.right);
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null)
            return 0;
        else
            return (size(node.left) + 1 + size(node.right));
    }

}
