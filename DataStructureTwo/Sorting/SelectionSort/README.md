# Explanation of SelectionSort Code

This Java class implements the **Selection Sort** algorithm, which is a simple sorting technique. The algorithm repeatedly selects the minimum element from the unsorted portion of the array and swaps it with the first unsorted element. The process continues until the array is sorted.

## Code Breakdown

### `selectionSort(int[] arr)`
This is the method that sorts an array using the Selection Sort algorithm.

- **Input:** Takes an integer array `arr` that we want to sort.
- **Output:** The array `arr` is sorted in ascending order.

#### Steps:

1. **Outer Loop:**  
   The outer loop (`for (int j = 0; j < arr.length; j++)`) iterates over each element in the array.
   - The variable `j` represents the index where the current minimum element should be placed.

2. **Inner Loop:**  
   The inner loop (`for (int i = j + 1; i < arr.length; i++)`) starts from the next element after `j` and looks for the smallest element in the unsorted portion of the array.
   - If `arr[i]` is smaller than the current `minimumIndex`, it updates `minimumIndex` to `i`.

3. **Swapping:**  
   After the inner loop completes, if `minimumIndex` has changed (i.e., a smaller element has been found), the algorithm swaps the element at index `j` with the element at `minimumIndex`.
   - This is done using a temporary variable `temp`:
     ```java
     int temp = arr[j];
     arr[j] = arr[minimumIndex];
     arr[minimumIndex] = temp;
     ```

   This ensures that the smallest element found in the unsorted portion is placed in its correct position in the sorted portion.

### `printArray(int[] array)`
This method prints the elements of an array.

- **Input:** Takes an integer array `array`.
- **Output:** Prints the elements of the array to the console.

#### Steps:
1. It iterates over each element of the array and prints it, followed by a space.

```java
for (int i = 0; i < array.length; i++) {
    System.out.print(array[i] + " ");
}
```

### Expected output
The output after selection sort is : `-2 1 2 3 4 5 8 9 10`
