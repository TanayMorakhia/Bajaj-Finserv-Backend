package com.tanay.assignment.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tanay.assignment.models.User;
import com.tanay.assignment.models.UserDataRequestModel;
import com.tanay.assignment.services.UserService;
import com.tanay.assignment.services.impl.UserServiceImpl;

@RestController
@RequestMapping("bfhl")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(
        produces = {
            MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE
    })
    public String get(){
        return "{\"operation_code\":1}";
    }


    @PostMapping(produces = {
            MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE
    })
    public User sendUserData(@RequestBody UserDataRequestModel userData){
        User returnUser = new User("john", "doe", "ABCD123", "17091999");

        returnUser.setNumbers(userService.extractNumbers(userData.getData()));

        returnUser.setAlphabets(userService.extractStrings(userData.getData()));

        returnUser.setHighest_alphabets(userService.extractHighestString(userData.getData()));

        return returnUser;
    }

}
