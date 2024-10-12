# Singly Linked List Program 📚

This Java program implements a singly linked list, allowing you to insert nodes at the beginning of the list and print the entire list.

## Table of Contents 🗂️
- [Features](#features)
- [How It Works](#how-it-works)
- [Algorithm Steps](#algorithm-steps)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Example](#example)
- [Contributing](#contributing)
- [License](#license)

## Features ✨
- Insert a new node at the beginning of the list.
- Print the entire linked list.

## How It Works 🛠️
1. **Node Class**: Represents each element in the linked list with data and a pointer to the next node.
2. **Singly Linked List Class**: Manages the list operations, including inserting nodes and printing the list.
3. **Main Class**: Tests the functionality by inserting nodes and displaying the list.

## Algorithm Steps 🧩
1. **Create a Node**: Initialize a new node with the provided data.
   - `Node newNode = new Node(data);` 🆕
  
2. **Insert at Beginning**: Set the new node's next pointer to the current head.
   - `newNode.next = head;` ↖️
  
3. **Update Head**: Make the new node the new head of the list.
   - `head = newNode;` 🔝

4. **Print the List**: Traverse the list from head to end, printing each node's data.
   - Use a loop to print until reaching `null`. 🔄

## Getting Started 🚀
To get started with this program, you need to have Java installed on your system. Follow these steps:

1. **Clone the repository or download the files**.
   ```bash
   git clone https://github.com/yourusername/singly-linked-list.git
   cd singly-linked-list
