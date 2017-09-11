package ds.LinkedList.LinkedListPractice_1;

public class LinkedList {
    Node root;

    public LinkedList(int data) {
        this.root = new Node(data);
    }

    public int size() {
        Node node = this.root;
        int count = 0;
        while(node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int valueAt(int index) {
        Node node = this.root;
        int count = 0;
        while(node != null && count != index) {
            node = node.next;
            count++;
        }

        if (count == index) return node.data;
        else {
            return -1;
        }
    }

    public void pushFront(int data) {
        Node newNode = new Node(data);
        newNode.next = this.root;
        this.root = newNode;
    }



    public void printList() {
        Node node = this.root;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
