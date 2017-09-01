package ds.LinkedList.ListLengthRecursive;

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);

        list.head.next = second;
        second.next = third;
        third.next = four;

        int count = list.getCount();
        System.out.println(count);
    }
}
