package ds.LinkedList.LinkedListInsertion;

public class LinkedList {
    Node head;

    public void addToFront(Node newNode) {
        newNode.next = this.head;
        this.head = newNode;
    }

    public static void traverseList(LinkedList list) {
        Node node = list.head;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
