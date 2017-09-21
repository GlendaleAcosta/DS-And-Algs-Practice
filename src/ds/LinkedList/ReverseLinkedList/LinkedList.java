package ds.LinkedList.ReverseLinkedList;

public class LinkedList {
    Node head;

    public Node reverseLinkedList(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public void printReversed(Node node) {
        if (node == null) return;

        printReversed(node.next);
        System.out.print(node.data + " ");
    }

    public void printList() {
        Node node = this.head;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}