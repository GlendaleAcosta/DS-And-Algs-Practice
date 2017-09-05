package ds.Trees.BinaryTree.BinaryTreePreorderDFS;

public class BinaryTree {
    Node root;

    BinaryTree(int key) {
        root = new Node(key);
    }

    public void printPreorder(Node node) {
        if (node == null) return;

        System.out.println(node.key);
        printPreorder(node.left);
        printPreorder(node.right);
    }
}
