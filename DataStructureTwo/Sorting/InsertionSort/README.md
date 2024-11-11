# Insertion Sort Code Explanation

## Overview
This Java code implements the **Insertion Sort** algorithm, which is a simple comparison-based sorting technique. It works by building a sorted array one element at a time by inserting each element into its correct position.

## Code Breakdown

### 1. **insertionSort Method**

This method performs the Insertion Sort operation on an integer array.

```java
static void insertionSort(int[] arr) {
    
    for (int i = 1; i < arr.length; i++) {
        int temp = arr[i];   
        int j = i - 1;       

        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];  
            j--;                   
        }

        arr[j + 1] = temp;
    }
}
```

### Explanation:

- The outer `for` loop starts from the second element (index 1) because the first element is considered sorted.
- For each element in the array, it is stored in the variable `temp`, which represents the element to be inserted into the sorted portion of the array.
- The inner `while` loop compares `temp` with the elements before it. If any element is greater than `temp`, it shifts the element one position to the right.
- After finding the correct position, `temp` is placed at that position.

## 2. `printArray` Method
This method prints the contents of the array to the console.
```java
public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");  
    }
    System.out.println();  
}
```

### Explanation:
The `for` loop iterates through the array and prints each element followed by a space.  
After printing all the elements, `System.out.println()` moves the cursor to the next line.

### Example of Usage
Here’s how you could use the `InsertionSort` class in your main program:

```java
public class Main {
    public static void main(String[] args) {
    
        InsertionSort is = new InsertionSort();
        
        int arr[] = {10, 50, 30, 15, 50, 6};
        
        is.insertionSort(arr);
        
        System.out.print("The output of the insertion sort is: ");
        
        is.printArray(arr);
    }
}
```

## Conclusion

Insertion Sort is an efficient algorithm for small datasets but is not suitable for large datasets due to its quadratic time complexity. The algorithm is simple and works well when data is partially sorted.

