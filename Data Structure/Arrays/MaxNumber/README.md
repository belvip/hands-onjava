# Maximum Number in an Array

This Java program allows users to input an array of integers and then determines the maximum value in that array. It also handles edge cases, such as an empty array or arrays with negative numbers.

## Problem Statement
The task is to find the largest (maximum) number in an array provided by the user. The program accepts the size of the array and its elements as inputs.

## Algorithm
1. The user inputs the size of the array.
2. The program checks if the size is valid (greater than 0).
3. The user inputs the elements of the array.
4. The program assumes the first element is the maximum.
5. It loops through the array to update the maximum if a larger value is found.
6. The program prints the maximum number found in the array.

## Code Overview

1. **User Input**: The program uses the `Scanner` class to accept user input for the size of the array and the elements themselves.
2. **Edge Case Handling**: 
   - If the user enters a size less than or equal to 0, the program prints an error message and exits.
   - The program handles arrays with both positive and negative numbers.
3. **Maximum Calculation**: 
   - The program uses the `findMax(int[] array)` method to determine the maximum number in the array.

### `findMax(int[] array)` Method

This method finds and returns the maximum number in the array.

#### Parameters:
- **`int[] array`**: The array of integers provided by the user.

#### Logic:
1. **Initialize**: The method assumes the first element of the array is the maximum (`max = array[0]`).
2. **Iteration**: It then iterates through the rest of the array, comparing each element to `max`.
3. **Update**: If any element is greater than `max`, it updates `max`.
4. **Return**: After completing the iteration, it returns the maximum value found.

### Example:
For an array input of `[46, 10, 25, 67, 89, 90, 53]`, the method will return `90` as the maximum value.

### Example Output

For the input:
