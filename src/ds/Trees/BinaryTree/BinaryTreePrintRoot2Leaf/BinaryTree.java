package ds.Trees.BinaryTree.BinaryTreePrintRoot2Leaf;

public class BinaryTree {
    Node root;

    public BinaryTree(int data) {
        root = new Node(data);
    }

    public void printPaths(Node node) {
        int path[] = new int[1000];
        printPathsRecurs(node, path, 0);
    }

    private void printPathsRecurs(Node node, int path[], int pathLen) {
        if(node == null) return;

        path[pathLen] = node.data;
        pathLen++;

        if(node.left == null && node.right == null) {
            for(int i = 0; i < pathLen; i++) {
                System.out.print(path[i] + " ");
            }
            System.out.println(" ");
        } else {
            printPathsRecurs(node.left, path, pathLen);
            printPathsRecurs(node.right, path, pathLen);
        }
    }
}
