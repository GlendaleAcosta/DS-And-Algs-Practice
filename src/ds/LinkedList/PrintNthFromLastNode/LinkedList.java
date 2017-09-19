package ds.LinkedList.PrintNthFromLastNode;

// 2 pointer method

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public void printFromLast(int n) {
        Node ptr1 = head;
        Node ptr2 = head;

        int count = 0;
        if (head != null) {
            while(count < n) {
                if (ptr2 == null) {
                    return;
                }
                ptr2 = ptr2.next;
                count++;
            }
            while(ptr2 != null) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            System.out.println(ptr1.data);
        }
    }
}
