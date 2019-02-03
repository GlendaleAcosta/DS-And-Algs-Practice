package ds.Trees.BinaryTree.BinaryTreePostorderDFS;

// PostOrder DFS_adjList_Rec
// Typically used for deleting the tree

public class App {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("POST ORDER DFS_adjList_Rec");
        tree.printPostOrder(tree.root);
    }

}
