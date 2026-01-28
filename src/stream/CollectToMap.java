package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class CollectToMap {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Rahul"),
                new Employee(2, "Devansh"),
                new Employee(3, "Anil")
        );

        Map<Integer, String> map = list.stream()
                .collect(Collectors.toMap(
                        e -> e.id,
                        e -> e.name
                ));

        System.out.println(map);
    }
}
