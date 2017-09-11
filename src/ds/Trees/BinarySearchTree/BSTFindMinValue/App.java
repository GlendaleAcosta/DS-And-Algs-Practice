package ds.Trees.BinarySearchTree.BSTFindMinValue;

public class App {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);
        tree.insert(10);
        tree.insert(2);
        tree.insert(9);
        tree.insert(1);
        tree.insert(0);
        tree.insert(8);
        tree.insert(7);
        tree.insert(3);
        int min = tree.getMin();
        System.out.println(min + " is the min value.");
        int max = tree.getMax();
        System.out.println(max + " is the max value.");
    }
}
