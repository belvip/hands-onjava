public class QuickSort {

    // Partition method: selects a pivot and rearranges the array
    static int partition(int[] array, int start, int end) {
        int pivot = end;  // Pivot is the last element of the array
        int i = start - 1; // Pointer for the smaller element

        // Loop through the array and rearrange elements
        for (int j = start; j <= end; j++) {
            // If current element is less than or equal to pivot
            if (array[j] <= array[pivot]) {
                i++; // Move the smaller element pointer
                // Swap elements to ensure smaller elements are before the pivot
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Return the index of the pivot after partitioning
        return i;
    }

    // QuickSort method: recursively sorts the array
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            // Partition the array and get the pivot index
            int pivot = partition(array, start, end);
            // Recursively apply QuickSort on left and right sub-arrays
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    // Helper method to print the array elements
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // Print each element of the array
        }
    }
}
