// ArrayUtils.java
public class ArrayUtils {

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;              // Pointer at the beginning of the array
        int end = array.length - 1; // Pointer at the end of the array

        // Continue swapping until the start pointer is greater than or equal to the end pointer
        while (start < end) {
            // Swap elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the pointers towards the center
            start++;
            end--;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
