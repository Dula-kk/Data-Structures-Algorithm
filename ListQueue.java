class ListQueue {
    class Node { int data; Node next; Node(int d) { data = d; } }
    Node front, rear;
    public void enqueue(int x) {
        Node n = new Node(x);
        if (rear == null) front = rear = n;
        else { rear.next = n; rear = n; }
    }
    public int dequeue() {
        int x = front.data;
        front = front.next;
        if (front == null) rear = null;
        return x;
    }
}