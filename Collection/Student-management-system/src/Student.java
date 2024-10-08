import java.util.HashMap; // Import the HashMap class for storing grades

// Class representing a Student
class Student {
    // Private field for the student's name
    private String name;
    // Private field for storing grades in a subject-specific manner
    private HashMap<String, Integer> grades;

    // Constructor to initialize a new Student object with a name
    public Student(String name) {
        this.name = name; // Set the student's name
        this.grades = new HashMap<>(); // Initialize the grades HashMap
    }

    // Getter method to retrieve the student's name
    public String getName() {
        return name;
    }

    // Getter method to retrieve the student's grades
    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    // Method to update or add a grade for a specific subject
    public void updateGrade(String subject, int grade) {
        grades.put(subject, grade); // Add or update the grade for the subject
    }

    // Setter method to change the student's name
    public void setName(String name) {
        this.name = name;
    }

    // Override the toString method to provide a string representation of the student
    @Override
    public String toString() {
        return "Student: " + name + " | Grades: " + grades; // Format the output string
    }
}
