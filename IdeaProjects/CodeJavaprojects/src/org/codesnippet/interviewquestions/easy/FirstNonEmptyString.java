package org.codesnippet.interviewquestions.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstNonEmptyString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("", "", "Hello", "World", "");

        Optional<String> first = strings.stream()
                .filter(s -> !s.isEmpty())
                .findFirst();
        System.out.println(first.get());
    }
}
