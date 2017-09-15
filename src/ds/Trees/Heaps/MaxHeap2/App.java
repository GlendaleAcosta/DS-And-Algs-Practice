package ds.Trees.Heaps.MaxHeap2;

public class App {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        heap.insert(12);
        heap.insert(7);
        heap.insert(6);
        heap.insert(10);
        heap.insert(8);
        heap.insert(20);

        int size = heap.getSize();
        System.out.println(size);

        heap.print();
    }
}
