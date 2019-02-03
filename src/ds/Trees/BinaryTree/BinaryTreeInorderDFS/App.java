package ds.Trees.BinaryTree.BinaryTreeInorderDFS;

// Inorder DFS_adjList_Rec
// not sure what inorder dfs is typically used for
public class App {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(6);

        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(8);

        tree.root.left.left.left = new Node(11);
        tree.root.left.left.right = new Node(12);

        tree.root.left.right.right = new Node(10);

        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(5);

        tree.root.right.right.left = new Node(13);
        tree.root.right.right.right = new Node(9);


        System.out.println("IN ORDER DFS_adjList_Rec");
        tree.printInorder(tree.root);
    }
}
