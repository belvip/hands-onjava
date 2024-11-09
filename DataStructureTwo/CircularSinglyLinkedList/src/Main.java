public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(8, 1);
        csll.insertCSLL(4, 8);
        // System.out.println(csll.head.value);
        //  System.out.println(csll.head.next.value);
        System.out.print("The circular singly linked list is : ");
        csll.traverseCSLL();
        csll.searchNode(8);
    }


}
