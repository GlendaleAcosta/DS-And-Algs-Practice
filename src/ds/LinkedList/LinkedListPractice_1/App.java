package ds.LinkedList.LinkedListPractice_1;

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);

        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);

        list.root.next = two;
        two.next = three;
        three.next = four;

        int size = list.size();
        System.out.println(size);

        System.out.println(list.isEmpty());

        System.out.println(list.valueAt(1));

        list.pushFront(0);
        System.out.println("--------------------");
        list.printList();
        System.out.println("--------------------");


    }
}
