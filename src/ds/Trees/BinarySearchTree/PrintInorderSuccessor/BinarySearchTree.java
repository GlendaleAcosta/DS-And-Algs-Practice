package ds.Trees.BinarySearchTree.PrintInorderSuccessor;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree(int data) {
        root = new Node(data);
    }

    public void Insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public Node successor(Node root, Node n) {
        if (root == null)
            return null;

        if (root.data <= n.data) {
            return successor(root.right, n);
        } else {
            Node left = successor(root.left, n);
            return (left != null) ? left : root;
        }
    }

    public Node printInorderSucc(Node root, Node n) {
        if (n.right != null) {
            System.out.println(minValue(n.right).data);
            return minValue(n.right);
        }

        Node successor = null;

        while(root != null) {
            if (n.data < root.data) {
                successor = root;
                root = root.left;
            } else if (n.data > root.data) {
                root = root.right;
            } else {
                break;
            }
        }

        System.out.println(successor.data);
        return successor;
    }

    public Node minValue(Node node) {
        Node current = node;

        while(current.left != null) {
            current = current.left;
        }

        return current;
    }


}
