package ds2.LinkedList.SinglyLinkedList;

public class LinkedList {
    Node head;


    public LinkedList() {
        this.head = null;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public void printList() {
        Node curr = this.head;
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
