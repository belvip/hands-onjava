public class Main {
    public static void main(String[] args) {
        // Initialize an array with some elements to be sorted
        int array[] = {10, 3, 2, 7, 7, 5, -8, 4, 1, -2, 9, 7, 8, 11};

        // Call quickSort method from QuickSort class to sort the array
        // Parameters are the array, the leftmost index (0), and the rightmost index (array.length - 1)
        QuickSort.quickSort(array, 0, array.length - 1);
        System.out.print("\nSorted Array: ");

        // Call printArray method from QuickSort class to print the sorted array
        QuickSort.printArray(array);
    }
}
