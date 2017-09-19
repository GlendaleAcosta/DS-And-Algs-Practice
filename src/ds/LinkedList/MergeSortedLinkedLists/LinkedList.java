package ds.LinkedList.MergeSortedLinkedLists;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            Node lastNode = this.head;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }
}
