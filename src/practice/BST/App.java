package practice.BST;

public class App {
    public static void main(String[] args) {
        BST bst = new BST(50);
        bst.addNode(23);
        bst.addNode(30);
        bst.addNode(26);
        bst.addNode(37);
        bst.addNode(15);
        bst.addNode(7);
        bst.addNode(19);
        bst.addNode(75);
        bst.addNode(90);
        bst.addNode(88);
        bst.addNode(99);
        bst.addNode(65);
        bst.addNode(64);
        bst.addNode(69);

        bst.inOrderDFS(bst.root);
        System.out.println();

        int min = bst.findMin(bst.root);
        System.out.println(min);

        int count =  bst.getNodeCount(bst.root, 0);
        System.out.println(count);

        Node lca = bst.getLCA(bst.root, 19, 26);
        System.out.println("LCA: " + lca.data);


        bst.printInOrderSuccessor(bst.root, 37);
    }
}
