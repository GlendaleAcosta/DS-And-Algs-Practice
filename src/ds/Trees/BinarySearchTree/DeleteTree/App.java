package ds.Trees.BinarySearchTree.DeleteTree;

public class App {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(5);
        tree.Insert(2);
        tree.Insert(7);
        tree.Insert(1);
        tree.Insert(9);
        tree.Insert(10);
        tree.Insert(11);
        tree.Insert(3);

        tree.printTreeInOrder(tree.root);
        System.out.println(" ");

        tree.deleteTree(tree.root);
        tree.root = null;

        tree.printTreeInOrder(tree.root);
    }
}
