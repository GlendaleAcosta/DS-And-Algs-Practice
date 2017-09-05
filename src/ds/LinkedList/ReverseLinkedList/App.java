package ds.LinkedList.ReverseLinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fif = new Node(5);

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fif;

//        list.reverseList(list.head);
//        list.traverseList(list);
    }
}
