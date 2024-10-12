# Singly Linked List - Insert Node at the End 📚

This Java program demonstrates how to insert a node at the end of a singly linked list. It provides methods to create a linked list, insert nodes at the end, and print the list.

## Table of Contents 🗂️
- [Features](#features)
- [How It Works](#how-it-works)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Code Overview](#code-overview)
- [Differences Between Insertion Methods](#differences-between-insertion-methods)
- [Contributing](#contributing)
- [License](#license)

## Features ✨
- Insert a new node at the end of the singly linked list.
- Print the linked list to view its elements.

## How It Works 🛠️
1. Create a new node with the given data.
2. Check if the list is empty:
   - If it is empty, set the head to the new node.
   - If it is not empty, traverse to the last node and link its `next` pointer to the new node.
3. Print the linked list to display the current elements.

## Getting Started 🚀
To get started with this program, ensure you have Java installed. Follow these steps:

1. **Clone the repository or download the files**.
   ```bash
   git clone https://github.com/yourusername/singly-linked-list.git
   cd singly-linked-list


## Usage 💻
Once the program is running:

1. **Add nodes** to the linked list using the insert method. ➕
2. **View the linked list** displayed in the terminal. 🖥️

## Code Overview 📝
The program consists of three classes:

- **Node**: Represents each element in the linked list, holding data and a pointer to the next node. 📦
- **SinglyLinkedList**: Contains methods to manage the linked list, including inserting a node at the end and printing the list. 📋
- **Main**: The main class to test the implementation. 🚀

## Differences Between Insertion Methods ⚖️
### Insert at the Beginning:
- **Operation**: Adds the new node at the start of the list. 🏁
- **Time Complexity**: O(1) - Constant time. ⏱️
- **Order**: Reverses the order of elements. 🔄

### Insert at the End:
- **Operation**: Adds the new node at the end of the list. 🏁
- **Time Complexity**: O(n) - Linear time (requires traversal). ⏳
- **Order**: Maintains the order of elements. 📊

Choosing the appropriate insertion method depends on the use case and desired behavior of the linked list. 🤔

## Contributing 🤝
Feel free to contribute by opening issues or submitting pull requests. 🛠️
