package ds.Trees.BinaryTree.BinaryTreeBFS;

public class BinaryTree {
    Node root;

    BinaryTree(int data) {
        root = new Node(data);
    }

    public void printLevelOrder() {
        int h = height(root);

        for(int i = 1; i <= h; i++) {
            printGivenLevel(root, i);
        }
    }

    private int height(Node root) {
        if (root == null) return 0;
        else {
            int lHeight = height(root.left);
            int rHeight = height(root.right);

            if (lHeight > rHeight) return lHeight + 1;
            else return rHeight + 1;
        }
    }

    private void printGivenLevel(Node root, int level) {
        if (root == null) return;
        if (level == 1) System.out.println(root.key);
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }

    }
}
