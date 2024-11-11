// Class for implementing Bubble Sort algorithm
public class BubbleSort {

    // Method to sort an array using Bubble Sort
    void bubbleSort(int arr[]) {
        int n = arr.length; // Get the length of the array
        // Outer loop for each pass through the array
        for (int i = 0; i < n-1; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n-i-1; j++) {
                // Swap if the current element is greater than the next element
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];    // Store the current element in a temporary variable
                    arr[j] = arr[j+1];    // Move the next element to the current position
                    arr[j+1] = temp;      // Move the current element to the next position
                }
            }
        }
    }

    // Method to print the elements of the array
    void printArray(int arr[]) {
        int n = arr.length; // Get the length of the array
        // Loop through each element of the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Print the current element followed by a space
        }
        System.out.println(); // Print a newline after all elements are printed
    }
}
