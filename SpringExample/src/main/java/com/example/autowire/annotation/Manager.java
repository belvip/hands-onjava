package com.example.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    // Annotation event about the field
    @Autowired
    private Employee employee;// Create the dependency

    // "Employee" is a bean with type "employee"

    // Constructor injection
   /* @Autowired
    public Manager(Employee employee) {
        this.employee = employee;
    } */

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
