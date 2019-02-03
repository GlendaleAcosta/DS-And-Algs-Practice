package ds2.LinkedList.Problems.ReverseLinkedList;

// Reverse a singly Linked List
// https://leetcode.com/problems/reverse-linked-list/description/

public class App {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList(0);
        ll.pushBack(1);
        ll.pushBack(2);
        ll.pushBack(3);
        ll.pushBack(4);
        ll.printList();
        ll.iterativeReverse();
        ll.printList();
    }
}
