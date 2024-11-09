// Class representing a singly linked list
public class SingleLinkedList {

    // Head node of the linked list, points to the first node
    public Node head;

    // Tail node of the linked list, points to the last node
    public Node tail;

    // Size of the linked list, tracking the number of nodes
    public int size;

    // Method to create a new single-node linked list with an initial value
    public Node createSingleLinkedList(int nodeValue) {
        // Create the head node of the linked list
        head = new Node();

        // Initialize a new node with the specified value
        Node node = new Node();
        node.value = nodeValue;  // Assign the value to the node
        node.next = null;        // Set next to null as this is the only node

        // Set both head and tail to this new node as it’s the only node in the list
        head = node;
        tail = node;

        // Set the size of the list to 1 since we have one node
        size = 1;

        // Return the head node of the newly created linked list
        return head;
    }

    //    with a specified value at a specified location
    public void insertInLinkedList(int nodeValue, int location) {
        // Initialize a new node with the specified value
        Node node = new Node();
        node.value = nodeValue;

        // If the linked list is empty, create it with this new node
        if (head == null) {
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            // Insert node at the beginning
            node.next = head; // Point new node's next to the current head
            head = node;      // Set new node as the head of the list
        } else if (location >= size) {
            // Insert node at the end
            node.next = null;  // Set new node's next to null as it’s the last node
            tail.next = node;  // Link current tail’s next to new node
            tail = node;       // Update tail to the new last node
        } else {
            // Insert node at a specified location within the list
            Node tempNode = head; // Temporary node to traverse the list
            int index = 0;

            // Traverse until the node before the desired location
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }

            // Insert new node between tempNode and the next node
            Node nextNode = tempNode.next;
            node.next = nextNode;  // Point new node's next to the next node
            tempNode.next = node;  // Link tempNode's next to the new node
        }

        // Ensure the last node always points to null
        if (tail != null) {
            tail.next = null;  // Set tail's next to null to mark the end of the list
        }

        // Increment the size to reflect the addition of a new node
        size++;
    }

    // Singly LinkedList Traversal
    public void traversalSinglyLinkedList(){
        if(head == null){
            System.out.println("SLL doesn't exist");
        }else{
            Node tempNode = head; // Start from the head of the list
            while(tempNode != null){
                System.out.print(tempNode.value); // Print the value of the current node

                // If the current node is not the last node, print " -> "
                if(tempNode.next != null){
                    System.out.print(" -> ");
                }

                tempNode = tempNode.next; // Move to the next node
            }
            System.out.println(); // Print a new line after traversal
        }
    }

    // Search for a node and return its position if found
    public boolean searchNode(int nodeValue) {
        Node tempNode = head; // Start from the head node
        int position = 0;     // Initialize position to 0

        // Traverse through the linked list
        while (tempNode != null) {
            // Check if the current node's value matches the search value
            if (tempNode.value == nodeValue) {
                System.out.println("Found node " + nodeValue + " at position : "  + position + "\n");
                return true;  // Return true if node is found
            }
            tempNode = tempNode.next;  // Move to the next node
            position++;  // Increment the position
        }

        // If we reach here, the node was not found
        System.out.println("Node not found");
        return false;  // Return false if node is not found
    }

    // Delete a node from SinglyLinkedList

}
