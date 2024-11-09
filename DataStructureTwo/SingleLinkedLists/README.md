# Singly Linked List 📃

## Node Class 🔗

### Class Definition
The class `Node` represents a single node in a linked list, which can be part of a larger chain of nodes.

#### Value Field 💡
- The `value` field stores the data for the node (an integer in this case).

#### Next Field 🔄
- The `next` field is a reference to the next `Node` in the list. If it’s `null`, this node is the last one in the list.

#### Constructor 🛠️
- Adding a constructor initializes the node's `value` and sets `next` to `null` by default, making it easier to create nodes with an initial value.

This class is foundational for creating linked lists, where each node points to the next node in the sequence.

## SingleLinkedList Class 🧩

### Explanation of Each Section

#### Class Variables 🗃️
- **head**: Points to the first node in the linked list.
- **tail**: Points to the last node in the linked list.
- **size**: Keeps track of the total number of nodes in the list.

#### `createSingleLinkedList` Method 📝
- Creates a new linked list with a single node.
- Sets the `head` and `tail` to the newly created node, as it is the only node in the list.
- Initializes `size` to 1.

#### `insertInLinkedList` Method ➕
- Inserts a new node with the specified `nodeValue` at a given location in the list.
- If `location` is 0, the new node is inserted at the beginning.
- If `location` is greater than or equal to `size`, the node is added at the end of the list.
- Otherwise, the node is inserted at the specified position within the list by adjusting the `next` references.

## Singly Linked List Traversal 🔍

### `traversalSinglyLinkedList` Method 🚶‍♂️

This method traverses through the entire linked list and prints the values of the nodes.

#### Method Logic 🧠
- **Step 1: Check if the list is empty**
  - If `head` is `null`, meaning the linked list doesn't exist, it prints `"SLL doesn't exist"`.
  
- **Step 2: Start Traversing from the Head**
  - If the list exists, it initializes a temporary node (`tempNode`) to point to the `head` of the list.
  
- **Step 3: Traverse and Print Node Values**
  - The method uses a `while` loop to traverse the list, moving from one node to the next.
  - It prints the value of the current node.
  
- **Step 4: Check if the Node is the Last Node**
  - If the current node is not the last node (`tempNode.next != null`), it prints `" -> "` to indicate that there are more nodes after it.
  
- **Step 5: Move to the Next Node**
  - It then moves to the next node in the list (`tempNode = tempNode.next`).
  
- **Step 6: End the Traversal**
  - Once the loop finishes, it prints a newline (`System.out.println();`) to tidy up the output.

### Example Output 📊
For a list with nodes having values `5 -> 6 -> 9`, the output will be:

### `searchNode` Method 🔍

The `searchNode` method searches for a node with a specified value in the linked list and returns its position if found. This method provides feedback in the console about whether the node was found or not.

#### Method Details

- **Parameters**: `nodeValue` (an integer) – the value of the node we are searching for in the linked list.
- **Return Type**: `boolean` – returns `true` if the node is found, otherwise returns `false`.

#### Explanation of the Process

1. **Initialize Starting Point**:
   - `tempNode` is set to `head`, allowing the search to start from the beginning of the list.
   - `position` is initialized to `0`, which tracks the current node's position during traversal.

2. **Traverse the Linked List**:
   - A `while` loop iterates through each node until `tempNode` becomes `null`, meaning the end of the list is reached.

3. **Check Node Value**:
   - For each node, the method checks if `tempNode.value` matches `nodeValue`.
   - If a match is found:
     - The method prints a message indicating the node's value and position: `"Found node " + nodeValue + " at position : " + position`.
     - The method then returns `true`.

4. **Advance to the Next Node**:
   - If no match is found, `tempNode` moves to the next node with `tempNode.next`, and `position` is incremented by `1`.

5. **Node Not Found**:
   - If the loop completes without finding the node, a message `"Node not found"` is printed.
   - The method returns `false`, indicating the node is not in the list.

### Example Output 📊
For a list with nodes having values `Found node 9 at position : 4`, the output will be:

This method is useful for determining the presence and position of a specific value in the `SingleLinkedList`.

### `deleteOfNode` Method 🗑️

This method deletes a node from the `SingleLinkedList` at a specified location.

```java
  public void deleteOfNode(int location) { /*...*/ }
```

### Steps and Explanation

#### Check if List Exists
- If `head` is `null`, it means the list does not exist or is empty.
- The method prints a message: `"The SLL does not exist."` and exits.

#### Validate Location
- If `location` is out of bounds (either less than `0` or greater than or equal to `size`), the method prints `"Node not found at location: " + location` and exits.
- This ensures that we are deleting from a valid location.

#### Delete Head Node
- If `location` is `0`, the head node is deleted.
  - `nodeValue` stores the value of the deleted node for reference.
  - The `head` pointer is updated to the next node in the list.
  - If the list becomes empty after deletion (`size` becomes `0`), `tail` is also set to `null`.

#### Delete Last Node
- If `location` is `size - 1`, the last node is deleted.
  - A temporary node (`tempNode`) traverses to the second-to-last node.
  - The value of the last node is stored in `nodeValue`.
  - `tempNode.next` is set to `null`, making it the new end node.
  - `tail` is updated to `tempNode`.

#### Delete Node at a Specific Middle Location
- For deletions at any other location:
  - `tempNode` traverses to the node before the target.
  - The `nodeValue` is stored.
  - `tempNode.next` is updated to skip over the target node, linking it to the subsequent node.
  - This effectively removes the target node from the list.

#### Example Output
- After successfully deleting a node, the method prints `"Node " + nodeValue + " deleted at location: " + location`.
- Singly linked list before deletion : `5 -> 6 -> 7 -> 8 -> 9`
- Node `8` deleted at location: `3`
- Singly linked list after deletion : `5 -> 6 -> 7 -> 9`

This method efficiently handles edge cases for deleting nodes at various positions, such as the head, tail, and middle of the list.

### `deleteEntireSLL` Method 🗑️🚮

This method deletes the entire `SingleLinkedList`.

```java
// Method to delete the entire Singly Linked List
public void deleteEntireSLL() { /*...*/ }
```

### Steps and Explanation

#### Set `head` to `null`
- By setting the `head` to `null`, the reference to the first node is removed, effectively disconnecting the list from its first node.

#### Set `tail` to `null`
- Similarly, setting `tail` to `null` removes the reference to the last node of the list, making the list completely disconnected.

#### Confirmation Message
- After the list has been deleted, a message `"The SLL deleted successfully"` is printed to confirm the action.

This method ensures that all references to the nodes in the list are removed, effectively deleting the entire singly linked list. It handles the task by simply removing the head and tail references, making the list empty.


## Main Class 🏠

### Explanation of Each Part

#### Create `SingleLinkedList` Instance 🧑‍💻
- `sLL` is an instance of `SingleLinkedList`, which will be used to manage the list operations.

#### Creating the Initial Linked List 📑
- `createSingleLinkedList(5)` initializes the list with a single node holding the value `5`.
- `System.out.println(sLL.head.value);` prints the value of this node, verifying the list creation.

#### Inserting New Nodes 🔀
- `insertInLinkedList(6, 1)` inserts a node with value `6` at position `1`.
- `insertInLinkedList(7, 3)` adds a node with value `7` at position `3`.
- `insertInLinkedList(8, 4)` adds a node with value `8` at position `4`.
- `insertInLinkedList(9, 6)` adds a node with value `9` at position `6`.

#### Traversing the List Before Deletion 🔄
- `System.out.print("Singly linked list before deletion: ");` prints the message before showing the list.
- `sLL.traversalSinglyLinkedList();` prints the values of all nodes in the list before any deletion.

#### Deleting a Node 🗑️
- `sLL.deleteOfNode(3);` deletes the node at position `3` (the node with value `8`).

#### Traversing the List After Deletion 🔄
- `System.out.print("Singly linked list after deletion: ");` prints the message before showing the list after the deletion.
- `sLL.traversalSinglyLinkedList();` prints the values of all nodes in the list after deletion.

#### Deleting the Entire List 🧹
- `sLL.deleteEntireSLL();` deletes the entire singly linked list, making it empty.

### Summary 📊
This `Main` class demonstrates how to:
- Create a `SingleLinkedList`.
- Insert nodes at specific positions.
- Traverse and print the list.
- Delete a specific node.
- Delete the entire list.

The steps show how to manipulate a singly linked list, including performing operations such as insertion, deletion, and traversal.
 
 ### The end