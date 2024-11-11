// Stack class implementation using a linked list as the underlying data structure
public class Stack {
    // Linked list instance to represent the stack
    LinkedList linkedList;

    // Constructor initializes the linked list
    public Stack(){
        linkedList = new LinkedList();
    }

    // Push method to add an element at the top of the stack
    public void push(int value){
        // Insert the value at the beginning (index 0) of the linked list
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in stack");
    }

    // isEmpty method to check if the stack is empty
    public boolean isEpmty(){
        // If the head of the linked list is null, the stack is empty
        if(linkedList.head == null){
            return true;
        } else {
            return false;
        }
    }

    // Pop method to remove and return the top element from the stack
    public int pop(){
        int result = -1; // Default value if stack is empty
        if(isEpmty()){
            System.out.println("The stack is Empty");
        } else {
            // Retrieve the value at the head of the linked list
            result = linkedList.head.value;
            // Delete the head node (top element of the stack)
            linkedList.deletionOfNode(0);
        }
        return result;
    }

    // Peek method to return the top element of the stack without removing it
    public int peek(){
        if(isEpmty()){
            System.out.println("The stack is Empty");
            return -1;
        } else {
            // Return the value at the head of the linked list
            return linkedList.head.value;
        }
    }

    // Delete method to remove all elements from the stack
    public void deleteStack(){
        linkedList.head = null; // Set head to null to clear the stack
        System.out.println("The Stack is deleted");
    }
}
