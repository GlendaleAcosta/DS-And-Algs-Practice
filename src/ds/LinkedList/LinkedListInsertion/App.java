package ds.LinkedList.LinkedListInsertion;

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;
        list.addToFront(new Node(0));

        list.traverseList(list);
    }
}
