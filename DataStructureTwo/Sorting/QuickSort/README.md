# QuickSort Algorithm Explanation

This code implements the **QuickSort** algorithm, a popular divide-and-conquer sorting technique. Below is an explanation of each part of the code.

## `partition` Method

The `partition` method is used to divide the array into two parts based on a pivot element.

```java
static int partition(int[] array, int start, int end) {
    int pivot = end;               // Set the pivot as the last element in the array
    int i = start - 1;             // Set the initial index for the smaller element

    // Loop through the array to compare each element with the pivot
    for (int j = start; j <= end; j++) {
        if (array[j] <= array[pivot]) {  // If the element is less than or equal to the pivot
            i++;                       // Increment the index for the smaller element
            int temp = array[i];       // Swap the elements at i and j
            array[i] = array[j];
            array[j] = temp;
        }
    }

    // Return the partition index, which is the final position of the pivot
    return i;
}
```

## How it works:

1. The method starts by selecting the last element in the array as the **pivot**.
2. The variable `i` is initialized to `start - 1`, which will track the position of elements less than or equal to the pivot.
3. The method iterates through the array, and for each element that is less than or equal to the pivot, it swaps it with the element at the `i + 1` position.
4. Finally, the method returns the index of the pivot after it has been placed in the correct position.

## quickSort Method

The `quickSort` method implements the main logic of the QuickSort algorithm. It follows a divide-and-conquer approach to efficiently sort an array. The array is partitioned into smaller subarrays, and these subarrays are sorted recursively.

### Key Steps of the `quickSort` Method:
1. **Partitioning**: The array is divided into two parts based on a pivot element. Elements less than the pivot are moved to the left, and elements greater than the pivot are moved to the right.
2. **Recursive Sorting**: The method recursively sorts the left and right subarrays.
3. **Base Case**: The recursion terminates when the subarrays have one or no elements, meaning they are already sorted.

QuickSort is a highly efficient sorting algorithm with an average time complexity of O(n log n), though in the worst case, it can degrade to O(n^2) if the pivot selection is poor.

```java
public static void quickSort(int[] array, int start, int end) {
    if (start < end) {                         // Base condition for recursion
        int pivot = partition(array, start, end);  // Get the pivot index after partitioning
        quickSort(array, start, pivot - 1);      // Recursively sort the left part of the array
        quickSort(array, pivot + 1, end);        // Recursively sort the right part of the array
    }
}
```

## How it works:

- The method checks if the start index is less than the end index, which is the base case for recursion.
- It then calls the `partition` method to get the index of the pivot after partitioning.
- The method recursively sorts the left and right parts of the array around the pivot.

## `printArray` Method:

The `printArray` method is a helper function to print the elements of the array.

```java
public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");  // Print each element followed by a space
    }
}
```

## How it works:

This method iterates over each element of the array and prints it, followed by a space.

## Example Usage:
```java
public static void main(String[] args) {
    int[] array = { 34, 7, 23, 32, 5, 62 };
    System.out.println("Original Array:");
    printArray(array);  

    quickSort(array, 0, array.length - 1);  // Sort the array using QuickSort

    System.out.println("\nSorted Array:");
    printArray(array);  // Prints the sorted array
}

```

## Output example : 
Sorted Array: `-8 -2 1 2 3 4 5 7 7 7 8 9 10 11 `
