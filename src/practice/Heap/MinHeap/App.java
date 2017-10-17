package practice.Heap.MinHeap;

public class App {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        heap.insertKey(5);
        heap.insertKey(4);
        heap.insertKey(9);
        heap.insertKey(13);
        heap.insertKey(17);
        heap.insertKey(20);
//        heap.getMin();
        heap.deleteKey(5);
        heap.extractMin();
        heap.extractMin();
        heap.extractMin();
        heap.extractMin();
        heap.extractMin();
        heap.extractMin();
        heap.extractMin();
        heap.extractMin();
        heap.extractMin();
        System.out.println(heap.heap[6]);
    }

}
