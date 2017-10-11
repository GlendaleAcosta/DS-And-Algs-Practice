//package practice.LinkedList.asnwer;
//
//import practice.LinkedList.Node;
//
//public class LinkedList {
//    Node head;
//    int size;
//
//    public LinkedList() {
//        head = null;
//        size = 0;
//    }
//
//    public LinkedList(int data) {
//        head = new Node(data);
//        size = 1;
//    }
//
//    public int size() { return size;}
//
//    public boolean empty() { return size == 0;}
//
//    public void push_front(int value) {
//        if (empty()) {
//            head = new Node(value);
//        } else {
//            Node temp = head;
//            head = new Node(value);
//            head.next = temp;
//        }
//        size++;
//    }
//
//    public void printList() {
//        Node curr = head;
//        while(curr != null) {
//            System.out.print(curr.data + " -> ");
//            curr = curr.next;
//        }
//        System.out.print("null");
//        System.out.println("");
//    }
//
//    public Node pop_front() {
//        if (empty())
//            return null;
//
//        Node temp = head;
//        if (head.next != null) {
//            head = head.next;
//        } else {
//            head = null;
//        }
//        size--;
//        return temp;
//    }
//
//    public Node pop_back() {
//        if (empty())
//            return null;
//
//        Node curr = head;
//        Node prev = null;
//        while(curr.next != null) {
//            prev = curr;
//            curr = curr.next;
//        }
//        if (prev == null) {
//            Node temp = head;
//            head = null;
//            return temp;
//        } else {
//            prev.next = null;
//        }
//        size--;
//        return curr;
//    }
//
//    public void push_back(int value) {
//        Node newNode = new Node(value);
//        if (empty()) {
//            head = newNode;
//        } else {
//            Node curr = head;
//            while(curr.next != null) {
//                curr = curr.next;
//            }
//            curr.next = newNode;
//        }
//        size++;
//    }
//
//    public Node front() {
//        return head;
//    }
//
//    public Node back() {
//        Node curr = head;
//        while(curr.next != null) {
//            curr = curr.next;
//        }
//        return curr;
//    }
//
//    public void insert(int index, int value) {
//        if (index < 0 || index > size ) {
//            System.out.println("Index is our of bounds");
//            return;
//        } else if (index == 0) {
//            push_front(value);
//            return;
//        } else if (index == size) {
//            push_back(value);
//        } else {
//            int count = 0;
//            Node curr = head;
//            Node prev = null;
//            Node newNode = new Node(value);
//            while(curr.next != null && count != index) {
//                prev = curr;
//                curr = curr.next;
//                count++;
//            }
//            prev.next = newNode;
//            newNode.next = curr;
//        }
//        size++;
//    }
//
//    public void erase(int index) {
//        if (index < 0 || index > size - 1) {
//            System.out.println("Index is out of bounds");
//            return;
//        }
//
//        if(index == 0)
//            pop_front();
//        else if (index == size - 1)
//            pop_back();
//        else {
//            int count = 0;
//            Node curr = head;
//            Node prev = null;
//            while(curr != null && index != count) {
//                prev = curr;
//                curr = curr.next;
//                count++;
//            }
//            prev.next = curr.next;
//            curr = null;
//        }
//        size--;
//    }
//
//    public Node value_at(int index) {
//        if (index < 0 || index > size - 1) {
//            System.out.println("Index is out of bounds");
//            return null;
//        }
//
//        Node curr = head;
//        int count = 0;
//        while(curr.next != null && count != index) {
//            curr = curr.next;
//            count++;
//        }
//        System.out.println(curr.data);
//        return curr;
//    }
//
//    public Node value_from_n(int n) {
//        if (n < 0 || n > size - 1) {
//            System.out.println("n is out of bounds");
//            return null;
//        }
//        Node slowNode = head;
//        Node fastNode = head;
//        int count = 0;
//        while(fastNode.next != null) {
//            fastNode = fastNode.next;
//            if (count >= n) {
//                slowNode = slowNode.next;
//            }
//            count++;
//        }
//        System.out.println(slowNode.data);
//        return slowNode;
//    }
//
//    public void reverseList() {
//        head = reverse(head, null);
//    }
//
//    private Node reverse(Node curr, Node prev) {
//        if (curr.next == null) {
//            curr.next = prev;
//            return curr;
//        }
//        Node next1 = curr.next;
//        curr.next = prev;
//
//        return reverse(next1, curr);
//    }
//
//    public void removeVal(int val) {
//        if (empty())
//            return;
//        Node curr = head;
//        Node prev = null;
//        while(curr.next != null && curr.data != val) {
//            prev = curr;
//            curr = curr.next;
//        }
//        Boolean valIsFound = curr.data == val;
//        if (prev == null && valIsFound) {
//            pop_front();
//        } else if (curr.next == null && valIsFound)
//            pop_back();
//        else if (valIsFound) {
//            prev.next = curr.next;
//            curr = null;
//        } else if (!valIsFound)
//            return;
//        size--;
//    }
//}
