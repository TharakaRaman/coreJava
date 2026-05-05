import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class JavaStreamPrograms {

    public List<Employee> loadData(){
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee("001","Raman","Tharak","raman@gmail.com","NJ",2000);
        Employee employee1 = new Employee("002","Raman1","Tharak1","raman1@gmail.com","NY",3000);
        Employee employee2= new Employee("003","Raman2","Tharak2","raman2@gmail.com","TX",4000);
        Employee employee3 = new Employee("004","Raman3","Tharak3","raman3@gmail.com","PA",5000);
        Employee employee4= new Employee("005","Raman4","Tharak4","raman4@gmail.com","NJ",6000);
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        return employees;
    }
    public static void main(String[] args) {
        JavaStreamPrograms javaStreamPrograms = new JavaStreamPrograms();
        List<Employee> employees = javaStreamPrograms.loadData();
        employees.forEach(System.out::println);
        //display the employee list data
        long countvalues = employees.stream().count();
        System.out.println(countvalues);
        List<String> employeeListInNJ = employees.stream().filter(e->e.getAddress().equals("NJ"))
                .map(employee -> employee.getFirstName().toUpperCase()).toList();
        employeeListInNJ.forEach(System.out::println);
        System.out.println("....................");
        Map<String, List<String>> namesByAddress
                = employees.stream().collect(
                groupingBy(Employee::getAddress,
                        TreeMap::new,
                        mapping(Employee::getEmployeeID,
                                toList())));
        namesByAddress.entrySet().forEach(System.out::println);

        // Accumulate names into a List
        List<String> list = employees.stream()
                .map(Employee::getEmail)
                .collect(Collectors.toList());
        list.forEach(System.out::println);

// Accumulate names into a TreeSet
        Set<String> set = employees.stream()
                .map(Employee::getFirstName)
                .collect(Collectors.toCollection(TreeSet::new));
        set.forEach(System.out::println);

// Convert elements to strings and concatenate them, separated by commas
        String joined = employees.stream()
                .map(Employee::getAddress)
                .collect(Collectors.joining(", "));
        System.out.println("JNoined String :"+joined);

// Compute sum of salaries of employee
        double total = employees.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));
    System.out.println("Total salary: " + total);
// Group employees by department
        Map<String, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAddress));
        byDept.entrySet().forEach(System.out::println);

// Compute sum of salaries by department
        Map<String, Double> totalByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAddress,
                        Collectors.summingDouble(Employee::getSalary)));
        totalByDept.entrySet().forEach(System.out::println);

// Partition students into passing and failing
        Map<Boolean, List<Employee>> passingFailing = employees.stream()
                .collect(Collectors.partitioningBy(s -> s.getSalary() >= 3000));
        passingFailing.entrySet().forEach(System.out::println);

        Map<String, List<Employee>> groupingByState = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAddress));
        System.out.println(groupingByState.get("NJ"));
    }
}
