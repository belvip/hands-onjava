import java.util.Scanner;

class Stack {
    private int[] stackArray; // Array to store stack elements
    private int top;          // To keep track of the top element
    private int capacity;     // Maximum size of the stack

    // Constructor to initialize the stack
    public Stack(int size) {
        stackArray = new int[size]; // Allocate memory for the stack
        capacity = size;            // Set the stack size
        top = -1;                   // Initialize top to -1 (empty stack)
    }

    // Push method to add an element to the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + element);
            return;
        }
        stackArray[++top] = element; // Increment top and add element
        System.out.println("Pushed " + element + " to the stack.");
    }

    // Pop method to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return stackArray[top--]; // Return the top element and decrement top
    }

    // Peek method to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top]; // Return the top element
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1; // If top is -1, the stack is empty
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1; // If top is at the last index, the stack is full
    }
}


