package ds.Trees.BinarySearchTree.isBinarySearchTree;

public class App {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(4);
        tree.insert(2);
        tree.insert(1);
        tree.insert(0);
        tree.insert(3);

        tree.printInorder(tree.root);
        boolean isBinaryTree = tree.isBinaryTree();
        System.out.println(isBinaryTree);
    }
}
