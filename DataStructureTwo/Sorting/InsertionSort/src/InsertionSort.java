public class InsertionSort {
    // Method to perform the Insertion Sort
    static void insertionSort(int[] arr) {
        // Start from the second element (index 1)
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];   // The element to be inserted
            int j = i - 1;       // Start comparing with the element before it

            // Shift elements of arr[0..i-1] that are greater than temp
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];  // Move elements one position ahead
                j--;                   // Move to the previous element
            }

            // Place temp (the element to be inserted) at its correct position
            arr[j + 1] = temp;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");  // Print each element on the same line
        }
        System.out.println();  // Move to a new line after printing the array
    }
}


