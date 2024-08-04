package com.tanay.assignment.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tanay.assignment.services.UserService;
import lombok.Data;

@Data
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<Integer> extractNumbers(List<String> data){

        List<Integer> numbers = new ArrayList<>();

        for (String str : data) {
            // Check if the string is a number
            if (str.matches("-?\\d+")) {
                numbers.add(Integer.parseInt(str));
            }
        }

        return numbers;
    }

    @Override
    public List<String> extractStrings(List<String> data){
        List<String> alphabeticStrings = new ArrayList<>();

        for (String str : data) {
            // Check if the string is alphabetic
            if (str.matches("[a-zA-Z]+")) {
                alphabeticStrings.add(str);
            }
        }

        return alphabeticStrings;
    }

    @Override
    public List<String> extractHighestString(List<String> data){

        List<String> alphabets = extractStrings(data);

        String highest = "";

        for (String str : alphabets) {
            // Check if the current alphabet is higher than the current highest
            if (str.compareToIgnoreCase(highest) > 0) {
                highest = str;
            }
        }

        List<String> alpha = new ArrayList<>();

        alpha.add(highest);

        return alpha;
    }
}
