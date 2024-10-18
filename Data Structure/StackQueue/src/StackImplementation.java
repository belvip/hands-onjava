import java.util.Scanner;

public class StackImplementation {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the stack
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        // Create a Stack object
        Stack stack = new Stack(size);

        // Stack operations
        stack.push(10);   // Push 10
        stack.push(20);   // Push 20
        stack.push(30);   // Push 30

        System.out.println("Top element is: " + stack.peek()); // Peek the top element

        stack.pop();      // Pop the top element (30)
        System.out.println("Top element after pop: " + stack.peek());

        // Close the scanner
        scanner.close();
    }
}