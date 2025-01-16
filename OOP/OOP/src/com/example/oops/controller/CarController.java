package com.example.oops.controller;

import com.example.oops.model.Car;
import com.example.oops.utils.Logger;

import java.util.Scanner;

public class CarController {

    // Create an instance of the car
    Car myCar = new Car();

    public void displayInfos() {
        Logger.logInfo("Car setup is starting...");
        Scanner scanner = new Scanner(System.in);

        // Input brand
        System.out.print("Enter the brand: ");
        String brand = scanner.nextLine();
        if (validateInput(brand, "Brand")) return;

        // Input color
        System.out.print("Enter the color: ");
        String color = scanner.nextLine();
        if (validateInput(color, "Color")) return;

        // Input speed
        System.out.print("Enter the speed: ");
        int speed;
        try {
            speed = scanner.nextInt();
        } catch (Exception e) {
            Logger.logError("Invalid speed. Please enter a number.");
            return;
        }

        if (speed < 0) {
            Logger.logError("Speed cannot be negative.");
            return;
        }
        if (speed > 500) {
            Logger.logError("Speed must be less than 500.");
            return;
        }

        // Set car details
        myCar.setBrand(brand);
        myCar.setColor(color);
        myCar.setSpeed(speed);

        // Display car information
        Logger.logInfo("Car setup complete!");
        Logger.logInfo("Brand: " + myCar.getBrand());
        Logger.logInfo("Color: " + myCar.getColor());
        Logger.logInfo("Speed: " + myCar.getSpeed() + " km/h");
    }

    // Helper method for input validation
    private boolean validateInput(String input, String fieldName) {
        if (input == null || input.trim().isEmpty()) {
            Logger.logError(fieldName + " cannot be null or empty.");
            return true;
        }
        if (!input.matches("[a-zA-Z&-]+")) {
            Logger.logError(fieldName + " must contain only letters.");
            return true;
        }
        return false;
    }
}
