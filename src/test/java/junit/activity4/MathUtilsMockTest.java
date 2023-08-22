package junit.activity4;

import junit.activity3.CalculatorService;
import junit.activity3.MathUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MathUtilsMockTest {

    @InjectMocks
    private MathUtils mathUtils;

    @Mock
    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @DisplayName("Test to find if add method works fine.")
    @Nested
    class AddTest {
        @DisplayName("Test to check if add method is working fine for two positive numbers.")
        @Test
        void givenTwoPositives_whenCallMethod_thenSuccess() {
            int a = 10;
            int b = 5;

            Mockito.when(calculatorService.add(a, b)).thenReturn(15);

            int actualResult = mathUtils.add(a, b);

            assertEquals(15, actualResult);
        }
    }
}
