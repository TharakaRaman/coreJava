package org.codesnippet.interviewquestions.intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "ball", "cat", "banana", "dog","goat");

        Map<Integer, List<String>> output = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(output);

        String name = "Hello World";

        String reverseWord = "";
        for  (String word : words) {

            reverseWord = reverseWord + word;
        }
        System.out.println(reverseWord);

    }
}
