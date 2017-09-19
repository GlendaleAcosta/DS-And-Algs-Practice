package ds.LinkedList.Practice;

public class LinkedList {
    Node head;
    int size;

    public LinkedList() {
        size = 0;
        head = null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int valueAt(int index) {
        Node current = this.head;
        int i = 0;
        while(current != null && i != index) {
            current = current.next;
            i++;
        }
        return current.data;
    }

    public void pushFront(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int popFront() {
        if (size == 0) return -1;
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    public void pushBack(int val) {
        Node current = head;
        while(current != null) {
            current = current.next;
        }
        current.next = new Node(val);
        size++;
    }

    public int popBack() {
        Node current = head;
        Node prev = null;
        while(current != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        size--;
        return current.data;
    }

    public int front() {
        return head.data;
    }

    public int back() {
        Node current = head;
        while(current != null) {
            current = current.next;
        }
        return current.data;
    }

    public void insertVal(int index, int val) {
        Node current = head;
        Node prev = null;
        int i = 0;
        while(current != null && i != index) {
            prev = current;
            current = current.next;
            i++;
        }
        if (i == index) {
            Node newNode = new Node(val);
            prev.next = newNode;
            newNode.next = current;
            size++;
        }
    }

    public void erase(int index) {
        Node current = head;
        Node prev = null;
        int i = 0;
        while(current != null && i != index) {
            prev = current;
            current = current.next;
            i++;
        }
        if (i == index) {
            prev.next = current.next;
            size--;
        }
    }

    public void removeVal(int val) {
        Node current = head;
        Node prev = null;
        while(current != null && current.data != val) {
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        size--;
    }
}
