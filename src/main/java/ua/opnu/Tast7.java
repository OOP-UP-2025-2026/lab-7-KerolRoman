package ua.opnu;
import java.util.function.Function;

public class Tast7 {
    public static String[] stringify(int[] numbers, Function<Integer, String> func) {
        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = func.apply(numbers[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Function<Integer, String> numberToWord = n -> switch (n) {
            case 0 -> "нуль";
            case 1 -> "один";
            case 2 -> "два";
            case 3 -> "три";
            case 4 -> "чотири";
            case 5 -> "п’ять";
            case 6 -> "шість";
            case 7 -> "сім";
            case 8 -> "вісім";
            case 9 -> "дев’ять";
            default -> "щось далі";
        };

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] result = stringify(arr, numberToWord);

        for (String s : result) System.out.print(s + " ");
    }
}