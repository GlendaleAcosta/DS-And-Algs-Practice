package ds.Trees.Heaps.MaxHeap;

public class MaxHeap {
    private int[] theHeap;
    private int capacity;
    private int pos;

    public MaxHeap() {
        pos = 1;
        capacity = 10;
        theHeap = new int[capacity];
    }

    public void insert(int value) {
        if (pos == capacity) {
            // increase the capacity;
        } else {
            theHeap[pos++] = value;

            int child = pos - 1;
            int parent = child / 2;

            while(theHeap[parent] < theHeap[child] && parent > 0) {
                int tmp = theHeap[parent];
                theHeap[parent] = theHeap[child];
                theHeap[child] = tmp;

                child = parent;
                parent = child / 2;
            }
        }
    }

    public void print() {
        for(int i = 1; i < pos; i++) {
            System.out.println(theHeap[i]);
        }
    }
}
