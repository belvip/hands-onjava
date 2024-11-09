# Doubly LInked List

## 1. **`DoublyNode`** class
```java
// A class representing a single node in a doubly linked list
public class DoublyNode {

    // The integer value stored in this node
    public int value;

    // A reference to the next node in the list
    public DoublyNode next;

    // A reference to the previous node in the list
    public DoublyNode prev;
}
```
## Explanation of Each Component 🔍

### `value` 🔢
- **Purpose**: Stores the integer data for the node.
- This is the data element contained within each node, typically an integer, which can be used in search operations or for display.

### `next` ➡️
- **Purpose**: Points to the next node in the list.
- **Functionality**: Allows traversal in the forward direction, which is essential for navigating through the circular linked list.
  
### `prev` ⬅️
- **Purpose**: Points to the previous node in the list.
- **Functionality**: Enables traversal in the backward direction, a key feature of doubly linked lists but particularly valuable when searching in a circular structure, as it allows movement in both directions.

### SearchNode Method 🔍
- **Function**: Searches for a specific node value within the circular linked list.
- **How It Works**:
  - Starts at the `head` and moves forward using the `next` pointer until it finds the desired value or completes a full circle.
  - Utilizes both `next` and `prev` pointers to efficiently navigate through the list, whether the value is located early in the list or requires backward traversal.

This setup of `value`, `next`, and `prev` fields gives each node dual-direction linking, making it ideal for circular doubly linked lists where both forward and backward traversal are needed.

## 1. **`DoublyLinkedList`** class

## Explanation of `insertDLL` Method ➕

### Purpose:
The `insertDLL` method is used to insert a new node at a specific location in the doubly linked list. The method handles multiple cases such as inserting at the beginning, the end, or at a specific index in the middle of the list.

### Key Steps:

#### Case 1: The List is Empty 📭
- If the `head` is `null`, the list is empty. 
- The method calls `createDLL(nodeValue)` to create a new list with the given node value and exits.

#### Case 2: Insert at the Beginning (location == 0) 🏁
- If the specified location is `0`, the new node is inserted at the beginning of the list.
- The `newNode.next` points to the current head, and `newNode.prev` is `null` as it becomes the new head.
- The `head.prev` is updated to point to the new node, and the `head` pointer is updated to the new node.

#### Case 3: Insert at the End (location >= size) ⏹
- If the location is greater than or equal to the size of the list, the new node is inserted at the end.
- The `newNode.next` is set to `null`, indicating it will be the last node.
- The current tail's `next` pointer is updated to point to the new node, and the `newNode.prev` is set to the current tail.
- The `tail` is updated to the new node, making it the last node.

#### Case 4: Insert in the Middle (0 < location < size) 🌐
- For inserting at any position in the middle, the method traverses the list until it reaches the node just before the specified location.
- The `newNode.prev` points to the node before the specified location, and `newNode.next` points to the node at the specified location.
- The `tempNode.next` is updated to point to the new node, and the node at the specified location's `prev` pointer is updated to point to the new node.

#### Update Size 🔢
- After inserting the new node, the `size` of the list is incremented by 1.

### Summary:
The `insertDLL` method provides flexibility to insert a new node at any position in the doubly linked list. It handles edge cases like inserting at the head or the tail, and it updates the previous and next pointers of surrounding nodes to maintain the doubly linked structure.


## `traverseDLL()` Method Explanation 🔍

### Purpose
The `traverseDLL()` method is used to traverse a Doubly Linked List (DLL) and print the values of its nodes in order.

### Steps and Explanation

1. **Check if the List is Empty**:
   - The method first checks if the `head` of the list is `null`. If it is `null`, the list is empty, and the method prints `"The DLL does not exist"`.

2. **Traverse the List**:
   - If the list is not empty, a temporary node (`tempNode`) is created, starting at the `head` of the list.
   - The list is traversed by moving from one node to the next (`tempNode = tempNode.next`) until the end of the list is reached (when `tempNode` is `null`).

3. **Print Node Values**:
   - The value of the current node is printed.
   - If the current node is not the last node (i.e., `tempNode.next != null`), a separator `" -> "` is printed to show the connection between the nodes.
   
4. **Print Newline**:
   - After traversing all nodes and printing their values, a newline is printed to end the output.

5. **Example of Output**
   - `2 -> 3 -> 1 -> 4`

### Summary
This method provides a way to visualize the values stored in a Doubly Linked List by printing them in order, with a separator to indicate the link between each node.


## `reverseTraverseDLL()` Method 🔄

### Purpose:
- This method traverses a doubly linked list (DLL) in reverse, starting from the `tail` and moving towards the `head`, printing the values of the nodes.

### Explanation:

1. **Check if List Exists**:
   - The method first checks if the `head` is not `null`, indicating that the doubly linked list exists.
   - If the list does not exist (i.e., `head` is `null`), a message `"The DLL does not exist!"` is printed.

2. **Traverse from Tail to Head**:
   - If the list exists, a temporary node (`tempNode`) is initialized to point to the `tail`.
   - The method then enters a `while` loop that continues until `tempNode` becomes `null`.
     - In each iteration, the value of the `tempNode` is printed.
     - If the `tempNode` has a `prev` (previous) node, `" <- "` is printed to indicate the direction of traversal.
     - The `tempNode` is then updated to point to the previous node (`tempNode = tempNode.prev`), effectively moving towards the `head`.

3. **End of Traversal**:
   - Once the loop finishes (when `tempNode` is `null`), a new line (`\n`) is printed to complete the output.

### Output:
- The method prints the values of the nodes in reverse order, starting from the `tail` and traversing backwards to the `head`.
5. **Example of Output**
   - `10 <- 4 <- 1 <- 3 <- 2`

### Summary:
- This method efficiently traverses the doubly linked list in reverse and provides a clear view of the list's elements in reverse order.

## `searchNode(int nodeValue)` 🔍

### Explanation of Key Sections

- **Purpose**: This method searches for a node with a specified value in a circular singly linked list (CSLL).

### Steps:

1. **Check if List Exists** ❓:
   - The method first checks if the list is empty (i.e., if the `head` is `null`).
   - If the list is empty, it prints "The list does not exist." and returns `false` to indicate that the search cannot proceed.

2. **Initialize Traversal** 🛣️:
   - A temporary node (`tempNode`) is initialized to the `head`, which is the starting point of the traversal.
   - A `position` variable is initialized to track the position of each node as we traverse the list.

3. **Traverse the List** 🚶‍♂️:
   - A `do-while` loop is used to traverse the list. The loop will continue until it loops back to the `head`, completing a full circle.
   - Inside the loop:
     - It checks if the `value` of the current node (`tempNode.value`) matches the search value (`nodeValue`).
     - If the node is found, it prints the message "Found node `nodeValue` at position: `position`" and returns `true` to indicate the node was found.
   
4. **Move to the Next Node** ➡️:
   - If the current node does not match the search value, it moves to the next node (`tempNode = tempNode.next`) and increments the `position` counter.

5. **End of Traversal** 🔄:
   - The loop continues until it loops back to the `head`, signaling that all nodes in the list have been checked.
   - If the node is not found by the time the traversal completes, it prints "Node not found" and returns `false`.

### Summary:
This method efficiently searches for a node in a circular linked list by traversing the list starting from the `head` and looping back once it reaches the end. If the node is found, its position is printed, and the method returns `true`; otherwise, it returns `false` indicating the node was not found.
