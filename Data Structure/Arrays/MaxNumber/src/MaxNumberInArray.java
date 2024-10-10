import java.util.Scanner;

public class MaxNumberInArray {
    public static void main(String[] args) {
        // Create a scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Handle the case when the array is empty
        if (size <= 0) {
            System.out.println("The array is empty or invalid. Please enter a valid size.");
            return;
        }

        // Create an array of the specified size
        int[] numbers = new int[size];

        // Prompt the user to input array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();  // Accept user input for each array element
        }

        // Calling the method to find the maximum number
        int max = findMax(numbers);

        // Printing the result
        System.out.println("The maximum number in the array is: " + max);

        scanner.close();  // Close the scanner to prevent resource leak
    }

    // Method to find the maximum number in the array
    public static int findMax(int[] array) {
        // Assume the first number in the array is max
        int max = array[0];

        // Loop through the array from the second element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];  // Update max if current element is greater
            }
        }

        // Return the maximum value
        return max;
    }
}
