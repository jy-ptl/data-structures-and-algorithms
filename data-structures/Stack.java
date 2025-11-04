public class Stack {

    private int[] array;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.array = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(array[i]);
        }
    }

    public void push(int element) {
        if (isFull())
            System.out.println("Stack is at capacity");
        array[++top] = element;
    }

    public int pop() {
        if (isEmpty())
            System.out.println("Stack is empty");
        return array[top--];
    }

    public int size() {
        return top + 1;
    }

    public int peek() {
        if (isEmpty())
            System.out.println("Stack is empty");
        return array[top];
    }

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(8);
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println(stack.peek());

    }

}
