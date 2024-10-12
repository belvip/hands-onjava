import java.util.Scanner;

public class ReverseArrayMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("====== Array Reversal Program ======");
            System.out.println("1. Reverse an Integer Array");
            System.out.println("2. Reverse a String Array");
            System.out.println("3. Exit");
            System.out.print("Please select an option (1-3): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ReverseArray.reverseIntegerArray(scanner);
                    break;
                case 2:
                    ReverseArray.reverseStringArray(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
