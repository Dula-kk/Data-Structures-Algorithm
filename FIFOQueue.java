import java.util.Deque;
import java.util.ArrayDeque;

public class FIFOQueue {

    public static void main(String[] args) {
        // Create a Deque to act as a FIFO Queue
        Deque<Integer> fifoQueue = new ArrayDeque<>();

        // Enqueue elements (add to rear)
        fifoQueue.addLast(10);
        fifoQueue.addLast(20);
        fifoQueue.addLast(30);

        System.out.println("FIFO Queue after enqueues: " + fifoQueue);

        // Peek at the front element (without removing)
        System.out.println("Peek: " + fifoQueue.peekFirst());

        // Dequeue elements (remove from front)
        while (!fifoQueue.isEmpty()) {
            System.out.println("Dequeued: " + fifoQueue.removeFirst());
        }

        // Final state
        System.out.println("FIFO Queue after dequeues: " + fifoQueue);
    }
}
