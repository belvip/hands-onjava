package com.loose.coupling;


// A - MySQL, PosgtgreSQL
// B -  Web Service, MongoDB

public class UserDatabaseProvider implements UserDataProvider {
    public String getUserDetails(){
        // Directly access database here
        return "User Details rom database";

    }
}
