package ds.CircularLinkedList;

public class App {
    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(40);
        myList.insertFirst(50);
        myList.insertFirst(60);
        myList.insertLast(99993);

        myList.displayList();
    }
}
