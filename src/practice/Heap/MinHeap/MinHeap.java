package practice.Heap.MinHeap;

public class MinHeap {
    int capacity;
    int size;
    int[] heap;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        size = 0;
        heap = new int[capacity];
    }

    public int parent(int i) { return (i - 1) / 2;}
    public int leftChild(int i) {return (2 * i + 1);}
    public int rightChild(int i) {return (2 * i + 2);}

    public void insertKey(int data) {
        if (size >= capacity) return;

        size++;
        int i = size - 1;
        heap[i] = data;
        siftUp(i);
    }

    public void siftUp(int i) {
        while(i != 0 && heap[parent(i)] > heap[i]) {
            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;
            i = parent(i);
        }
    }

    public int extractMin() {
        if (size <= 0) {
            System.out.println("ERROR: heap is empty, cannot extract.");
            return -1;
        }

        if (size == 1) {
            size--;
            return heap[0];
        }

        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        minHeapify(0);
        System.out.println(root);
        return root;
    }

    private void minHeapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;
        if (left < size && heap[left] < heap[i]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest])
            smallest = right;
        if (smallest != i) {
            int temp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = temp;
            minHeapify(smallest);
        }
    }


    public int getMin() {
        System.out.println("Min: " + heap[0]);
        return heap[0];
    }

    public void deleteKey(int i) {
        if (i < 0 || i >= size)
            return;

        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }

    public void decreaseKey(int i, int val) {
        heap[i] = val;
        while(i != 0 && heap[parent(i)] > heap[i]) {
            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;
            i = parent(i);
        }
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}
