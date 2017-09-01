package ds.LinkedList.LinkedListDeleteKey;

public class LinkedList {
    Node head;

    public void deleteKey(int data) {
        Node node = head;
        Node prevNode = null;
        while(node != null) {
            if (node.data == data) {
                if (prevNode != null) {
                    prevNode.next = node.next;
                } else {
                    head = head.next;
                }
            }
            prevNode = node;
            node = node.next;
        }
    }
}
