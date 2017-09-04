package ds.LinkedList.ListSwapNodes;
// Given a linked list and two keys in it, swap nodes for two given keys.
// Nodes should be swapped by changing links.
// Swapping data of nodes may be expensive in many situations when data contains many fields.
// It may be assumed that all keys in linked list are distinct

public class LinkedList {
    Node head;

    public void swapNodes(int x, int y) {
        if (x == y) return;

        Node currX = head;
        Node prevX = null;
        while(currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node currY = head;
        Node prevY = null;
        while(currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;

        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else //make y the new head
            head = currY;

        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;


        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        if (prevX != null) {
            prevX.next = currY;
        }
        if (prevY != null) {
            prevY.next = currX;
        }
    }

    public void traverseList() {
        Node node = head;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
