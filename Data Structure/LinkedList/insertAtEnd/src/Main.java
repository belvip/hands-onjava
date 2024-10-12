// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(); // Create a new linked list

        // Insert nodes at the end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        // Print the linked list
        System.out.println("Linked List after inserting nodes at the end:");
        list.printList(); // Expected Output: 10 -> 20 -> 30 -> null
    }
}
