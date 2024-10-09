package com.example.componentscan;

import com.example.autowire.type.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("componentScanDemo.xml");

        // Load the xml file
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.toString());;

    }
}
