import java.util.Scanner;

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(); // Create a new linked list
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Prompt user for the number of nodes to insert
        System.out.print("Enter the number of nodes to insert: ");
        int numberOfNodes = scanner.nextInt(); // Get the number of nodes
        System.out.println("You will insert " + numberOfNodes + " nodes.");

        // Insert nodes at the end based on user input
        for (int i = 0; i < numberOfNodes; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int value = scanner.nextInt();
            list.insertAtEnd(value); // Insert each node
        }

        int choice;
        do {
            System.out.println("\nLinked List Operations Menu:");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Middle");
            System.out.println("4. Delete at Beginning");
            System.out.println("5. Delete at End");
            System.out.println("6. Reverse List");
            System.out.println("7. Print List");
            System.out.println("8. Exit");
            System.out.print("Choose an option (1-8): ");
            choice = scanner.nextInt(); // Get user choice

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at the beginning: ");
                    int valueAtBeginning = scanner.nextInt();
                    list.insertAtBeginning(valueAtBeginning);
                    break;

                case 2:
                    System.out.print("Enter value to insert at the end: ");
                    int valueAtEnd = scanner.nextInt();
                    list.insertAtEnd(valueAtEnd);
                    break;

                case 3:
                    System.out.print("Enter value to insert in the middle: ");
                    int valueAtMiddle = scanner.nextInt();
                    System.out.print("Enter position (0 for beginning, 1 for second position, etc.): ");
                    int position = scanner.nextInt();
                    list.insertAtMiddle(valueAtMiddle, position);
                    break;

                case 4:
                    list.deleteAtBeginning();
                    break;

                case 5:
                    list.deleteAtEnd();
                    break;

                case 6:
                    list.reverse();
                    System.out.println("List reversed successfully.");
                    break;

                case 7:
                    System.out.println("Current Linked List:");
                    list.printList();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid operation.");
            }
        } while (choice != 8); // Continue until user chooses to exit

        scanner.close(); // Close the scanner
    }
}
