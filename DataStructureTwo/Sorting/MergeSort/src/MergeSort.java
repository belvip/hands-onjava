public class MergeSort {

    // Method to merge two subarrays of A[].
    // First subarray is A[left..middle]
    // Second subarray is A[middle+1..right]
    static void merge(int[] A, int left, int middle, int right) {
        // Temporary arrays to hold the left and right subarrays
        int[] leftTempArray = new int[middle - left + 1];
        int[] rightTempArray = new int[right - middle];

        // Copy elements from the main array A[] to leftTempArray
        for (int i = 0; i < leftTempArray.length; i++) {
            leftTempArray[i] = A[left + i];
        }

        // Copy elements from the main array A[] to rightTempArray
        for (int i = 0; i < rightTempArray.length; i++) {
            rightTempArray[i] = A[middle + 1 + i];
        }

        // Initialize pointers for leftTempArray (i), rightTempArray (j), and the main array (k)
        int i = 0, j = 0;
        int k = left;

        // Merge elements from leftTempArray and rightTempArray back into A[]
        while (i < leftTempArray.length && j < rightTempArray.length) {
            // If current element of leftTempArray is smaller, add it to A[k]
            if (leftTempArray[i] <= rightTempArray[j]) {
                A[k++] = leftTempArray[i++];
            } else {
                // Else, add the element from rightTempArray to A[k]
                A[k++] = rightTempArray[j++];
            }
        }

        // Copy any remaining elements of leftTempArray into A[]
        while (i < leftTempArray.length) {
            A[k++] = leftTempArray[i++];
        }

        // Copy any remaining elements of rightTempArray into A[]
        while (j < rightTempArray.length) {
            A[k++] = rightTempArray[j++];
        }
    }

    // Method to divide the array and call merge to sort and merge parts
    public static void mergeSort(int[] Array, int left, int right) {
        if (right > left) {
            // Find the middle point to divide the array into two halves
            int m = (left + right) / 2;

            // Recursively sort the first and second halves
            mergeSort(Array, left, m);
            mergeSort(Array, m + 1, right);

            // Merge the two halves sorted in the previous steps
            merge(Array, left, m, right);
        }
    }

    // Helper method to print the array elements
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
