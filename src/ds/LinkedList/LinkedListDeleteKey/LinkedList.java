package ds.LinkedList.LinkedListDeleteKey;

public class LinkedList {
    Node head;

    public void deleteKey(int data) {
        Node node = head;
        Node prevNode = null;

        if (node != null && node.data == data) {
            head = head.next;
            return;
        }

        while(node != null && node.data != data) {
            prevNode = node;
            node = node.next;
        }

        if (node == null) return;

        prevNode.next = node.next;
    }
}
