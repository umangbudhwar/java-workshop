package lambdas.activity4;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class Activity4 {
    public static void main(String[] args) {
        Function<String, String> toUppercase = str -> str.toUpperCase();

        String inputString = "hello, world!";
        String uppercaseString = toUppercase.apply(inputString);

        System.out.println("Original: " + inputString);
        System.out.println("Uppercase: " + uppercaseString);
    }
}
