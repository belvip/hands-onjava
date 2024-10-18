public class Queue {
    private int[] elements; // Array to store queue elements
    private int front;      // Index of the front element
    private int rear;       // Index of the rear element
    private int size;       // Size of the queue

    // Constructor to initialize the queue
    public Queue(int capacity) {
        elements = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    // Enqueue operation
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        if (front == -1) { // If the queue is empty
            front = 0;
        }
        rear++;
        elements[rear] = value;
        System.out.println("Enqueued: " + value);
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Indicate that the queue is empty
        }
        int value = elements[front];
        if (front == rear) { // If the queue becomes empty after dequeuing
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        System.out.println("Dequeued: " + value);
        return value;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Indicate that the queue is empty
        }
        return elements[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Main method to demonstrate the queue implementation
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Create a queue with a capacity of 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // This should indicate the queue is full

        System.out.println("Front element: " + queue.peek());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Front element after two dequeues: " + queue.peek());

        queue.enqueue(60);
        queue.enqueue(70);
    }
}
