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

        list.popFront();
        list.printList();

        System.out.println("--------------------");

        list.pushBack(5);
        list.printList();

        System.out.println("--------------------");

        list.popBack();
        list.printList();

        System.out.println("--------------------");

        Node front = list.front();
        System.out.println(front.data);

        System.out.println("--------------------");

        Node back = list.back();
        System.out.println(back.data);

        System.out.println("--------------------");

        list.insert(3, 99);
        list.printList();

        System.out.println("--------------------");

        list.erase(3);
        list.printList();

        System.out.println("--------------------");

        list.root = list.reverseList();
        list.printList();

        System.out.println("--------------------");

        list.removeValue(2);
        list.printList();

        System.out.println("--------------------");

        list.pushBack(5);
        list.pushBack(6);
        list.printList();
        list.value_n_from_end(2);
    }
}
