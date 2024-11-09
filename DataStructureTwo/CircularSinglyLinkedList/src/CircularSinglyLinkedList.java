// Class representing a Circular Singly Linked List
public class CircularSinglyLinkedList {

    // The head node points to the first node of the list
    public Node head;

    // The tail node points to the last node of the list
    public Node tail;

    // Size of the linked list, keeping track of the number of nodes
    public int size;

    // Method to create a Circular Singly Linked List with an initial node
    public Node createCSLL(int nodeValue){
        // Initialize the head and the tail as new Node
        head = new Node();

        // Create a new node with the given value
        Node node = new Node();
        node.value = nodeValue;

        // Set the next pointer of the node to itself, making the list circular
        node.next = node;

        // The head and tail both point to this single node
        head = node;
        tail = node;

        // Set the size of the list to 1 (as we have one node)
        size = 1;

        // Return the head of the list (which is the only node in the list)
        return head;
    }

    // Method to insert a node at a specified location in the Circular Singly Linked List
    public void insertCSLL(int nodeValue, int location){
        // Create a new node to insert with the given value
        Node node = new Node();
        node.value = nodeValue;

        // Case 1: If the list is empty, create the list with this node
        if(head == null){
            createCSLL(nodeValue);  // Call the createCSLL method to create a list
            return;
        }

        // Case 2: Insert the node at the beginning (location 0)
        else if (location == 0) {
            // Set the new node's next pointer to the current head
            node.next = head;

            // Make the new node the head of the list
            head = node;

            // Since the list is circular, update the tail's next pointer to point to the new head
            tail.next = head;

        }

        // Case 3: Insert the node at the end of the list (at or beyond the last node)
        else if (location >= size) {
            // Link the current tail's next pointer to the new node
            tail.next = node;

            // Make the new node the tail of the list
            tail = node;

            // Since it's a circular list, the tail's next pointer must point to the head
            tail.next = head;
        }

        // Case 4: Insert the node at any position in the middle of the list
        else  {
            // Temporary node to traverse the list until the desired position
            Node tempNode = head;

            // Index to track the current position during traversal
            int index = 0;

            // Traverse the list to reach the node just before the desired location
            while (index < location - 1){
                tempNode = tempNode.next;  // Move to the next node
                index++;  // Increment the index
            }

            // Insert the new node by updating the next pointer of the previous node
            node.next = tempNode.next;
            tempNode.next = node;
        }

        // Increment the size of the list as we added a new node
        size++;
    }

}
