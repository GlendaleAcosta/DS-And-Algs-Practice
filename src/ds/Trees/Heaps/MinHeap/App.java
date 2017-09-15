package ds.Trees.Heaps.MinHeap;

public class App {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        heap.insert(12);
        heap.insert(7);
        heap.insert(6);
        heap.insert(10);
        heap.insert(8);
        heap.insert(20);
        heap.print();
    }
}
