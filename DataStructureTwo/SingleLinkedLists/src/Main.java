// Main class to test the SingleLinkedList functionality
public class Main {
    public static void main(String[] args) {
        // Create a new instance of SingleLinkedList
        SingleLinkedList sLL = new SingleLinkedList();

        // Initialize the linked list with a single node with value 5
        sLL.createSingleLinkedList(5);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 3);
        sLL.insertInLinkedList(8, 4);
        sLL.insertInLinkedList(9, 6);
        System.out.print("Singly linked list before deletion : ");
        sLL.traversalSinglyLinkedList();
        // sLL.deleteOfNode(3);
        // System.out.print("Singly linked list after deletion : ");
        sLL.deleteEntireSLL();
        System.out.print("Singly linked list after entire deletion : ");
       sLL.traversalSinglyLinkedList();
    }
}
