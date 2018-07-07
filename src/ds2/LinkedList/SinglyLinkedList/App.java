package ds2.LinkedList.SinglyLinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        list.head = node1;
        node1.next = node2;
        node2.next = node3;

        list.printList();

        int size = list.size();
        System.out.println("size: " + size);

        System.out.println("isEmpty: " + list.isEmpty());

        System.out.println("value_at: " + list.value_at(2)); // should be 3

        list.pushFront(0);
        list.printList();

        list.pushBack(4);
        list.printList();

        int lastNode = list.popBack();
        System.out.println(lastNode);
        list.printList();

        int front = list.frontVal();
        System.out.println(front);

        int back = list.back();
        System.out.println(back);

        list.insertNode(2, 99);
        list.printList();
    }
}
