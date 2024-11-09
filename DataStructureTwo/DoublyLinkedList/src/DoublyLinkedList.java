public class DoublyLinkedList {
    // The head and tail of the doubly linked list
    DoublyNode head;
    DoublyNode tail;
    // The size of the list
    int size;

    // Method to create a new doubly linked list with a single node
    public DoublyNode createDLL(int nodeValue) {
        // Create the head node and initialize it
        head = new DoublyNode();
        // Create a new node to be inserted
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;  // Set the value of the new node
        newNode.next = null;        // No next node, as this is the only node
        newNode.prev = null;        // No previous node, as this is the only node
        head = newNode;             // Set the head to the new node
        tail = newNode;             // The tail is also the new node, as there's only one
        size = 1;                   // Set size to 1, as we have one node
        return head;                // Return the head of the list
    }

    // Method to insert a node at a specific location in the doubly linked list
    public void insertDLL(int nodeValue, int location) {
        // Create a new node to insert
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue; // Set the value of the new node

        // Case 1: The list is empty
        if (head == null) {
            // If the list is empty, create a new list with the given value
            createDLL(nodeValue);
            return; // Exit, as the new node is inserted
        }
        // Case 2: Insert at the beginning (location == 0)
        else if (location == 0) {
            // Set the new node's next to the current head
            newNode.next = head;
            newNode.prev = null; // The new node has no previous node, as it becomes the head
            head.prev = newNode; // Update the current head's previous pointer to point to the new node
            head = newNode;      // Update the head to the new node
        }
        // Case 3: Insert at the end (location >= size)
        else if (location >= size) {
            newNode.next = null; // The new node will be the last node, so its next is null
            tail.next = newNode; // Update the current tail's next to point to the new node
            newNode.prev = tail; // The new node's previous pointer should point to the current tail
            tail = newNode;      // Update the tail to the new node
        }
        // Case 4: Insert at a middle position (location > 0 && location < size)
        else {
            // Traverse to the node just before the specified location
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next; // Move to the next node
                index++;
            }
            // Set the new node's previous and next pointers
            newNode.prev = tempNode;         // The new node's previous pointer points to the node at location-1
            newNode.next = tempNode.next;    // The new node's next pointer points to the node at location
            tempNode.next = newNode;         // Update the current node at location-1's next to the new node
            newNode.next.prev = newNode;     // Update the node at location's previous pointer to the new node
        }
        size++; // Increase the size of the list
    }

    // Tranverse DLL
    public void traverseDLL() {
        // Check if the doubly linked list is not empty (head is not null)
        if (head != null) {
            // Create a temporary node that starts from the head of the list
            DoublyNode tempNode = head;

            // Traverse the list until the last node (next is null)
            while (tempNode != null) {
                // Print the value of the current node
                System.out.print(tempNode.value);

                // If it's not the last node, print the separator " -> "
                if (tempNode.next != null) {
                    System.out.print(" -> ");
                }

                // Move to the next node in the list
                tempNode = tempNode.next;
            }
        } else {
            // If the list is empty, print an appropriate message
            System.out.println("The DLL does not exist");
        }

        // Print a newline after the list is traversed
        System.out.println("\n");
    }

    // Reverse Traverse
    // Method to traverse the Doubly Linked List (DLL) in reverse order
    public void reverseTraverseDLL() {
        // Check if the DLL is not empty (i.e., head is not null)
        if (head != null) {
            // Start the traversal from the tail node
            DoublyNode tempNode = tail;

            // Traverse the DLL backwards by following the 'prev' pointers
            while (tempNode != null) {
                // Print the value of the current node
                System.out.print(tempNode.value);

                // If the current node is not the first node (has a previous node),
                // print a separator (" <- ") to indicate the direction of traversal
                if (tempNode.prev != null) {
                    System.out.print(" <- ");
                }

                // Move to the previous node (reverse direction)
                tempNode = tempNode.prev;
            }
        } else {
            // If the DLL is empty (head is null), print a message indicating that the DLL does not exist
            System.out.println("The DLL does not exist!");
        }

        // Print a new line after traversal is complete
        System.out.println("\n");
    }


    // Search Method to find a node in the Doubly Linked List
    public boolean searchNode(int nodeValue) {
        // Check if the list is empty (head is null)
        if (head == null) {
            System.out.println("The list does not exist.");
            return false; // Return false if the list doesn't exist
        }

        // Initialize the temporary node to traverse the list, starting from the head
        DoublyNode tempNode = head;

        // Initialize position variable to keep track of the node's position in the list
        int position = 0;

        // Use a do-while loop to traverse the list, since we are checking the node value first
        do {
            // If the value of the current node matches the search value
            if (tempNode.value == nodeValue) {
                // Print the found node and its position
                System.out.println("Found node " + nodeValue + " at position: " + position + "\n");
                return true; // Return true to indicate the node was found
            }

            // Move to the next node
            tempNode = tempNode.next;

            // Increment the position counter
            position++;

            // Continue the loop until we have traversed all nodes and looped back to the head
        } while (tempNode != head); // The loop stops when it circles back to the head node, indicating a full traversal

        // If the loop finishes without finding the node, print a message and return false
        System.out.println("Node not found");
        return false;
    }

    // Delete a node from Doubly linked list
    public void deleteOfNode(int location) {
        if (head == null) { // Check if the list is empty
            System.out.println("The doubly linked list does not exist");
            return;
        }

        if (location < 0 || location >= size) { // Check if the location is valid
            System.out.println("Node not found at location: " + location);
            return;
        }

        int nodeValue; // Variable to store the value of the deleted node

        // Case 1: Deleting the head node
        if (location == 0) {
            nodeValue = head.value;

            if (head == tail) { // If there is only one node in the list
                head = tail = null; // Set both head and tail to null (empty list)
                size = 0;
            } else {
                head = head.next; // Move head to the next node
                head.prev = null; // Update the new head's previous pointer to null
                tail.next = head; // Update tail's next pointer to point back to the new head (circular)
                size--;
            }
        }
        // Case 2: Deleting the tail node
        else if (location == size - 1) {
            DoublyNode tempNode = head;

            // Traverse to the second-to-last node using a while loop
            while (tempNode.next != tail) {
                tempNode = tempNode.next;
            }

            nodeValue = tail.value;
            tempNode.next = head; // Set the second-to-last node's next to head (circular)
            tail = tempNode;      // Update tail to the second-to-last node
            tail.prev = tempNode; // Update the new tail's previous pointer
            size--;
        }
        // Case 3: Deleting a node at any other location
        else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location - 1; i++) { // Traverse to the node just before the location
                tempNode = tempNode.next;
            }

            nodeValue = tempNode.next.value;
            tempNode.next = tempNode.next.next; // Skip the node at 'location' and link to the next node

            if (tempNode.next != null) {        // If it's not the last node
                tempNode.next.prev = tempNode;  // Update the previous pointer of the next node
            }
            size--;
        }

        System.out.println("Node " + nodeValue + " deleted at location: " + location);
    }


    // Method to delete the entire Singly Linked List
    public void deleteEntireSLL() {
        // Set head to null, which removes the reference to the first node
        head = null;

        // Set tail to null, which removes the reference to the last node
        tail = null;

        // Print confirmation message indicating the list has been deleted
        System.out.println("The SLL deleted successfully");
    }



}
