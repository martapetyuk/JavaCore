package HomeWork9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("Samir", Arrays.asList(new Course("Info"), new Course("Math"),
                new Course("Info1"))));
        students.add(new Students("Marta", Arrays.asList(new Course("Info"), new Course("Phy"),
                new Course("Test1"), new Course("Test2"))));
        students.add(new Students("Sasha", Arrays.asList(new Course("inform"), new Course("History"),
                new Course("Info2"), new Course("Test4"))));

        //1
        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));

        //2
        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList()));

        //3
        Course course = new Course("Testing");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}
