package lambdas.activity2;

import java.util.function.Consumer;

public class Activity2 {
    public static void main(String[] args) {
        Consumer<Integer> squarePrinter = num -> {
            int square = num * num;
            System.out.println("The square of " + num + " is: " + square);
        };

        int number = 5;
        squarePrinter.accept(number);
    }
}
