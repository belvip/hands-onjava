package com.loose.coupling;

// Main class to demonstrate loose coupling
public class LooseCouplingExample {
    public static void main(String[] args) {
        // Create an instance of UserDatabaseProvider, which implements UserDataProvider
        UserDataProvider databaseProvider = new UserDatabaseProvider();

        // Pass the databaseProvider instance to UserManager
        // This allows UserManager to retrieve user information without being tightly coupled to the database implementation
        UserManager userManagerWithDB = new UserManager(databaseProvider);

        // Call getUserInfo() on UserManager to fetch and print user details
        System.out.println(userManagerWithDB.getUserInfo());
    }
}
