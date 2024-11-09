## Stack Class Implementation 📚

### Overview 📝
This `Stack` class represents a basic stack data structure using an array to store elements. It includes methods for common stack operations: pushing, popping, and peeking values, as well as checking if the stack is empty or full.

### Class Fields

- **`arr`**: An integer array that holds the elements of the stack.
- **`topOfStack`**: Tracks the position of the top element in the stack. It is initially set to `-1`, indicating an empty stack.

---

### Constructor: `Stack(int size)` 🛠️

- Initializes the stack with a specific size.
- Creates an array `arr` of the given size and sets `topOfStack` to `-1`, representing an empty stack.
- Prints a message confirming the stack creation.

```java
public Stack(int size) { ... }
```

### Method: `push(int value)` ➕

- Adds a new value to the stack.
  - If the stack is full (`isFull()` returns true), it prints a message: "The Stack is full!".
  - Otherwise, it inserts the value at the next position and increments `topOfStack`.
- Prints a message confirming successful insertion.

```java
public void push(int value) { ... }
```

### Method: `pop()` ➖

- Removes and returns the value at the top of the stack.
- If the stack is empty (`isEmpty()` returns `true`), it prints a message: "The stack is empty" and returns `-1`.
- Otherwise, it retrieves the top value, decrements `topOfStack`, and returns the popped value.

```java
public int pop() { ... }
```

### Method: `peek()` 👀

- Returns the value at the top of the stack without removing it.
- If the stack is empty, it prints a message: "The stack is empty" and returns `-1`.
- Otherwise, it returns the value at `topOfStack`.

```java
public int peek() { ... }
```

## Summary 📊

The `Stack` class provides an efficient way to manage elements in a LIFO (Last In, First Out) manner using an array. Each method handles potential edge cases, such as the stack being full or empty, ensuring smooth operations and meaningful feedback.
