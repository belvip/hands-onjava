# Circular Singly list

## Explanation of Key Sections 🔑

### `createCSLL()` Method 🌀

- **Purpose**: Creates the circular singly linked list (CSLL) with a single node.
- **Steps**:
  - Sets both the `head` and `tail` to the same node, meaning the list starts with one node.
  - The node's `next` pointer points to itself, completing the circular structure. This ensures that when traversing the list, it will loop back to the first node after reaching the tail.

### `insertCSLL()` Method  ➕

Handles inserting a new node at three places:

1. **At the Beginning**:
   - The new node is inserted before the `head`.
   - The `tail`'s `next` pointer is updated to point to the new `head`, maintaining the circular structure.

2. **At the End**:
   - The new node is inserted after the `tail`.
   - The `tail`'s `next` pointer is updated to point to the `head`, keeping the list circular.

3. **In the Middle**:
   - The new node is inserted at the given index.
   - The `next` pointer of the previous node is adjusted to point to the new node.
   - The new node's `next` pointer points to the node that follows the previous node.

### `size++` ➕
- The `size` is incremented every time a new node is inserted.
- This ensures that the list accurately tracks the number of elements, which is important for operations like insertions and deletions.

### `traverseCSLL()` Method 🚶‍♂️

The `traverseCSLL()` method allows for iterating through each node in the Circular Singly Linked List (CSLL) and printing out its values in sequence.

#### Explanation of Steps:

1. **Check if the List Exists**:
   - The method first verifies that the list is not empty by checking if `head` is not `null`.
   - If `head` is `null`, it prints "CSLL does not exist!" and exits.

2. **Initialize Traversal**:
   - A temporary node (`tempNode`) is set to `head`, marking the start of the traversal.

3. **Loop Through the Nodes**:
   - A `do-while` loop is used to ensure that the traversal completes at least one iteration, which is essential for circular lists.
   - During each iteration:
     - The `value` of the `tempNode` is printed.
     - If the `tempNode` is not the `tail` (indicated by `tempNode.next != head`), an arrow (`->`) is printed to show the link to the next node.

4. **Advance to the Next Node**:
   - The `tempNode` moves to `tempNode.next`, progressing to the next node in the list.

5. **Loop Termination**:
   - The loop continues until `tempNode` reaches `head` again, signaling that the traversal has completed one full circle of the list.

6. **Output Formatting**:
   - Once all nodes are printed, a newline (`System.out.println()`) is added for clean output.
   - **Example of output** : `The circular singly linked list is : 4 -> 8 -> 5 -> 4`


This method efficiently traverses and displays the entire circular singly linked list, ensuring a clear visual representation of its structure.
