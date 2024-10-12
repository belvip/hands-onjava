// Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt(); // Read each element from the user
        }

        System.out.println("Original array:");
        ArrayUtils.printArray(array); // Print the original array

        // Reverse the array
        ArrayUtils.reverseArray(array);

        System.out.println("Reversed array:");
        ArrayUtils.printArray(array); // Print the reversed array

        scanner.close(); // Close the scanner
    }
}
