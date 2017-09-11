package ds.Trees.BinarySearchTree.BSTFindMinValue;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {this.root = null;}

    public void insert(int data) {
        root = insertNode(root, data);
    }

    private Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertNode(root.left, data);
        else if (data > root.data)
            root.right = insertNode(root.right, data);

        return root;
    }

    public int getMin() {
        Node current = this.root;
        while(current.left != null) {
            current = current.left;
        }
        return current.data;
    }
}
