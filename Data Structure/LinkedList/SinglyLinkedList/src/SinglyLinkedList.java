
public class SinglyLinkedList {
    Node head; // Head of the list

    // Constructor to initialize the head
    public SinglyLinkedList() {
        head = null;
    }

    // Method to insert a new node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head;           // Point new node's next to current head
        head = newNode;                // Update head to the new node
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
