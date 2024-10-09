package com.example.autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByConstructor.xml");

        // Load the xml file
        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();

    }

}