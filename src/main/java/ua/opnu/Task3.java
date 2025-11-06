package ua.opnu;
import java.util.*;
import java.util.function.Predicate;
import java.util.Arrays;


public class Task3 {
    public static <T> List<T> filter(List<T> list, Predicate<T> p1, Predicate<T> p2) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (p1.and(p2).test(item)) result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30, 35);

        Predicate<Integer> req1 = n -> n % 2 == 0;
        Predicate<Integer> req2 = n -> n > 10;

        List<Integer> filtered = filter(nums, req1, req2);
        System.out.println(filtered);
    }
}
