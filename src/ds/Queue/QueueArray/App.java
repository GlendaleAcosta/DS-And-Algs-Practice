package ds.Queue.QueueArray;

public class App {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
