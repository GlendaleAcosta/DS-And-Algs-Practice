package ds.LinkedList.ListLengthRecursive;

public class LinkedList {
    Node head;

    public int getCountRec(Node node)
    {
        // Base case
        if (node == null)
            return 0;

        // Count is this node plus rest of the list
        return 1 + getCountRec(node.next);
    }

    /* Wrapper over getCountRec() */
    public int getCount()
    {
        return getCountRec(head);
    }
}
