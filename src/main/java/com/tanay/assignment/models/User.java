package com.tanay.assignment.models;

import java.util.List;

import lombok.Data;

@Data
public class User {

    public User(String firstName, String lastName, String roll_number, String dob){
        this.user_id = firstName + "_" + lastName + "_" + dob;
        this.email = firstName + "@xyz.com";
        this.roll_number = roll_number;
    }

    private String is_success = "true";

    private String user_id;

    private String email;

    private String roll_number;

    private List<Integer> numbers;

    private List<String> alphabets;

    private List<String> highest_alphabets;


}
