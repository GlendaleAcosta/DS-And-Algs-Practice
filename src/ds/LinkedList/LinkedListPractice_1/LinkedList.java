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

    public Node popFront() {
        Node node = this.root;
        this.root = this.root.next;
        return node;
    }

    public void pushBack(int data) {
        Node node = this.root;
        while(node != null && node.next != null) {
            node = node.next;
        }
        node.next = new Node(data);
    }

    public Node popBack() {
        Node node = this.root;
        while(node != null && node.next.next != null) {
            node = node.next;
        }
        Node lastNode = node.next;
        node.next = null;
        return lastNode;

    }

    public Node front() {
        return this.root;
    }

    public Node back() {
        Node node = this.root;
        while(node != null && node.next != null) {
            node = node.next;
        }
        return node;
    }

    public void insert(int index, int data) {
        int count = 0;
        Node current = this.root;
        Node prev = null;
        while(count != index && current != null) {
            prev = current;
            current = current.next;
            count++;
        }
        Node newNode = new Node(data);
        prev.next = newNode;
        newNode.next = current;
    }

    public void erase(int index) {
        Node current = this.root;
        Node prev = null;
        int count = 0;
        while(current != null && count != index) {
            prev = current;
            current = current.next;
            count++;
        }
        prev.next = current.next;
    }

    public Node reverseList() {
        Node current = this.root;
        Node prev = null;
        Node next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current = prev;
        return current;

    }

    public void removeValue(int value) {
        Node node = this.root;
        Node prev = null;
        while(node != null && node.data != value) {
            prev = node;
            node = node.next;
        }
        prev.next = node.next;
    }

    public int value_n_from_end(int n) {
        int length = 0;
        Node node = this.root;
        while(node != null) {
            node = node.next;
            length++;
        }

        if (length < n) {
            System.out.println("The input value is larger than the number of items");
            return 0;
        }

        node = this.root;
        for(int i = 0; i < length - n + 1; i++) {
            node = node.next;
        }
        System.out.println(node.data);
        return 0;
    }

    public void printList() {
        Node node = this.root;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
