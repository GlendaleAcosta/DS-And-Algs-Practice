package ds.Queue.QueueArray;

public class Queue {
    int front;
    int rear;
    int size;
    int capacity;
    int array[];

    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        this.array = new int[this.capacity];
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        this.rear = (this.rear + 1)%this.capacity;
        this.array[this.rear] = data;
        this.size = this.size + 1;
        System.out.println(data+ " enqueued to queue");
    }

    public int dequeue()
    {
        int item = this.array[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size - 1;
        System.out.println(item);
        return item;
    }
}
