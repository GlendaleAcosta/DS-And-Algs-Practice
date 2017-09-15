package ds.Trees.Heaps.MinHeap;

public class MinHeap {
    int size;
    int capacity;
    int[] heap;

    public MinHeap(int c) {
        capacity = c + 1;
        size = 0;
        heap = new int[capacity];
    }

    public void insert(int value) {
        size++;
        heap[size] = value;
        siftUp(size);
    }

    public void siftUp(int i) {
        while(i / 2 > 0) {
            if (heap[i] < heap[i/2]) {
                int temp = heap[i/2];
                heap[i/2] = heap[i];
                heap[i] = temp;
            }
            i = i / 2;
        }
    }

    public void print() {
        for(int i = 1; i < size + 1; i++) {
            System.out.println(heap[i] + " index: " + i);
        }
    }


}
