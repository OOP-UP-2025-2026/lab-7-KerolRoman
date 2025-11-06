package ua.opnu;

import java.util.function.Consumer;

public class Task4 {
    public static void forEach(Student[] students, Consumer<Student> action) {
        for (Student s : students) action.accept(s);
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Іван Петренко", "AI-21", new int[]{90, 80, 70}),
                new Student("Ольга Сидоренко", "AI-21", new int[]{95, 85, 100})
        };

        Consumer<Student> printName = s -> System.out.println(s.getName());
        forEach(students, printName);
    }
}