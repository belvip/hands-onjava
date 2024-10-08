package com.example;

import java.io.*;
import java.util.*;

public class StudentManagementSystem {
    private List<Student> students;
    private String filePath = "src/resources/students.txt"; // Adjust the path if necessary

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
        loadStudents();
    }

    public void addStudent(String name, String id, double salary) {
        students.add(new Student(name, id, salary));
        saveStudents();
    }

    public void viewStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void loadStudents() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    students.add(new Student(data[0], data[1], Double.parseDouble(data[2])));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading students: " + e.getMessage());
        }
    }

    private void saveStudents() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Student student : students) {
                bw.write(student.getName() + "," + student.getId() + "," + student.getSalary());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.addStudent("Alice", "001", 50000);
        sms.addStudent("Bob", "002", 55000);
        sms.viewStudents();
    }
}