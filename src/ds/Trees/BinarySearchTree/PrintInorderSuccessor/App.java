package ds.Trees.BinarySearchTree.PrintInorderSuccessor;

public class App {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(20);
        tree.Insert(8);
        tree.Insert(12);
        tree.Insert(4);
        tree.Insert(22);
        tree.Insert(10);
        tree.Insert(14);

        Node test = tree.root.left.right.right;

        tree.printInorderSucc(tree.root, test);
    }
}
