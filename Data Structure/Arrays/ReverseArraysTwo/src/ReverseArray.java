import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseArray {

    public static void reverseIntegerArray(Scanner scanner) {
        System.out.print("Enter the number of elements in the integer array: ");
        int size = getValidIntegerInput(scanner);
        Integer[] array = new Integer[size];

        System.out.println("Enter the elements of the integer array:");
        for (int i = 0; i < size; i++) {
            array[i] = getValidIntegerInput(scanner);
        }

        System.out.println("Original Array: ");
        ArrayUtils.displayArray(array);

        reverseArray(array);

        System.out.println("Reversed Array: ");
        ArrayUtils.displayArray(array);
    }

    public static void reverseStringArray(Scanner scanner) {
        System.out.print("Enter the number of elements in the string array: ");
        int size = getValidIntegerInput(scanner);
        String[] array = new String[size];

        System.out.println("Enter the elements of the string array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.next(); // No need for validation, any input is valid
        }

        System.out.println("Original Array: ");
        ArrayUtils.displayArray(array);

        reverseArray(array);

        System.out.println("Reversed Array: ");
        ArrayUtils.displayArray(array);
    }

    // Method to reverse the array
    public static <T> void reverseArray(T[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            T temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    // Method to validate and get a valid integer input
    private static int getValidIntegerInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt(); // Tries to read an integer
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); // Consume the invalid input
            }
        }
    }
}
