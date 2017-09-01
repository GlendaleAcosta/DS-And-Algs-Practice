package ds.LinkedList.LinkedListDeleteKey;

// Given a ‘key’, delete the first occurrence of this key in linked list.

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        list.head.next = second;
        second.next = third;
        third.next = fourth;

        list.deleteKey(2);
        printList(list);
    }

    public static void printList(LinkedList list) {
        Node node = list.head;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

}
