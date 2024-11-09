public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(8, 1);
        csll.insertCSLL(4, 8);
        // System.out.println(csll.head.value);
        //  System.out.println(csll.head.next.value);
        System.out.print("The circular singly linked list before deletion is : ");
        csll.traverseCSLL();
        // csll.searchNode(8);

        csll.deleteOfNode(2);
        System.out.print("The circular singly linked list after deletion is : ");
        csll.traverseCSLL();
    }


}
