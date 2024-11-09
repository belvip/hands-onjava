// Main class to test the SingleLinkedList functionality
public class Main {
    public static void main(String[] args) {
        // Create a new instance of SingleLinkedList
        SingleLinkedList sLL = new SingleLinkedList();

        // Initialize the linked list with a single node with value 5
        sLL.createSingleLinkedList(5);

        // Print the value of the head node (should be 5)
        System.out.println(sLL.head.value);

        // Insert a new node with value 6 at position 1 (end of the list)
        sLL.insertInLinkedList(6, 1);

        // Insert a new node with value 9 at position 4
        // Since 4 is out of the current range, this node will be added to the end of the list
        sLL.insertInLinkedList(9, 4);

        // Print the value of the node at the second position after the head (should be 9)
        System.out.println(sLL.head.next.next.value);
    }
}
