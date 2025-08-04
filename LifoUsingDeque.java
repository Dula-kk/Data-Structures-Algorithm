import java.util.Deque;
import java.util.ArrayDeque;

public class LIFOQueueDemo {

    public static void main(String[] args) {
        // Create a Deque as a LIFO Queue (Stack)
        Deque<Integer> lifoQueue = new ArrayDeque<>();

        // Pushing elements (acts like push on stack)
        lifoQueue.push(10);
        lifoQueue.push(20);
        lifoQueue.push(30);

        System.out.println("LIFO Queue after pushes: " + lifoQueue);

        // Peek at the top element (without removing)
        System.out.println("Peek: " + lifoQueue.peek());

        // Pop elements (acts like pop on stack)
        while (!lifoQueue.isEmpty()) {
            System.out.println("Popped: " + lifoQueue.pop());
        }

        // Final state
        System.out.println("LIFO Queue after pops: " + lifoQueue);
    }
}
