# Student Management System

This is a simple Student Management System built using Java. It allows users to manage student information, search for students, and view a list of all students.

## Features

- **Add a New Student**: Easily add new students to the system.
- **Update Student Name**: Modify a student's name when necessary.
- **Update Student Grades**: Add or update grades for various subjects for each student.
- **Search for a Student**: Quickly find student records by name.
- **View List of Students**: Display all registered students along with their grades.

## Steps to Build the Application

### Step 1: Initial Setup
1. **Create the Project Directory**:
    - Create a new Java project folder for the Student Management System.
    - Example:
      ```bash
      mkdir student-management-system
      cd student-management-system
      ```

2. **Initialize the Project**:
    - Create the `Main.java` file where all the main logic will reside.
    - Set up your Java environment if necessary (install Java if not already installed).

### Step 2: List of Students
1. **Create a List to Store Students**:
    - Define an `ArrayList<Student>` to hold the list of student objects.
    - Each student will have attributes like name, ID, age, and grade.
    - Example:
      ```java
      List<Student> students = new ArrayList<>();
      ```

2. **Create a `Student` Class**:
    - Define a `Student` class with fields like `name`, `id`, `age`, and `grade`.
    - Example:
      ```java
      public class Student {
          String name;
          String id;
          int age;
          String grade;

          public Student(String name, String id, int age, String grade) {
              this.name = name;
              this.id = id;
              this.age = age;
              this.grade = grade;
          }

          // Add getters and setters here
      }
      ```

### Step 3: Adding Student Information
1. **Add Method for Adding New Students**:
    - Implement logic to add a new student to the `students` list.
    - Example:
      ```java
      public void addStudent(String name, String id, int age, String grade) {
          students.add(new Student(name, id, age, grade));
      }
      ```

2. **Update Student Information**:
    - Write logic to find a student by their ID and update their details.
    - Example:
      ```java
      public void updateStudent(String id, String newName, int newAge, String newGrade) {
          for (Student student : students) {
              if (student.getId().equals(id)) {
                  student.setName(newName);
                  student.setAge(newAge);
                  student.setGrade(newGrade);
                  break;
              }
          }
      }
      ```

### Step 4: Searching for Students
1. **Implement Search Functionality**:
    - Write a method to search for students by their name or ID.
    - Example:
      ```java
      public Student searchStudentById(String id) {
          for (Student student : students) {
              if (student.getId().equals(id)) {
                  return student;
              }
          }
          return null;
      }
      ```

2. **Search by Name**:
    - Add logic to search for students by name.
    - Example:
      ```java
      public List<Student> searchStudentsByName(String name) {
          List<Student> result = new ArrayList<>();
          for (Student student : students) {
              if (student.getName().equalsIgnoreCase(name)) {
                  result.add(student);
              }
          }
          return result;
      }
      ```

### Step 5: Displaying the List of Students
1. **Create a Method to Display All Students**:
    - Write a method to display all student details.
    - Example:
      ```java
      public void displayAllStudents() {
          for (Student student : students) {
              System.out.println(student.getName() + " - " + student.getId() + " - Age: " + student.getAge() + " - Grade: " + student.getGrade());
          }
      }
      ```

### Step 6: Final Testing and Running the Application
1. **Test All Functionalities**:
    - Test the features for adding, updating, searching, and displaying students.
    - Print out results to ensure everything works as expected.

2. **Run the Application**:
    - Compile and run the Java application using the following commands:
      ```bash
      javac Main.java
      java Main
      ```

### Step 7: Skills Learned
- **Java Programming**: Improved understanding of Java syntax, data structures, and object-oriented programming principles.
- **Data Management**: Managed student data using Java collections like `ArrayList`.
- **Algorithms**: Implemented search and update algorithms for managing student records.
- **Software Design**: Developed skills in structuring a Java application and implementing core functionalities.
- **Testing and Debugging**: Gained experience in debugging Java applications and validating functionalities through testing.

## Student Class

The **`Student` class** is a fundamental component of the Student Management System. It encapsulates all relevant information about a student and provides methods to interact with that data. Below is a detailed explanation of its attributes and methods.

### Attributes

- **`String name`**: Represents the student's name. This is the primary identifier for each student in the system.
- **`HashMap<String, Integer> grades`**: A map that associates subject names with the respective grades. This allows for easy storage and retrieval of a student's academic performance in different subjects.

### Methods

- **`public Student(String name)`**: Constructor that initializes a new instance of the `Student` class with the specified name. It also initializes the grades map to store the student's grades.

- **`public String getName()`**: Returns the name of the student.

- **`public void setName(String name)`**: Updates the student's name.

- **`public HashMap<String, Integer> getGrades()`**: Returns the map of grades associated with the student.

- **`public void addGrade(String subject, int grade)`**: Adds a new grade for a specific subject. If the subject already exists in the grades map, it updates the grade.

- **`public void updateGrade(String subject, int grade)`**: Updates the existing grade for a specific subject. If the subject does not exist, it can be handled accordingly (e.g., by adding a new entry or throwing an exception).

- **`public String toString()`**: Returns a string representation of the student's information, including their name and grades, for easy display in the application.

### Example Usage

Here’s a brief example of how to create a new `Student` instance and manage grades:

```java
Student student = new Student("Alice");
student.addGrade("Math", 85);
student.addGrade("Science", 90);
System.out.println(student.toString()); // Output: Alice's grades in Math and Science
