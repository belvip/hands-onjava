import java.util.*;

public class LibraryManagementSystem {

    // Maps to store books and their available copies
    private Map<String, Integer> fictionBooks;
    private Map<String, Integer> nonFictionBooks;

    // Set to store unique members who have borrowed books
    private Set<String> borrowedMembers;

    // Map to keep track of borrowed books by members
    private Map<String, List<String>> memberBorrowedBooks;

    public LibraryManagementSystem() {
        fictionBooks = new HashMap<>();
        nonFictionBooks = new HashMap<>();
        borrowedMembers = new HashSet<>();
        memberBorrowedBooks = new HashMap<>();

        // Initialize the library with some books
        initializeBooks();
    }

    private void initializeBooks() {
        // Add books to Fiction category with dummy copies available
        fictionBooks.put("Science Fiction", 5);
        fictionBooks.put("Fantasy", 4);
        fictionBooks.put("Mystery", 3);
        fictionBooks.put("Romance", 6);
        fictionBooks.put("Historical Fiction", 2);

        // Add books to Non-Fiction category with dummy copies available
        nonFictionBooks.put("Biography", 4);
        nonFictionBooks.put("History", 5);
        nonFictionBooks.put("Self-Help", 7);
        nonFictionBooks.put("Science", 3);
        nonFictionBooks.put("Philosophy", 6);
    }

    // 1. Adding new books
    public void addNewBook(String category, String bookTitle, int copies) {
        if (category.equalsIgnoreCase("Fiction")) {
            fictionBooks.put(bookTitle, copies);
        } else if (category.equalsIgnoreCase("Non-Fiction")) {
            nonFictionBooks.put(bookTitle, copies);
        } else {
            System.out.println("Invalid category. Please choose Fiction or Non-Fiction.");
            return;
        }
        System.out.println("Book \"" + bookTitle + "\" added successfully to " + category + " category!");
    }

    // 2. Searching for books
    public void searchBook(String bookTitle) {
        boolean found = false;
        if (fictionBooks.containsKey(bookTitle)) {
            System.out.println("Book found in Fiction category. Copies available: " + fictionBooks.get(bookTitle));
            found = true;
        }
        if (nonFictionBooks.containsKey(bookTitle)) {
            System.out.println("Book found in Non-Fiction category. Copies available: " + nonFictionBooks.get(bookTitle));
            found = true;
        }
        if (!found) {
            System.out.println("Book \"" + bookTitle + "\" not found in the library.");
        }
    }

    // 3. Borrowing books
    public void borrowBook(String memberName, String bookTitle) {
        Map<String, Integer> categoryMap = null;
        if (fictionBooks.containsKey(bookTitle)) {
            categoryMap = fictionBooks;
        } else if (nonFictionBooks.containsKey(bookTitle)) {
            categoryMap = nonFictionBooks;
        } else {
            System.out.println("Book \"" + bookTitle + "\" not found in the library.");
            return;
        }

        int copiesAvailable = categoryMap.get(bookTitle);
        if (copiesAvailable > 0) {
            // Update the number of copies
            categoryMap.put(bookTitle, copiesAvailable - 1);

            // Add member to borrowed members set
            borrowedMembers.add(memberName);

            // Add book to member's borrowed books
            List<String> booksBorrowed = memberBorrowedBooks.getOrDefault(memberName, new ArrayList<>());
            booksBorrowed.add(bookTitle);
            memberBorrowedBooks.put(memberName, booksBorrowed);

            System.out.println(memberName + " has borrowed \"" + bookTitle + "\".");
        } else {
            System.out.println("No copies of \"" + bookTitle + "\" are available right now.");
        }
    }

    // 3. Returning books
    public void returnBook(String memberName, String bookTitle) {
        if (!memberBorrowedBooks.containsKey(memberName) || !memberBorrowedBooks.get(memberName).contains(bookTitle)) {
            System.out.println(memberName + " has not borrowed \"" + bookTitle + "\".");
            return;
        }

        Map<String, Integer> categoryMap = null;
        if (fictionBooks.containsKey(bookTitle)) {
            categoryMap = fictionBooks;
        } else if (nonFictionBooks.containsKey(bookTitle)) {
            categoryMap = nonFictionBooks;
        } else {
            System.out.println("Book \"" + bookTitle + "\" not found in the library records.");
            return;
        }

        // Update the number of copies
        int copiesAvailable = categoryMap.get(bookTitle);
        categoryMap.put(bookTitle, copiesAvailable + 1);

        // Remove book from member's borrowed books
        List<String> booksBorrowed = memberBorrowedBooks.get(memberName);
        booksBorrowed.remove(bookTitle);
        if (booksBorrowed.isEmpty()) {
            memberBorrowedBooks.remove(memberName);
            borrowedMembers.remove(memberName);
        } else {
            memberBorrowedBooks.put(memberName, booksBorrowed);
        }

        System.out.println(memberName + " has returned \"" + bookTitle + "\".");
    }

    // 4. Checking availability of books
    public void checkAvailability(String bookTitle) {
        if (fictionBooks.containsKey(bookTitle)) {
            System.out.println("Fiction Book \"" + bookTitle + "\" has " + fictionBooks.get(bookTitle) + " copies available.");
        } else if (nonFictionBooks.containsKey(bookTitle)) {
            System.out.println("Non-Fiction Book \"" + bookTitle + "\" has " + nonFictionBooks.get(bookTitle) + " copies available.");
        } else {
            System.out.println("Book \"" + bookTitle + "\" is not available in the library.");
        }
    }

    // Display all books in a category
    public void displayBooks(String category) {
        Map<String, Integer> categoryMap;
        if (category.equalsIgnoreCase("Fiction")) {
            categoryMap = fictionBooks;
        } else if (category.equalsIgnoreCase("Non-Fiction")) {
            categoryMap = nonFictionBooks;
        } else {
            System.out.println("Invalid category.");
            return;
        }

        System.out.println("Available " + category + " Books:");
        for (Map.Entry<String, Integer> book : categoryMap.entrySet()) {
            System.out.println(book.getKey() + " - " + book.getValue() + " copies available");
        }
    }

    // Display all borrowed members
    public void displayBorrowedMembers() {
        if (borrowedMembers.isEmpty()) {
            System.out.println("No members have borrowed books.");
            return;
        }
        System.out.println("Members who have borrowed books:");
        for (String member : borrowedMembers) {
            System.out.println(member);
        }
    }

    // Display books borrowed by a member
    public void displayMemberBorrowedBooks(String memberName) {
        if (memberBorrowedBooks.containsKey(memberName)) {
            System.out.println(memberName + " has borrowed the following books:");
            for (String book : memberBorrowedBooks.get(memberName)) {
                System.out.println("- " + book);
            }
        } else {
            System.out.println(memberName + " has not borrowed any books.");
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Example usage:

        // Display available books
        library.displayBooks("Fiction");
        library.displayBooks("Non-Fiction");

        // Add new books
        library.addNewBook("Fiction", "The Great Gatsby", 3);
        library.addNewBook("Non-Fiction", "A Brief History of Time", 5);

        // Search for books
        library.searchBook("The Great Gatsby");
        library.searchBook("Unknown Book");

        // Borrow books
        library.borrowBook("Alice Smith", "The Great Gatsby");
        library.borrowBook("Bob Johnson", "A Brief History of Time");
        library.borrowBook("Alice Smith", "Science Fiction");

        // Display borrowed members
        library.displayBorrowedMembers();

        // Display books borrowed by a member
        library.displayMemberBorrowedBooks("Alice Smith");

        // Check availability
        library.checkAvailability("The Great Gatsby");

        // Return books
        library.returnBook("Alice Smith", "The Great Gatsby");

        // Check availability after return
        library.checkAvailability("The Great Gatsby");

        // Display member's borrowed books after return
        library.displayMemberBorrowedBooks("Alice Smith");
    }
}
