package ds.Trees.BinarySearchTree.FindLowestCommonAncestor;
// Computation of lowest common ancestors may be useful, for instance,
// as part of a procedure for determining the distance between pairs of nodes in a tree
public class App {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(5);
        tree.Insert(20);
        tree.Insert(8);
        tree.Insert(22);
        tree.Insert(4);
        tree.Insert(12);
        tree.Insert(10);
        tree.Insert(14);

        tree.printInOrder(tree.root);
        System.out.println("");

        Node lca3 = tree.LCA(tree.root, 14, 12);
        System.out.println(lca3.data);

        Node lca1 = tree.LCA(tree.root, 14, 8);
        System.out.println(lca1.data);

        Node lca2 = tree.LCA(tree.root, 10, 22);
        System.out.println(lca2.data);

    }
}
