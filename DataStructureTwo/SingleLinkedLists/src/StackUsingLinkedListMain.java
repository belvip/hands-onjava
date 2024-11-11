// Main class to demonstrate Stack implementation using Linked List
public class StackUsingLinkedListMain {

    public static void main(String[] args) {

        // Create a new instance of Stack
        Stack newStack = new Stack();

        // Push elements onto the stack
        newStack.push(1); // Pushes the value 1 onto the stack
        newStack.push(2); // Pushes the value 2 onto the stack
        newStack.push(3); // Pushes the value 3 onto the stack

        // Uncomment the following lines to test additional stack operations:

        // Check if the stack is empty
        // boolean result = newStack.isEmpty();
        // System.out.println(result); // Prints true if the stack is empty, false otherwise

        // Peek at the top element without removing it
        // int result = newStack.peek();
        // System.out.println(result); // Prints the top element of the stack

        // Peek again to confirm the top element has not changed
        // int result1 = newStack.peek();
        // System.out.println(result1); // Should print the same top element as above

        // Delete the entire stack
        newStack.deleteStack(); // Removes all elements from the stack
    }

}
