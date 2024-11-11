# BubbleSort Class

This Java class implements the **Bubble Sort** algorithm to sort an array in ascending order and provides a method to print the sorted array.

## `bubbleSort` Method

The `bubbleSort` method sorts an array using the Bubble Sort algorithm. This algorithm repeatedly steps through the array, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the array is sorted.


```java
   
    void bubbleSort(int arr[]) {
        int n = arr.length; 
        
        for (int i = 0; i < n-1; i++) {
           
            for (int j = 0; j < n-i-1; j++) {
                
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];    
                    arr[j] = arr[j+1];    
                    arr[j+1] = temp;     
                }
            }
        }
    }
```

### Explanation

- **Outer Loop**: The outer loop iterates through the array multiple times. Each iteration moves the next largest unsorted element to its correct position.
  
- **Inner Loop**: The inner loop compares adjacent elements. For each pair, if the current element is greater than the next element, they are swapped.
  
- **Swapping**: The `if` statement checks if an element is greater than the next element. If so, a temporary variable `temp` is used to swap them, ensuring the larger element "bubbles" up to its correct position.

## `printArray` Method

The `bubbleSort` method prints each element in the array followed by a space.

```java
    // Method to print the elements of the array
    void printArray(int arr[]) {
        int n = arr.length; // Get the length of the array
        // Loop through each element of the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Print the current element followed by a space
        }
        System.out.println(); // Print a newline after all elements are printed
    }

```

### Explanation

- **Loop Through Array**: A `for` loop iterates over each element of the array.
- **Print Element**: Each element is printed followed by a space to display the array elements in a single line.
- **New Line**: A new line is printed after all elements are displayed.

This method is useful for checking the sorted array after using the `bubbleSort` method.

## `Usage Example` 

To use the `bubbleSort` class.

```java
public class Main {
    public static void main(String[] args) {

        // Create an instance of BubbleSort
        BubbleSort bs = new BubbleSort();

        // Initialize an array with unsorted values
        int arr[] = {10, 50, 30, 15, 50, 6};

        // Call the bubbleSort method to sort the array
        bs.bubbleSort(arr);

        // Print a message before displaying the sorted array
        System.out.print("The output of the bubble sort is : ");

        // Call the printArray method to display the sorted array
        bs.printArray(arr);
    }
}
```

## `Output example`
- The output of the bubble sort is : `6 10 15 30 50 50`