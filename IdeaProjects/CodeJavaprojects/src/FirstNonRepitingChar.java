import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepitingChar {
    public static void main(String[] args) {
        String input = "aabbccddz";
        char[] charArray = input.toCharArray();

        Character nonRepitingChar = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() ==1 )
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(nonRepitingChar);

        Optional<Character> nonRepeatingChar =
                input.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() == 1)
                        .map(Map.Entry::getKey)
                        .findFirst();

        nonRepeatingChar.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No non-repeating character found")
        );
    }

}
