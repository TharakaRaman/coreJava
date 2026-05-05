package org.codesnippet.interviewquestions.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class FlattenExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        //1,2,3,4,5,6,7,8

        List<Integer> list = listOfLists.stream()
                //.flatMap(Set::stream)
                .flatMap(List::stream).filter(x->x%2==0)
                .toList();

        System.out.println(list);
    }
}
