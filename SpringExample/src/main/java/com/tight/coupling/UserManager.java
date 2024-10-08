package com.tight.coupling;

public class UserManager {
    // Create instance of UserDatabase  class
    private UserDatabase userDatabase = new UserDatabase(); // Tight coupling

    public String getUserInfo(){
        return  userDatabase.getUserDatabase();
    }
}
