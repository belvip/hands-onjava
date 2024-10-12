
public class SinglyLinkedLisMain {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(); // Create a new linked list

        // Insert nodes at the beginning
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        // Print the linked list
        System.out.println("Linked List after inserting nodes at the beginning:");
        list.printList(); // Expected Output: 30 -> 20 -> 10 -> null
    }
}
