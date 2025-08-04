class ListStack {
    class Node { int data; Node next; Node(int d) { data = d; } }
    Node top;
    public void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
    }
    public int pop() {
        int x = top.data;
        top = top.next;
        return x;
    }
}
