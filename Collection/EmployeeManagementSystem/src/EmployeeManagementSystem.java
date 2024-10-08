import java.util.ArrayList;      // Importing ArrayList to store employee details
import java.util.HashMap;       // Importing HashMap to map employees to departments
import java.util.TreeSet;       // Importing TreeSet to store and sort employees by salary
import java.util.Comparator;     // Importing Comparator for custom sorting
import java.util.Scanner;        // Importing Scanner for user input

public class EmployeeManagementSystem {
    // Collection to store employee details
    static ArrayList<Employee> employees = new ArrayList<>();
    // Map to link employees with their respective departments
    static HashMap<String, ArrayList<Employee>> departmentMap = new HashMap<>();
    // TreeSet to sort employees by salary
    static TreeSet<Employee> sortedEmployees = new TreeSet<>(Comparator.comparingDouble(Employee::getSalary));
    static Scanner scanner = new Scanner(System.in); // Scanner for user input

    public static void main(String[] args) {
        boolean exit = false; // Flag to control the menu loop
        while (!exit) {
            // Displaying menu options
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add a new employee");
            System.out.println("2. View employees by department");
            System.out.println("3. Find highest-paid employee");
            System.out.println("4. Find lowest-paid employee");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    addEmployeeInteractive(); // Function to add a new employee
                    break;
                case 2:
                    viewEmployeesByDepartment(); // Function to view employees by department
                    break;
                case 3:
                    findHighestPaidEmployee(); // Function to find the highest-paid employee
                    break;
                case 4:
                    findLowestPaidEmployee(); // Function to find the lowest-paid employee
                    break;
                case 5:
                    exit = true; // Exit the menu loop
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid option! Please choose a valid option."); // Invalid input handling
            }
        }
    }

    // Function to add a new employee (interactive)
    public static void addEmployeeInteractive() {
        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee's department: ");
        String department = scanner.nextLine();
        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        // Creating a new Employee object
        Employee employee = new Employee(name, department, salary);
        employees.add(employee); // Adding to the employee list
        sortedEmployees.add(employee); // Adding to the sorted employee set

        // Adding the employee to the department map
        departmentMap.putIfAbsent(department, new ArrayList<>());
        departmentMap.get(department).add(employee);

        System.out.println("Added employee: " + employee);
    }

    // Function to view employees by department
    public static void viewEmployeesByDepartment() {
        System.out.print("Enter department name: ");
        String department = scanner.nextLine();

        // Check if department exists in the map
        if (departmentMap.containsKey(department)) {
            System.out.println("Employees in " + department + ":");
            for (Employee emp : departmentMap.get(department)) {
                System.out.println(emp); // Print each employee's details
            }
        } else {
            System.out.println("No employees found in department: " + department);
        }
    }

    // Function to find the highest-paid employee
    public static void findHighestPaidEmployee() {
        if (!sortedEmployees.isEmpty()) {
            Employee highestPaid = sortedEmployees.last(); // Retrieve the highest paid employee
            System.out.println("Highest-paid employee: " + highestPaid);
        } else {
            System.out.println("No employees found.");
        }
    }

    // Function to find the lowest-paid employee
    public static void findLowestPaidEmployee() {
        if (!sortedEmployees.isEmpty()) {
            Employee lowestPaid = sortedEmployees.first(); // Retrieve the lowest paid employee
            System.out.println("Lowest-paid employee: " + lowestPaid);
        } else {
            System.out.println("No employees found.");
        }
    }
}