package ds2.LinkedList.SinglyLinkedList;

public class LinkedList {
    Node head;


    public LinkedList() {
        this.head = null;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public void printList() {
        Node curr = this.head;
        System.out.print("printList: ");
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public int size() {
        Node curr = this.head;
        int i = 0;
        while(curr != null) {
            curr = curr.next;
            ++i;
        }
        return i;
    }

    public boolean isEmpty() {
        // return this.size() == 0;
        return this.head == null;
    }

    public int value_at(int index) {
        int count = index;
        Node curr = this.head;
        while(curr != null && count > 0) {
            count--;
            curr = curr.next;
        }
        return curr.data;
    }

    public void pushFront(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
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

    public int popBack() {
        if (this.isEmpty()) {
            System.out.println("Error: List is empty");
        }
        else {
            Node curr = this.head;
            Node prev = null;
            while(curr.next != null) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            return curr.data;
        }
        return -1;
    }

    public int frontVal() {
        if (!this.isEmpty()) {
            return this.head.data;
        }
        System.out.println("Error: List is Empty");
        return -1;
    }

    public int back() {
        if (!this.isEmpty()) {
            Node curr = this.head;
            while(curr.next != null) {
                curr = curr.next;
            }
            return curr.data;
        }
        System.out.println("Error: List is Empty");
        return -1;
    }

    public void insertNode(int index, int value) {
        Node newNode = new Node(value);
        int size = this.size();
        if (index > size) {
            System.out.println("Error: index is larger than the size of the list");
        } else if (index == 0) {
            pushFront(value);
        } else if (index == size) {
            pushBack(value);
        } else {

            Node curr = head;
            Node prev = null;
            int i = 0;
            while(curr.next != null && i != index) {
                prev = curr;
                curr = curr.next;
                i++;
            }
            prev.next = newNode;
            newNode.next = curr;
        }
    }

    public void erase(int index) {
        
    }

}
