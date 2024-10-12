

# 📚 Library Management System

This is a simple Library Management System built using Java. It manages books across different categories and allows users to borrow and return books.

## ✨ Features

- 📖 Add new books to Fiction or Non-Fiction categories.
- 🔍 Search for books by title.
- 📚 Borrow and return books.
- 🛠️ Check the availability of books.
- 👤 Track unique members who have borrowed books.

## 🛠️ Steps to Build the Application

### Step 1: 🔧 Initial Setup
1. **Create the Project Directory**:
    - Create a new Java project folder for the Library Management System.
    - Example:
      ```bash
      mkdir library-management-system
      cd library-management-system
      ```

2. **Initialize the Project**:
    - Create the `Main.java` file where all the main logic will reside.
    - Set up your Java environment if necessary (install Java if not already installed).

### Step 2: 📚 List of Books
1. **Create a List to Store Books**:
    - Define an `ArrayList<String>` to hold the titles of available books.
    - This list will include both Fiction and Non-Fiction books.
    - Example:
      ```java
      List<String> listOfBooks = new ArrayList<>(Arrays.asList("Science Fiction", "Fantasy", "Mystery", "Romance", "Historical Fiction", "Biography", "History", "Self-Help", "Science", "Philosophy"));
      ```

### Step 3: 📂 Categorizing Books
1. **Use a Map for Book Categories**:
    - Create two `HashMap<String, Integer>` instances: one for Fiction and one for Non-Fiction.
    - Store book titles as keys and the number of available copies as values.
    - Example:
      ```java
      Map<String, Integer> fiction = new HashMap<>();
      Map<String, Integer> nonFiction = new HashMap<>();
      ```

2. **Add Books to Each Category**:
    - Populate the maps with book titles and the number of copies available.
    - Example:
      ```java
      fiction.put("Science Fiction", 5);
      nonFiction.put("Biography", 4);
      ```

### Step 4: 📋 Display Available Books
1. **Create a Method to Display Books**:
    - Write a method to display all available books and their quantities in both Fiction and Non-Fiction categories.
    - Example:
      ```java
      private static void displayBooks(Map<String, Integer> books) {
          for (Map.Entry<String, Integer> book : books.entrySet()) {
              System.out.println(book.getKey() + " - " + book.getValue() + " copies available");
          }
      }
      ```

2. **Call the Display Method**:
    - Display books after they have been added to the `fiction` and `nonFiction` categories.
    - Example:
      ```java
      displayBooks(fiction);
      displayBooks(nonFiction);
      ```

### Step 5: 👤 Managing Borrowed Books
1. **Use a HashSet for Borrowed Members**:
    - Create a `HashSet<String>` to track unique members who have borrowed books.
    - Add members when they borrow books, ensuring no duplicate members are added.
    - Example:
      ```java
      HashSet<String> borrowedMembers = new HashSet<>();
      borrowedMembers.add("John Doe");
      ```

2. **Check If a Member Borrowed a Book**:
    - Write a method or logic to check if a member has borrowed a book.
    - Example:
      ```java
      if (borrowedMembers.contains("Alice Smith")) {
          System.out.println("Alice Smith has borrowed a book.");
      }
      ```

### Step 6: ➕ Adding Book Operations
1. **Add a Method for Adding New Books**:
    - Implement logic to add a new book to either the Fiction or Non-Fiction category.
    - Example:
      ```java
      fiction.put("New Fantasy Book", 5);  // Add new book with 5 copies
      ```

2. **🔍 Search for a Book**:
    - Implement a search method to find whether a specific book is available.
    - Example:
      ```java
      if (fiction.containsKey("Science Fiction")) {
          System.out.println("Book found in Fiction category.");
      }
      ```

3. **📚 Borrow and Return Books**:
    - Write methods for borrowing and returning books, reducing or increasing the available copies in the respective categories.
    - Example:
      ```java
      fiction.put("Science Fiction", fiction.get("Science Fiction") - 1);  // Borrow a book
      ```

4. **🛠️ Check Availability of Books**:
    - Add functionality to check whether a book is available by verifying the number of copies in the `Map`.
    - Example:
      ```java
      if (fiction.get("Science Fiction") > 0) {
          System.out.println("Science Fiction is available.");
      }
      ```

### Step 7: ✅ Final Testing and Running the Application
1. **Test All Functionalities**:
    - Test the features for adding, searching, borrowing, returning, and checking the availability of books.
    - Print out results to ensure everything works as expected.

2. **🚀 Run the Application**:
    - Compile and run the Java application using the following commands:
      ```bash
      javac Main.java
      java Main
      ```

### Step 8: 🧠 Skills Learned
- Java Programming: Enhanced understanding of Java syntax, data structures, and object-oriented programming principles.
- Collections Framework: Utilized Java's collections (ArrayList, HashMap, HashSet) for managing data effectively.
- Basic Algorithms: Implemented simple algorithms for searching and managing book data.
- Software Design: Developed skills in structuring a Java application and implementing core functionalities.
- Debugging and Testing: Gained experience in debugging Java applications and validating functionalities through testing.

## 📁 Project Structure

- `Main.java`: Contains the core logic for the Library Management System.

## 🚀 How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Hands-on-Java.git


### Note
1. **Explanation of:**:
    - The line
       ```bash
       String bookTitle = scanner.nextLine();
       ```
    -  is used to capture user input from the console. Here's a detailed breakdown of what it does:
       - scanner: This is a Scanner object that reads input from the user.
       - nextLine(): This method reads an entire line of text from the console (until the user presses Enter). It returns that line as a String.
       - String bookTitle: This declares a variable named bookTitle of type String to store the input.
       - =: The equals sign assigns the value returned by scanner.nextLine() (the input from the user) to the variable bookTitle.

2. **Run the Application**:
    - Compile and run the Java application using the following commands:
        ```bash
        javac Main.java
        java Main
        ```