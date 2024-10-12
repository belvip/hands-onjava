// Singly Linked List class
public class SinglyLinkedList {
    Node head; // Head of the list

    // Constructor to initialize the head
    public SinglyLinkedList() {
        head = null;
    }

    // Method to insert a new node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data); // Create a new node

        // If the list is empty, set the head to the new node
        if (head == null) {
            head = newNode;
            return;
        }

        // Otherwise, traverse to the end of the list
        Node current = head;
        while (current.next != null) {
            current = current.next; // Move to the next node
        }
        current.next = newNode; // Link the last node to the new node
    }

    // Method to print the linked list
    public void printList() {
        Node current = head; // Start from the head
        while (current != null) { // Traverse until the end
            System.out.print(current.data + " -> "); // Print current node's data
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // Indicate the end of the list
    }
}
