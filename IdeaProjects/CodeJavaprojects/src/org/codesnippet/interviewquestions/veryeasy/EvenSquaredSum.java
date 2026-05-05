package org.codesnippet.interviewquestions.veryeasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EvenSquaredSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> reduce = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(Integer::sum);
        System.out.println(reduce.get());

    }
}
