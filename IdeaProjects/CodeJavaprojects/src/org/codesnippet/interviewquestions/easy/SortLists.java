package org.codesnippet.interviewquestions.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortLists {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,5,1,5, 1, 8, 3, 2, 10);

        List<Integer> list = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(list);
    }
}
