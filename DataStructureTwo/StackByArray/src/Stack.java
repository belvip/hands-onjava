public class Stack {
    int[] arr;       // Array to store stack elements
    int topOfStack;  // Tracks the top element in the stack

    // Constructor to initialize the stack with a specific size
    public Stack(int size) {
        this.arr = new int[size];  // Creates an array of the given size
        this.topOfStack = -1;      // Sets the initial top of stack to -1, indicating an empty stack
        System.out.println("The Stack is created with size: " + size);
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        // Returns true if the top of the stack is -1, indicating it's empty
        return topOfStack == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        // Returns true if topOfStack is at the last index, meaning no more elements can be pushed
        return topOfStack == arr.length - 1;
    }

    // Push Method - Adds a new value to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("The Stack is full!"); // Message if stack has reached max capacity
        } else {
            arr[topOfStack + 1] = value; // Inserts value at the next available position
            topOfStack++;                // Updates topOfStack to the new top element
            System.out.println("The value is successfully inserted");
        }
    }

    // Pop Method - Removes and returns the top value from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty"); // Message if stack is empty
            return -1;  // Returns -1 to indicate an error state for an empty stack
        } else {
            int topStack = arr[topOfStack]; // Stores the top value for return
            topOfStack--;                   // Decreases topOfStack to remove the top element
            return topStack;                // Returns the popped value
        }
    }

    // Peek Method - Returns the top value without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty"); // Message if stack is empty
            return -1;  // Returns -1 to indicate an empty stack
        } else {
            return arr[topOfStack]; // Returns the value at the top of the stack
        }
    }
}
