package org.codesnippet.interviewquestions.veryeasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFistNumberGreaterThan {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 12, 5, 11, 20);

        Optional<Integer> first = numbers.stream()
                .filter(n -> n > 10) //12,11,20
                .sorted() //11,12,20
                .findFirst();//11
        System.out.println(first.get());
    }
}
