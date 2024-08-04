package com.tanay.assignment.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    List<Integer> extractNumbers(List<String> data);

    List<String> extractStrings(List<String> data);

    List<String> extractHighestString(List<String> data);
}
