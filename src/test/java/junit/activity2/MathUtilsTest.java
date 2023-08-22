package junit.activity2;

import junit.activity1.MathUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    @DisplayName("Test to find if add method works fine.")
    @Nested
    class AddTest {
        @DisplayName("Test to check if add method is working fine for two positive numbers.")
        @Test
        void givenTwoPositives_whenCallMethod_thenSuccess() {
            MathUtils mathUtils = new MathUtils();
            int a = 10;
            int b = 5;

            int actualResult = mathUtils.add(a, b);

            assertEquals(15, actualResult);
        }

        @DisplayName("Test to check if add method is working fine for two negative numbers.")
        @Test
        void givenTwoNegatives_whenCallMethod_thenSuccess() {
            MathUtils mathUtils = new MathUtils();
            int a = -10;
            int b = -5;

            int actualResult = mathUtils.add(a, b);

            assertEquals(-15, actualResult);
        }
    }

    @DisplayName("Test to find if subtract method works fine.")
    @Nested
    class SubtractTest {
        @DisplayName("Test to check if subtract method is working fine for two positive numbers.")
        @Test
        void givenTwoPositives_whenCallMethod_thenSuccess() {
            MathUtils mathUtils = new MathUtils();
            int a = 10;
            int b = 5;

            int actualResult = mathUtils.subtract(a, b);

            assertEquals(5, actualResult);
        }

        @DisplayName("Test to check if subtract method is working fine for two negative numbers.")
        @Test
        void givenTwoNegatives_whenCallMethod_thenSuccess() {
            MathUtils mathUtils = new MathUtils();
            int a = -10;
            int b = -5;

            int actualResult = mathUtils.subtract(a, b);

            assertEquals(-5, actualResult);
        }
    }

    @DisplayName("Test to find if multiply method works fine.")
    @Nested
    class MultiplyTest {
        @DisplayName("Test to check if multiply method is working fine for two positive numbers.")
        @Test
        void givenTwoPositives_whenCallMethod_thenSuccess() {
            MathUtils mathUtils = new MathUtils();
            int a = 10;
            int b = 5;

            int actualResult = mathUtils.multiply(a, b);

            assertEquals(50, actualResult);
        }

        @DisplayName("Test to check if multiply method is working fine for two negative numbers.")
        @Test
        void givenTwoNegatives_whenCallMethod_thenSuccess() {
            MathUtils mathUtils = new MathUtils();
            int a = -10;
            int b = -5;

            int actualResult = mathUtils.multiply(a, b);

            assertEquals(50, actualResult);
        }

        @DisplayName("Test to check if multiply method is working fine for multiplication between multiple positive numbers and 5.")
        @ParameterizedTest
        @ValueSource(ints = {2, 4, 6, 8})
        void testMultiply(int value) {
            MathUtils mathUtils = new MathUtils();
            int result = mathUtils.multiply(value, 5);
            assertEquals(value * 5, result);
        }
    }

    @DisplayName("Test to find if divide method works fine.")
    @Nested
    class DivideTest {
        @DisplayName("Test to check if divide method is working fine for two positive numbers.")
        @Test
        void givenTwoPositives_whenCallMethod_thenSuccess() {
            MathUtils mathUtils = new MathUtils();
            int a = 10;
            int b = 5;

            double actualResult = mathUtils.divide(a, b);

            assertEquals(2.0, actualResult);
        }

        @DisplayName("Test to check if divide method is throwing exception in case the denominator is 0.")
        @Test
        void givenDenominatorAsZero_whenCallMethod_thenThrowException() {
            MathUtils mathUtils = new MathUtils();
            int a = 10;
            int b = 0;

            assertThrows(ArithmeticException.class, () -> mathUtils.divide(a, b), () -> "Response did not match");
        }
    }

}
