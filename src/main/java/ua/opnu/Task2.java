package ua.opnu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task2 {
    public static List<Student> filterStudents(List<Student> students, Predicate<Student> predicate) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (predicate.test(s)) result.add(s);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Іван", "AI-21", new int[]{90, 85, 95}),
                new Student("Петро", "AI-21", new int[]{50, 70, 60}),
                new Student("Марія", "AI-21", new int[]{100, 100, 90})
        );

        Predicate<Student> noDebt = s -> Arrays.stream(s.getMarks()).allMatch(m -> m >= 60);

        List<Student> passed = filterStudents(students, noDebt);
        for (Student s : passed) {
            System.out.println(s.getName());
        }
    }
}