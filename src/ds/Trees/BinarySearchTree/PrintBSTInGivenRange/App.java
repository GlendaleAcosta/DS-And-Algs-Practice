package ds.Trees.BinarySearchTree.PrintBSTInGivenRange;

public class App {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(20);
        tree.Insert(8);
        tree.Insert(22);
        tree.Insert(4);
        tree.Insert(12);

        tree.printInRange(tree.root, 2, 21 );
    }
}
