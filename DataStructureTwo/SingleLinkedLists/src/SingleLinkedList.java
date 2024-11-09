// Class representing a singly linked list
public class SingleLinkedList {

    // The head (starting node) of the linked list
    public Node head;

    // The tail (last node) of the linked list
    public Node tail;

    // The size (number of nodes) in the linked list
    public int size;

    // Method to create a new single-node linked list with an initial node value
    public Node createSingleLinkedList(int nodeValue) {
        // Initialize the head node of the linked list
        head = new Node();

        // Create a new node with the given value
        Node node = new Node();
        node.value = nodeValue; // Set the node's value
        node.next = null;       // Set the next pointer to null, since this is the only node initially

        // Set both head and tail to this new node, as it's the only node in the list
        head = node;
        tail = node;

        // Set the size of the list to 1, as we now have one node
        size = 1;

        // Return the head node of the newly created linked list
        return head;
    }
}
