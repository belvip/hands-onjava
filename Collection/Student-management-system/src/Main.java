import java.util.LinkedList; // Import LinkedList class for managing registration order
import java.util.Scanner;    // Import Scanner class for user input
import java.util.ArrayList;  // Import ArrayList class for storing students

public class Main {
    // Static list to hold all registered students
    static ArrayList<Student> listOfStudents = new ArrayList<>();
    // Linked list to maintain the order of student registrations
    static LinkedList<Student> registrationOrder = new LinkedList<>();
    // Scanner instance to take input from the user
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Loop to display the menu until the user chooses to exit
        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student's name");
            System.out.println("3. Update a student's grades");
            System.out.println("4. Search for a student by name");
            System.out.println("5. View the list of students");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");

            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            // Process the user's choice
            switch (choice) {
                case 1:
                    addStudentInteractive(); // Call method to add a student
                    break;
                case 2:
                    updateStudentNameInteractive(); // Call method to update student's name
                    break;
                case 3:
                    updateStudentGradesInteractive(); // Call method to update student's grades
                    break;
                case 4:
                    searchStudentInteractive(); // Call method to search for a student
                    break;
                case 5:
                    viewStudents(); // Call method to view all students
                    break;
                case 6:
                    exit = true; // Set exit flag to true to break the loop
                    System.out.println("Exiting the system.");
                    break;
                default:
                    // Handle invalid option
                    System.out.println("Invalid option! Please choose a valid option.");
            }
        }
    }

    // Method to add a student interactively
    public static void addStudentInteractive() {
        System.out.print("Enter the student's name: "); // Prompt for student name
        String studentName = scanner.nextLine(); // Read student name
        addStudent(studentName); // Call method to add the student
    }

    // Method to update a student's name interactively
    public static void updateStudentNameInteractive() {
        System.out.print("Enter the current student's name: "); // Prompt for current name
        String currentName = scanner.nextLine(); // Read current name
        System.out.print("Enter the new student's name: "); // Prompt for new name
        String newName = scanner.nextLine(); // Read new name
        updateStudentName(currentName, newName); // Call method to update the name
    }

    // Method to update student's grades interactively
    public static void updateStudentGradesInteractive() {
        System.out.print("Enter the student's name: "); // Prompt for student name
        String studentName = scanner.nextLine(); // Read student name
        System.out.print("Enter the subject: "); // Prompt for subject
        String subject = scanner.nextLine(); // Read subject
        System.out.print("Enter the grade: "); // Prompt for grade
        int grade = scanner.nextInt(); // Read grade
        scanner.nextLine(); // Consume newline
        updateStudentGrades(studentName, subject, grade); // Call method to update grades
    }

    // Method to search for a student by name interactively
    public static void searchStudentInteractive() {
        System.out.print("Enter the student's name to search: "); // Prompt for student name
        String studentName = scanner.nextLine(); // Read student name
        searchStudentByName(studentName); // Call method to search for the student
    }

    // Method to add a student
    public static void addStudent(String studentName) {
        // Check if the student already exists
        if (getStudentByName(studentName) == null) {
            Student student = new Student(studentName); // Create a new student object
            listOfStudents.add(student); // Add student to the list of students
            registrationOrder.add(student); // Add student to the registration order
            System.out.println("Added student: " + studentName); // Confirm addition
        } else {
            // Inform user if the student already exists
            System.out.println("Student already exists: " + studentName);
        }
    }

    // Method to update student's grades for a subject
    public static void updateStudentGrades(String studentName, String subject, int grade) {
        // Retrieve the student by name
        Student student = getStudentByName(studentName);
        if (student != null) {
            // Update the student's grade if found
            student.updateGrade(subject, grade);
            System.out.println("Updated " + studentName + "'s grade in " + subject + " to " + grade);
        } else {
            // Inform user if the student was not found
            System.out.println("Student not found.");
        }
    }

    // Method to view all registered students
    public static void viewStudents() {
        // Check if there are no students to display
        if (registrationOrder.isEmpty()) {
            System.out.println("No students found."); // Inform user if list is empty
            return; // Exit the method
        }
        // Iterate through the list of registered students and display their details
        for (Student student : registrationOrder) {
            System.out.println(student);
        }
    }

    // Method to search for a student by name
    public static void searchStudentByName(String studentName) {
        // Retrieve the student by name
        Student student = getStudentByName(studentName);
        if (student != null) {
            // Display student details if found
            System.out.println(student);
        } else {
            // Inform user if the student was not found
            System.out.println("Student " + studentName + " not found.");
        }
    }

    // Method to update a student's name
    public static void updateStudentName(String oldName, String newName) {
        // Retrieve the student by old name
        Student student = getStudentByName(oldName);
        if (student != null) {
            // Update the student's name if found
            student.setName(newName);
            System.out.println("Updated student name from " + oldName + " to " + newName);
        } else {
            // Inform user if the student was not found
            System.out.println("Student not found: " + oldName);
        }
    }

    // Helper method to get a student by name
    public static Student getStudentByName(String studentName) {
        // Iterate through the list of students to find a match
        for (Student student : listOfStudents) {
            // Compare names ignoring case
            if (student.getName().equalsIgnoreCase(studentName)) {
                return student; // Return the found student
            }
        }
        return null; // Return null if no student was found
    }
}
