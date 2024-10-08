package com.tight.coupling;


// A - MySQL, PosgtgreSQL
// B -  Web Service, MongoDB

public class UserDatabase {
    public String getUserDatabase(){
        // Directly access database here
        return "User Details rom database";

    }
}
