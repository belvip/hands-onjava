# 🚀 Java Array Reversal Program

This Java program reverses both integer and string arrays by swapping elements from the beginning and end, moving towards the center. The user can input the number of elements and the elements themselves, and the program will display both the original and reversed arrays.

## Table of Contents 📑

- [Features](#features)
- [How It Works](#how-it-works)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Example](#example)
- [Contributing](#contributing)
- [License](#license)

## Features ✨

- Reverse an integer array or a string array.
- User input for the number of elements in the array.
- User input for each element of the array.
- Displays the original and reversed arrays.

## How It Works 🛠️

1. The user is prompted to choose between reversing an **integer** array or a **string** array.
2. The program asks the user for the number of elements in the array.
3. It then takes each element input from the user and stores it in an array.
4. Using a method, the program reverses the array by swapping elements.
5. Finally, it prints the original and reversed arrays to the console.

### Method Breakdown 🧑‍💻

- `reverseIntegerArray(Scanner scanner)`: Handles input for integers, stores them in an array, and reverses it.
- `reverseStringArray(Scanner scanner)`: Handles input for strings, stores them in an array, and reverses it.
- `reverseArray(T[] array)`: A generic method that can reverse any array type.
- `displayArray(T[] array)`: Displays the contents of the array.

## Getting Started 🚀

Follow these steps to run the program:

1. **Clone the repository**.
   ```bash
   git clone https://github.com/yourusername/java-array-reversal.git
   cd java-array-reversal


## Prerequisites 🛠️
You will need:

- **Java installed** on your system (version 8 or higher).
- A **terminal or command line interface** to run the program.

## Usage 💻
Once the program is running:

1. **Select the type of array to reverse:**
   - Type **1** for an integer array.
   - Type **2** for a string array.
   
2. **Input the number of elements in the array.**

3. **Enter each element one by one.**

4. **View the original and reversed arrays** displayed in the terminal.
