package ds.Trees.BinaryTree.BinaryTreePrintRoot2Leaf;

public class App {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.printPaths(tree.root);
    }
}
