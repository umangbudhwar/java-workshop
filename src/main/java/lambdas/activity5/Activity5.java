package lambdas.activity5;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Activity5 {
    public static void main(String[] args) {
        BinaryOperator<Integer> sumLambda = (a, b) -> a + b;

        int num1 = 10;
        int num2 = 20;

        int sum = sumLambda.apply(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
