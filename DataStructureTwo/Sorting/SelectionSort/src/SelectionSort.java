// Class to implement Selection Sort algorithm
public class SelectionSort {

    // Method to sort the array using Selection Sort
    static void selectionSort(int[] arr){
        // Outer loop to iterate over each element in the array
        for (int j = 0; j < arr.length; j++) {
            int minimumIndex = j; // Assume the current element is the smallest

            // Inner loop to find the smallest element in the remaining unsorted part of the array
            for (int i = j+1; i < arr.length; i++){
                // If a smaller element is found, update the minimumIndex
                if (arr[i] < arr[minimumIndex]){
                    minimumIndex = i;
                }
            }

            // If the smallest element is not at the current position, swap it with the current element
            if (minimumIndex != j){
                int temp = arr[j];        // Store the current element in a temporary variable
                arr[j] = arr[minimumIndex]; // Replace the current element with the smallest element
                arr[minimumIndex] = temp;  // Move the current element to the position of the smallest element
            }
        }
    }

    // Method to print the elements of the array
    public static void printArray(int array[]){
        // Loop through the array and print each element followed by a space
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // Print the current element
        }
    }
}
