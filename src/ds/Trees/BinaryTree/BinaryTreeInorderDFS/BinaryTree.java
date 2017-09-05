package ds.Trees.BinaryTree.BinaryTreeInorderDFS;

public class BinaryTree {
    Node root;

    BinaryTree(int data) {
        root = new Node(data);
    }

    public void printInorder(Node node) {
        if (node == null) return;

        printInorder(node.left);
        System.out.println(node.data);
        printInorder(node.right);
    }
}
