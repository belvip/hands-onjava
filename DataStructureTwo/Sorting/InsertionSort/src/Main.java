public class Main {
    public static void main(String[] args) {
        // Create an array to sort
        int[] array = {10, 9, 5, 2, 7, 4, 1, 3, 8, 12};

        // Call insertionSort to sort the array
        InsertionSort.insertionSort(array);

        // Print the sorted array
        InsertionSort.printArray(array);
    }
}