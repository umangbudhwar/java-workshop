package lambdas.activity6;

import java.util.function.BinaryOperator;

public class Activity6 {
    public static void main(String[] args) {
        StringToInt stringToIntLambda = str -> Integer.parseInt(str);

        String numberString = "12345";
        int convertedInt = stringToIntLambda.convert(numberString);

        System.out.println("Converted Integer: " + convertedInt);
    }
}
