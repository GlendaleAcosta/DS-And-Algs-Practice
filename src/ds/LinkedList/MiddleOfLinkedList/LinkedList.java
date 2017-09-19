package ds.LinkedList.MiddleOfLinkedList;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printMiddle() {
        Node slowNode = head;
        Node fastNode = head;

        if (head != null) {
            while(slowNode != null & fastNode.next != null) {
                fastNode = fastNode.next.next;
                slowNode = slowNode.next;
            }
        }
        System.out.println(slowNode.data);
    }
}
