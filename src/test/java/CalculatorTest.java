import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.northgrum.beavercreek.devsecops.Calculator;

public class CalculatorTest {
    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result, "Addition should return correct sum");
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        int result = calc.subtract(5, 3);
        assertEquals(2, result, "Subtraction should return correct difference");
    }

    @Test
    void testMultiplication() {
        Calculator calc = new Calculator();
        int result = calc.multiply(2, 3);
        assertEquals(6, result, "Multiplication should return correct product");
    }

    @Test
    void testDivision() {
        Calculator calc = new Calculator();
        int result = calc.divide(6, 3);
        assertEquals(2, result, "Division should return correct quotient");
    }
}
