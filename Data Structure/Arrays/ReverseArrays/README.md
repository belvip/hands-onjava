# Array Reversal Program 📚

This Java program reverses an array by swapping elements from the beginning and end, moving towards the center. It allows users to input the number of elements and the elements themselves.
 Data Structure/Arrays/ReverseArrays/.gitignore
        Data Structure/Arrays/ReverseArrays/.idea/
        Data Structure/Arrays/ReverseArrays/README.md
        Data Structure/Arrays/ReverseArrays/ReverseArrays.iml

## Table of Contents 🗂️
- [Features](#features)
- [How It Works](#how-it-works)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Example](#example)
- [Contributing](#contributing)
- [License](#license)

## Features ✨
- User input for the number of elements in the array.
- User input for each element of the array.
- Displays the original array.
- Displays the reversed array.

## How It Works 🛠️
1. The program prompts the user to enter the number of elements in the array.
2. It then collects the array elements from the user.
3. The program uses a method to reverse the array by swapping elements.
4. Finally, it prints both the original and reversed arrays.

## Getting Started 🚀
To get started with this program, you need to have Java installed on your system. Follow these steps:

1. **Clone the repository or download the files**.
   ```bash
   git clone https://github.com/yourusername/array-reversal.git
   cd array-reversal


## Code Overview 💻

### Main Class: `ReverseArrayMain`
This class serves as the entry point of the program. It contains the `main` method, which interacts with the user by taking inputs, calling methods to reverse the array, and displaying the results.

#### Methods:
---

#### `public static void main(String[] args)` 🏁
- **Description**: This is the starting point of the program.
- **Process**:
  1. 📥 Prompts the user to enter the number of elements in the array.
  2. 🧑‍💻 Collects the elements from the user.
  3. 🔄 Calls the `reverseArray` method to reverse the array.
  4. 📊 Displays the original and reversed arrays using the `printArray` method.

---

#### `public static void reverseArray(int[] array)` 🔄
- **Input**: Takes an integer array as input.
- **Description**: This method reverses the array in place by swapping elements from the start and end, moving towards the center.
- **Process**:
  1. 🏁 Initializes two pointers: `start` at the beginning of the array and `end` at the last element.
  2. 🔄 Swaps the elements at the `start` and `end` positions.
  3. 🚶 Moves the `start` pointer forward and the `end` pointer backward.
  4. 🔁 Repeats the process until the `start` pointer is greater than or equal to the `end` pointer.

---

#### `public static void printArray(int[] array)` 🖨️
- **Input**: An integer array.
- **Description**: Prints the elements of the array in a formatted manner.
- **Process**:
  1. 🔎 Loops through the array elements.
  2. 🖥️ Displays the array elements in square brackets, separated by commas, e.g., `[10, 20, 30]`.

---

### Example Code Flow 🔍
1. The user is prompted to input the size of the array and then enter each element.
2. The `reverseArray` method is called to reverse the elements.
3. The `printArray` method is used to print both the original and reversed arrays.

### Error Handling 🚫
- The code assumes that the user enters valid integer inputs.
- No specific error handling is implemented for invalid input or empty arrays.

---

By understanding this code flow, you can easily extend or modify the program for different scenarios or data structures.
