package org.codesnippet.interviewquestions.veryeasy;

import java.util.Arrays;
import java.util.List;

public class CountGreaterThan {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 6, 3, 8, 10, 1);

        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println(count);
    }
}
