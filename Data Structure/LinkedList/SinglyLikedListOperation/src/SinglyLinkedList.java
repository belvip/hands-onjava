// Singly Linked List class
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

    // Method to insert a new node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) {             // If the list is empty
            head = newNode;             // Set head to new node
            return;
        }
        Node current = head;           // Start from the head
        while (current.next != null) { // Traverse to the end
            current = current.next;
        }
        current.next = newNode;        // Point the last node to new node
    }

    // Method to insert a new node at a specified position
    public void insertAtMiddle(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }
        Node current = head;
        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds. Inserting at the end.");
            insertAtEnd(data);
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Method to delete the first node
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. No nodes to delete.");
            return;
        }
        head = head.next; // Update head to the next node
    }

    // Method to delete the last node
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty. No nodes to delete.");
            return;
        }
        if (head.next == null) {
            head = null; // If only one node is present
            return;
        }
        Node current = head;
        while (current.next.next != null) { // Traverse to the second last node
            current = current.next;
        }
        current.next = null; // Remove the last node
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current;      // Move prev and current one step forward
            current = next;
        }
        head = prev; // Update head to the new first node
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
