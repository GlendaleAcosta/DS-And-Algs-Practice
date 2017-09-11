package ds.Trees.BinarySearchTree;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = this.insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public void printInorder(Node node) {
        if (node == null) return;

        printInorder(node.left);
        System.out.println(node.key);
        printInorder(node.right);
    }
}
