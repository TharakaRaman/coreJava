package org.codesnippet.interviewquestions.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Orange");

        String collect = fruits.stream()
                .collect(Collectors.joining(",","[","]"));

        System.out.println(collect);
    }
}
