class ArrayStack {
    int[] stack;
    int top = -1;
    ArrayStack(int size) { stack = new int[size]; }
    public void push(int x) { stack[++top] = x; }
    public int pop() { return stack[top--]; }
}