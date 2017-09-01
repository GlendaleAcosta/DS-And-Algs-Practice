package ds.LinkedList.BasicSinglyLinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;

        traverseList(list);
    }

    public static void traverseList(LinkedList list) {
        Node ptr = list.head;

        while(ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }
}
