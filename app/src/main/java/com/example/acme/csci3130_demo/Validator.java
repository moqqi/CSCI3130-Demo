package com.example.acme.csci3130_demo;

/**
 * Created by iMoqii on 2018-02-07.
 */

public class Validator {
    public int validate(String password){
        return validateCase(password)       +
                validateMinLength(password) ;
    }

    private int validateCase (String password){
        if(!password.contentEquals("password")) return 1;
        else return 0;
    }

    private int validateMinLength (String password){
        if(password.length() >= 8) return 1;
        else return 0;
    }
}
