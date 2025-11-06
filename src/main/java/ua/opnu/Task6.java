package ua.opnu;

import java.util.function.Function;

public class Task6 {
    public static void main(String[] args) {
        Function<Integer, Integer> powerOfTwo = n -> (int) Math.pow(2, n);

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int n : arr) {
            System.out.println("2^" + n + " = " + powerOfTwo.apply(n));
        }
    }
}