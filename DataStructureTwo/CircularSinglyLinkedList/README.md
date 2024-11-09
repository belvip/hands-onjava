# Circular Singly list

## Explanation of Key Sections 🔑

### `createCSLL()` 🌀

- **Purpose**: Creates the circular singly linked list (CSLL) with a single node.
- **Steps**:
  - Sets both the `head` and `tail` to the same node, meaning the list starts with one node.
  - The node's `next` pointer points to itself, completing the circular structure. This ensures that when traversing the list, it will loop back to the first node after reaching the tail.

### `insertCSLL()` ➕

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
