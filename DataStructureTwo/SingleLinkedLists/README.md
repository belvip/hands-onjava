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

## Main Class 🏠

### Explanation of Each Part

#### Create `SingleLinkedList` Instance 🧑‍💻
- `sLL` is an instance of `SingleLinkedList`, which will be used to manage the list operations.

#### Creating the Initial Linked List 📑
- `createSingleLinkedList(5)` initializes the list with a single node holding the value `5`.
- `System.out.println(sLL.head.value);` prints the value of this node, verifying the list creation.

#### Inserting New Nodes 🔀
- `insertInLinkedList(6, 1)` inserts a node with value `6` at position `1`, making it the new end node.
- `insertInLinkedList(9, 4)` adds a node with value `9` at position `4`, which is beyond the list's current length, so it is added to the end.

#### Accessing and Printing Node Values 🔍
- `System.out.println(sLL.head.next.next.value);` accesses the node at the third position and prints its value, expected to be `9` based on the insertions.

### Summary 📊
This setup shows how to initialize and manipulate a `SingleLinkedList` by adding nodes and printing values at specific positions.
