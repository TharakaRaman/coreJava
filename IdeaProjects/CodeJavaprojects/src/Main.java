import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private List<String> sampleStram(){
        List<String> empNames = new ArrayList<>();
        empNames.add("John");
        empNames.add("Jane");
        empNames.add("Ram ");
        empNames.add("Ravi");
        empNames.add("Tharaka raman");
        List<String> modifiedNames = empNames.stream()
                .filter(s -> s.length()<6)
                .map(String::toLowerCase)
                .map(String::trim)
                .collect(Collectors.toList());
        System.out.println(modifiedNames);
        return modifiedNames;
    }
    public static void main(String[] args) {

        Main main = new Main();
        main.sampleStram();

    }
}