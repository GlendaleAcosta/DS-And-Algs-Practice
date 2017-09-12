package ds.Trees.BinarySearchTree.BSTGetNodeCount;

public class App {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(8);
        tree.insert(2);
        tree.insert(12);
        tree.insert(0);
        tree.insert(9);

//        tree.printInOrder(tree.root);
        int size = tree.size();
        System.out.println(size);
    }
}
