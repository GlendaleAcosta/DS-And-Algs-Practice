package ds.Trees.Heaps.MaxHeap;

public class MaxHeap {
    private int[] theHeap;
    private int capacity;
    private int pos;

    public MaxHeap(int capacity) {
        pos = 1;
        this.capacity = capacity;
        theHeap = new int[this.capacity];
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
