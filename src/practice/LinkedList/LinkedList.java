package practice.LinkedList;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class LinkedList {
    Node head;
    int size;

    public LinkedList(int data) {
        head = new Node(data);
    }

    public LinkedList() {
        head = null;
    }

    public int size() {
        System.out.println("Size is " + size);
        return size;
    }

    public boolean empty() {
//        System.out.println("Is empty: " + (size == 0 ));
        return (size == 0);
    }

    public void push_front(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public Node pop_front() {
        if (empty()) {
            System.out.println("List is empty. Cannot pop.");
            return null;
        }

        Node temp = head;
        if (head.next != null)
            head = head.next;
        else
            head = null;

        size--;
        return temp;
    }

    public void push_back(int data) {
        if (empty()) {
            head = new Node(data);
            size++;
            return;
        }

        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(data);
        size++;
    }

    public Node pop_back() {
        if (empty()) {
            System.out.println("List is empty. Cannot pop.");
            return null;
        }

        Node curr = head;
        Node prev = null;
        while(curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        if (prev == null) {
            head = null;
        } else {
            prev.next = null;
        }
        size--;
        return curr;
    }

    public Node front() {
        if (head != null)
            System.out.println("The first item is " + head.data);
        return head;
    }

    public Node back() {
        if (empty())
            return null;

        Node curr = head;
        while(curr.next != null)
            curr = curr.next;

        System.out.println("The last item is " + curr.data);
        return curr;
    }

    public void insert(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Index is out of bounds.");
            return;
        } else if (index == 0) {
            push_front(data);
            return;
        } else if (index == size) {
            push_back(data);
            return;
        } else {
            int count = 0;
            Node curr = head;
            Node prev = null;
            Node newNode = new Node(data);
            while(count != index) {
                prev = curr;
                curr = curr.next;
                count++;
            }
            prev.next = newNode;
            newNode.next = curr;
        }
        size++;
    }

    public void erase(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Index is out of bounds");
        } else if (index == 0)
            pop_front();
        else if (index == size - 1)
            pop_back();
        else {
            Node curr = head;
            Node prev = null;
            int count = 0;
            while(count != index) {
                prev = curr;
                curr = curr.next;
                count++;
            }

            prev.next = curr.next;
            curr = null;
            size--;
        }
    }

    public Node value_n_from_end(int n) {
        if (n < 0 || n > size - 1) {
            System.out.println("n is out of bounds.");
            return null;
        }

        Node slowNode = head;
        Node fastNode = head;
        int count = 0;
        while(fastNode.next != null) {
            fastNode = fastNode.next;
            if (count >= n) {
                slowNode = slowNode.next;
            }
            count++;
        }
        System.out.println(slowNode.data + " is " + n + " step(s) away from the end of the list.");
        return slowNode;
    }

    public void reverseList() {
        head = reverse(head, null);
    }

    private Node reverse(Node curr, Node prev) {
        if (curr.next == null) {
            curr.next = prev;
            return curr;
        }
        Node next1 = curr.next;
        curr.next = prev;

        return reverse(next1, curr);
    }

    public void remove_value(int value) {
        if (empty()) {
            return;
        }

        Node curr = head;
        Node prev = null;
        while(curr.next != null && curr.data != value) {
            prev = curr;
            curr = curr.next;
        }
        if (prev == null && curr.data == value)
            pop_front();
        else if (curr.next == null && curr.data == value)
            pop_back();
        else if (curr.data == value) {
            prev.next = curr.next;
            curr = null;
            size--;
        } else {
            System.out.println("Value could not be found.");
        }
    }

    public Node value_at(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Index is out of bounds.");
            return null;
        }

        int count = 0;
        Node curr = head;
        while(curr.next != null && count != index) {
            curr = curr.next;
            count++;
        }
        System.out.println("The value at index " + index + " is " + curr.data);
        return curr;


    }

    public void printList() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println(curr);
    }
}
