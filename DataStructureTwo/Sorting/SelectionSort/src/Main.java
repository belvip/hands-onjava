// Main class to demonstrate the Selection Sort algorithm
public class Main {
    public static void main(String[] args) {

        // Initialize an unsorted array of integers
        int array[] = {10, 3, 2, 5, 8, 4, 1, 9, -2};

        // Call the selectionSort method from the SelectionSort class to sort the array
        SelectionSort.selectionSort(array);

        // Print a message before displaying the sorted array
        System.out.print("The output after selection sort is : ");

        // Call the printArray method from the SelectionSort class to display the sorted array
        SelectionSort.printArray(array);
    }
}
