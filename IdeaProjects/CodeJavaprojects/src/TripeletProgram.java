import java.net.StandardSocketOptions;
import java.util.*;
import java.util.stream.Collectors;

public class TripeletProgram {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> count = Arrays.stream(arr).filter(i->i%2!=0).map(i->i*i).boxed().collect(Collectors.toList());
        List<Integer> listOfNumbers = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(count);
        List<Integer> numbers =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> eventcount = numbers.stream().filter(i -> i % 2 != 0).map(i -> i * i).reduce(Integer::sum);
        System.out.println(eventcount);
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 14, 15, 11, 7, 8, 9, 10);
        Optional<Integer> highestvalue = numbers2.stream().filter(n->n>10).sorted().findFirst();
        System.out.println(highestvalue);
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> squreTheValues = numbers3.stream().filter(n->n%2==0).map(n->n*n).sorted().findFirst();
        System.out.println(squreTheValues);
        // find the secound higest  number in the list
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> fiendSecHigest = numbers4.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(fiendSecHigest);
    }

}

