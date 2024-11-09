public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        dll.insertDLL(2, 0);
        dll.insertDLL(3, 1);
        dll.insertDLL(4, 7);
        dll.insertDLL(10, 8);
        // System.out.println(dll.head.next.value);
        dll.traverseDLL();
        dll.reverseTraverseDLL();
        dll.searchNode(4);
        dll.deleteOfNode(3);
        dll.traverseDLL();
    }
}
