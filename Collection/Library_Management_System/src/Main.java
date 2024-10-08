import java.util.*;

public class Main {
    public static void main(S


                                    tring[] args) {
        // List of all books available
        Map<String, Integer> fiction = new HashMap<>();
        Map<String, Integer> nonFiction = new HashMap<>();

        // Initialize the book categories with some data
        fiction.put("Science Fiction", 5);
        fiction.put("Fantasy", 4);
        fiction.put("Mystery", 3);
        fiction.put("Romance", 6);
        fiction.put("Historical Fiction", 2);

        nonFiction.put("Biography", 4);
        nonFiction.put("History", 5);
        nonFiction.put("Self-Help", 7);
        nonFiction.put("Science", 3);
        nonFiction.put("Philosophy", 6);

        // Create a HashSet to store unique members who have borrowed books
        HashSet<String> borrowedMembers = new HashSet<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Menu for the Library Management System
        while (true) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add new book");
            System.out.println("2. Search for a book");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Check availability of books");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // consume newline character

            switch (option) {
                case 1:
                    addNewBook(scanner, fiction, nonFiction);
                    break;
                case 2:
                    searchForBook(scanner, fiction, nonFiction);
                    break;
                case 3:
                    borrowBook(scanner, fiction, nonFiction, borrowedMembers);
                    break;
                case 4:
                    returnBook(scanner, fiction, nonFiction, borrowedMembers);
                    break;
                case 5:
                    checkAvailability(fiction, nonFiction);
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Operation: Add a new book to the system
    private static void addNewBook(Scanner scanner, Map<String, Integer> fiction, Map<String, Integer> nonFiction) {
        System.out.println("\nEnter book category (Fiction/Non-Fiction): ");
        String category = scanner.nextLine();

        System.out.println("Enter book title: ");
        String bookTitle = scanner.nextLine();

        System.out.println("Enter the number of copies: ");
        int copies = scanner.nextInt();
        scanner.nextLine();  // consume newline character

        if (category.equalsIgnoreCase("Fiction")) {
            fiction.put(bookTitle, copies);
        } else if (category.equalsIgnoreCase("Non-Fiction")) {
            nonFiction.put(bookTitle, copies);
        } else {
            System.out.println("Invalid category.");
        }

        System.out.println("Book added successfully!");
    }

    // Operation: Search for a book
    private static void searchForBook(Scanner scanner, Map<String, Integer> fiction, Map<String, Integer> nonFiction) {
        System.out.println("\nEnter the book title to search: ");
        String bookTitle = scanner.nextLine();

        if (fiction.containsKey(bookTitle)) {
            System.out.println("Book found in Fiction category with " + fiction.get(bookTitle) + " copies.");
        } else if (nonFiction.containsKey(bookTitle)) {
            System.out.println("Book found in Non-Fiction category with " + nonFiction.get(bookTitle) + " copies.");
        } else {
            System.out.println("Book not found.");
        }
    }

    // Operation: Borrow a book
    private static void borrowBook(Scanner scanner, Map<String, Integer> fiction, Map<String, Integer> nonFiction, HashSet<String> borrowedMembers) {
        System.out.println("\nEnter your name: ");
        String memberName = scanner.nextLine();

        System.out.println("Enter the book title to borrow: ");
        String bookTitle = scanner.nextLine();

        if (fiction.containsKey(bookTitle) && fiction.get(bookTitle) > 0) {
            fiction.put(bookTitle, fiction.get(bookTitle) - 1);
            borrowedMembers.add(memberName);
            System.out.println("Book borrowed successfully.");
        } else if (nonFiction.containsKey(bookTitle) && nonFiction.get(bookTitle) > 0) {
            nonFiction.put(bookTitle, nonFiction.get(bookTitle) - 1);
            borrowedMembers.add(memberName);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }

    // Operation: Return a book
    private static void returnBook(Scanner scanner, Map<String, Integer> fiction, Map<String, Integer> nonFiction, HashSet<String> borrowedMembers) {
        System.out.println("\nEnter your name: ");
        String memberName = scanner.nextLine();

        if (!borrowedMembers.contains(memberName)) {
            System.out.println("You have not borrowed any books.");
            return;
        }

        System.out.println("Enter the book title to return: ");
        String bookTitle = scanner.nextLine();

        if (fiction.containsKey(bookTitle)) {
            fiction.put(bookTitle, fiction.get(bookTitle) + 1);
            borrowedMembers.remove(memberName);
            System.out.println("Book returned successfully.");
        } else if (nonFiction.containsKey(bookTitle)) {
            nonFiction.put(bookTitle, nonFiction.get(bookTitle) + 1);
            borrowedMembers.remove(memberName);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book not recognized.");
        }
    }

    // Operation: Check availability of books
    private static void checkAvailability(Map<String, Integer> fiction, Map<String, Integer> nonFiction) {
        System.out.println("\nAvailable Fiction Books:");
        displayBooks(fiction);
        System.out.println("\nAvailable Non-Fiction Books:");
        displayBooks(nonFiction);
    }

    // Method to display books and their available copies
    private static void displayBooks(Map<String, Integer> books) {
        for (Map.Entry<String, Integer> book : books.entrySet()) {
            System.out.println(book.getKey() + " - " + book.getValue() + " copies available");
        }
    }
}
