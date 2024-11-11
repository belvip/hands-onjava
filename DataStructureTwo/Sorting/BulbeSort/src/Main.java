// Main class to demonstrate Bubble Sort
public class Main {
    public static void main(String[] args) {

        // Create an instance of BubbleSort
        BubbleSort bs = new BubbleSort();

        // Initialize an array with unsorted values
        int arr[] = {10, 50, 30, 15, 50, 6};

        // Call the bubbleSort method to sort the array
        bs.bubbleSort(arr);

        // Print a message before displaying the sorted array
        System.out.print("The output of the bubble sort is : ");

        // Call the printArray method to display the sorted array
        bs.printArray(arr);
    }
}
