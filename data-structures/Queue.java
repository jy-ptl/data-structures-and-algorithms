public class Queue {

    private int size;
    private int items[];
    private int front, rear;

    public Queue(int size) {
        this.size = size;
        this.items = new int[size];
        this.front = this.rear = -1;
    }

    public boolean isFull() {
        if (this.rear == this.size - 1)
            return true;
        return false;
    }

    public boolean isEmpty() {
        return this.front == -1;
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (this.front == -1)
                this.front++;
            this.items[++this.rear] = element;
        }
    }

    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = this.items[front];
            if (this.front >= this.rear) {
                this.front = this.rear = -1;
            } else {
                this.front++;
            }
            return element;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = this.front; i <= this.rear; i++) {
                System.out.println(this.items[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        queue.deQueue();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        queue.enQueue(6);

        queue.display();
        queue.deQueue();
        queue.display();

    }

}
