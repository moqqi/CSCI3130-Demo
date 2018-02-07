package com.example.acme.csci3130_demo;

/**
 * Created by iMoqii on 2018-02-07.
 */

public class Validator {
    public int validate(String password){
        return validateCase(password)       +
                validateMinLength(password) +
                validateMaxLength(password) +
                validateDigit(password)     +
                validateUpperCase(password);
    }

    private int validateCase (String password){
        if(!password.contentEquals( "password")) return 1;
        else return 0;
    }

    private int validateMinLength (String password){
        if(password.length() >= 7) return 1;
        else return 0;
    }

    private int validateMaxLength (String password){
        if(password.length() < 16) return 1;
        else return 0;
    }

    private int validateDigit (String password){
        if(password.matches(".*\\d+.*")) return 1;
        else return 0;
    }

    private int validateUpperCase (String password){
        String lowerCasePassword = password.toLowerCase();
        if(!password.contentEquals(lowerCasePassword)) return 1;
        else return 0;
    }
}
