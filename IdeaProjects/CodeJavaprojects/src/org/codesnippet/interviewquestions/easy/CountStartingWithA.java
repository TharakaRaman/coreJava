package org.codesnippet.interviewquestions.easy;

import java.util.Arrays;
import java.util.List;

public class CountStartingWithA {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");

        long count = fruits.stream()
                .filter(fr -> fr.startsWith("A"))
                .count();

        System.out.println(count);


    }
}
