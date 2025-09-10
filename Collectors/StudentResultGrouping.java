
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String grade;
    Student(String name, String grade) { this.name = name; this.grade = grade; }
}

public class StudentResultGrouping {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", "A"),
            new Student("Bob", "B"),
            new Student("Charlie", "A"),
            new Student("David", "C"),
            new Student("Eve", "B")
        );

        Map<String, List<String>> grouped = students.stream()
            .collect(Collectors.groupingBy(s -> s.grade, Collectors.mapping(s -> s.name, Collectors.toList())));

        grouped.forEach((grade, names) -> System.out.println(grade + " -> " + names));
    }
}
