package ds.LinkedList.ListSwapNodes;

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        list.swapNodes(2, 4);
        list.traverseList();
    }
}
