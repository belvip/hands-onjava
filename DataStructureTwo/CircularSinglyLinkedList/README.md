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


## `searchNode` Method 🔍

### Purpose
The `searchNode` method is designed to search for a node with a specific value in a circular singly linked list.

### Explanation of Steps

1. **Check if the List is Empty**:
   - If the `head` is `null`, it means the list is empty, and there is nothing to search.
   - Prints "The list does not exist." and returns `false`.

2. **Initialize Search Variables**:
   - A temporary node (`tempNode`) is set to start at the `head`.
   - A `position` counter is initialized to track the current node’s position as the search progresses.

3. **Loop through the Circular List**:
   - Uses a `do-while` loop to iterate through each node in the circular list.
   - **Check Node Value**:
     - If `tempNode.value` matches `nodeValue`, the node is found, and the position is printed with a message: "Found node `nodeValue` at position: `position`."
     - Returns `true` to indicate a successful search.
   - **Move to the Next Node**:
     - `tempNode` is updated to point to the next node, and `position` is incremented.
   - **Loop Condition**:
     - The loop stops once `tempNode` loops back to the `head`, completing a full circle.

4. **Node Not Found**:
   - If the loop completes without finding the node, a message "Node not found" is printed.
   - Returns `false` to indicate the node does not exist in the list.

5. **Example of Output**
   - `Found node 8 at position: 1`

This method efficiently searches for a node in a circular linked list, returning the position if the node is found and confirming its absence otherwise.

## `deleteOfNode()` Method 🗑️

This method deletes a node at a specified location in the circular singly linked list (CSLL). It handles deletions for the head, tail, and middle nodes, updating the circular links as needed.

### Steps and Explanation 📝

#### 1. Check if the List Exists 🚫
- **Condition**: If `head` is `null`, it indicates that the list is empty.
- **Action**: Prints "The csLL does not exist" and exits the method.

#### 2. Validate Location 📍
- **Condition**: If `location` is out of bounds (either less than `0` or greater than or equal to `size`).
- **Action**: Prints "Node not found at location: " + location and exits the method, ensuring that deletion is only attempted at valid locations.

#### 3. Delete Head Node 🔝
- **Condition**: If `location` is `0`, the head node is deleted.
- **Steps**:
  - Stores the `value` of the deleted node in `nodeValue`.
  - **If there's only one node** (i.e., `head` equals `tail`):
    - Sets both `head` and `tail` to `null` and `size` to `0`, indicating an empty list.
  - **If there are multiple nodes**:
    - Updates `head` to the next node.
    - Sets `tail.next` to point to the new `head`, maintaining the circular link.
    - Decrements `size`.

#### 4. Delete Tail Node 🔚
- **Condition**: If `location` is `size - 1`, indicating the last node.
- **Steps**:
  - A temporary node (`tempNode`) traverses to the second-to-last node.
  - Stores the `value` of the deleted tail node in `nodeValue`.
  - Updates `tempNode.next` to point to `head`, making `tempNode` the new tail.
  - Sets `tail` to `tempNode` and decrements `size`.

#### 5. Delete Node at a Specific Middle Location ↔️
- **Condition**: For deletions at any other `location` within the list.
- **Steps**:
  - `tempNode` traverses to the node just before the target location.
  - Stores the `value` of the node to be deleted in `nodeValue`.
  - Updates `tempNode.next` to skip over the target node, linking it to the node that follows.
  - Decrements `size`.

#### 6. Output Confirmation 📢
- **Action**: After successfully deleting a node, prints "Node " + nodeValue + " deleted at location: " + location.
- This method efficiently handles deletions at various positions (head, tail, or middle) while maintaining the circular structure of the list.

### 7. Example of Output
- * The circular singly linked list before deletion is : `4 -> 8 -> 5 -> 4`
- * Node 5 deleted at location: `2
- * The circular singly linked list after deletion is : `4 -> 8 -> 4`
