// Main class to test the MergeSort algorithm
public class Main {
    public static void main(String[] args) {

        // Initialize an array with unsorted integers
        int array[] = {10, 3, 5, 8, 4, 1, 2, 9, 7, 11};

        // Call the mergeSort method to sort the array
        // Passes the array, starting index (0), and ending index (array length - 1)
        MergeSort.mergeSort(array, 0, array.length - 1);

        // Print the sorted array to the console
        System.out.print("Sorted array: ");
        MergeSort.printArray(array);
    }
}
