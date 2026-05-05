package org.codesnippet.interviewquestions.easy;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(avg);

        int sum= numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
