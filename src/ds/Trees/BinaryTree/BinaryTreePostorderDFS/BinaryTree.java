package ds.Trees.BinaryTree.BinaryTreePostorderDFS;

public class BinaryTree {
    Node root;

    BinaryTree(int key) {
        root = new Node(key);
    }

    public void printPostOrder(Node node) {
        if (node == null) return;

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.key + " ");
    }
}
