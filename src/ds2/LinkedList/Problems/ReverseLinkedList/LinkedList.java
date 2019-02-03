package ds2.LinkedList.Problems.ReverseLinkedList;

public class LinkedList {
    Node head;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

    public LinkedList(Node node) {
        head = node;
    }

    public void printList() {
        Node curr = head;
        while(curr != null) {
            System.out.print( curr.data + " -> ");
            curr = curr.next;
        }

        // prints null
        System.out.println(curr);
    }


    public void iterativeReverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void recursiveReverse(Node curr, Node next) {



    }

    public void pushBack(int value) {
        Node newNode = new Node(value);
        if (head == null)
            head = newNode;
        else {
            Node curr = this.head;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
}
