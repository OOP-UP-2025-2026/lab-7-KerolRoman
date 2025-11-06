package ua.opnu;
import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        System.out.println(isPrime.test(2));
        System.out.println(isPrime.test(27));
        System.out.println(isPrime.test(17));
    }
}
