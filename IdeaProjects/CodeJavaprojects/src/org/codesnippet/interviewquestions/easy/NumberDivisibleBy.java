package org.codesnippet.interviewquestions.easy;

import java.util.Arrays;
import java.util.List;

public class NumberDivisibleBy {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 7, 10, 14);

        boolean match = numbers.stream()
                .anyMatch(n -> n % 3 == 0);
        System.out.println(match);


    }
}
