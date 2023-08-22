package junit.activity3;

public class MathUtils {

    private CalculatorService calculatorService;

    public MathUtils(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int add(int a, int b) {
        return calculatorService.add(a, b);
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
