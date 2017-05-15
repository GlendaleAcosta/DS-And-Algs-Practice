package ds.SinglyLinkedList;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(40);
        myList.insertFirst(50);
        myList.insertFirst(60);
        myList.insertLast(99999);

        myList.displayList();
    }
}
