package org.codesnippet.interviewquestions.hard;

import org.codesnippet.interviewquestions.hard.dto.CharCategory;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class GroupCharacters {
    public static void main(String[] args) {

        List<Character> chars = Arrays.asList(
                'A', 'b', '3', 'Z', 'x', '#', '7', 'm', '@', '3'
        );
     /* DIGIT → [3, 7]
        UPPERCASE → [A, Z]
        LOWERCASE → [b, x, m]
        OTHER → [#, @]*/

        Map<Object, List<Character>> collect = chars.stream()
                .collect(Collectors.groupingBy(
                        ch -> getCharCategory(ch.charValue())
                ));
        System.out.println(collect);

        Map<Object, Long> count =  chars.stream().collect(Collectors.groupingBy(
                Function.identity(), LinkedHashMap::new, Collectors.counting()
        )).entrySet().stream().filter(e -> e.getValue() == 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(count);

    }

    private static Object getCharCategory(char c) {
        if (Character.isUpperCase(c)) return CharCategory.UPPERCASE;
        if (Character.isLowerCase(c)) return CharCategory.LOWERCASE;
        if (Character.isDigit(c))     return CharCategory.DIGIT;
        return CharCategory.OTHER;
    }


}
