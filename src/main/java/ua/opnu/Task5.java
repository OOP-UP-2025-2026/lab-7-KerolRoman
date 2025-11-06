package ua.opnu;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Task5 {
    public static void process(int[] arr, Predicate<Integer> condition, Consumer<Integer> action) {
        for (int i : arr) {
            if (condition.test(i)) action.accept(i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 10, 41, 20};

        Predicate<Integer> even = n -> n % 2 == 0;
        Consumer<Integer> print = n -> System.out.println("Парне число: " + n);

        process(nums, even, print);
    }
}