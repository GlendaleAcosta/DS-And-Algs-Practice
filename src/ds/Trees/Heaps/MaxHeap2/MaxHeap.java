package ds.Trees.Heaps.MaxHeap2;

public class MaxHeap {
    private int[] heap;
    private int capacity;
    private int size;
    private int pos;

    public MaxHeap(int capacity) {
        this.capacity = capacity + 1;
        this.size = 0;
        this.pos = 0;
        this.heap = new int[this.capacity];
        heap[0] = 99999;
    }

    public void insert(int value) {
        pos++;
        size++;
        heap[pos] = value;
        siftUp(pos);
    }

    private void siftUp(int pos) {
        int childVal = heap[pos];
        int parentIndex = pos / 2;

        while(heap[parentIndex] < childVal ) {
            heap[pos] = heap[parentIndex];
            pos = parentIndex;
            parentIndex = pos / 2;
        }
        heap[pos] = childVal;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        for(int i = 1; i < size + 1; i++) {
                System.out.println(heap[i]);
        }
    }

}
