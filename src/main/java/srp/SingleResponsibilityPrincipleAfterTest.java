package srp;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.security.InvalidAlgorithmParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleResponsibilityPrincipleAfterTest {

    private static SingleResponsibilityPrincipleAfter calculator;

    @BeforeAll
    public static void beforeTests() {
        calculator = new SingleResponsibilityPrincipleAfter();
    }

    @Test
    public void addTest() {
        int actual = calculator.add(9, 5);
        int expected = 9 + 5;
        assertEquals(expected, actual);
    }

    @Test
    public void subtractTest() {
        int actual = calculator.subtract(9, 5);
        int expected = 9 - 5;
        assertEquals(expected, actual);
    }

    @Test
    public void mutlitplyTest() {
        int actual = calculator.multiply(9, 5);
        int expected = 9 * 5;
        assertEquals(expected, actual);
    }

    @Test
    public void divideTest() {
        int actual = calculator.divide(9, 5);
        int expected = 9 / 5;
        assertEquals(expected, actual);
    }

    @Test
    public void modulusTest() {
        int actual = calculator.modulus(9, 5);
        int expected = 9 % 5;
        assertEquals(expected, actual);
    }

    @Test
    public void calcResultAdd() throws InvalidAlgorithmParameterException {
        CalcInfo info = new CalcInfo(1, -1, CalcInfo.ADD);
        int actual = calculator.calcResult(info);
        assertEquals(0, actual);
    }

    @Test
    public void calcResultSubtract() throws InvalidAlgorithmParameterException {
        CalcInfo info = new CalcInfo(1, -1, CalcInfo.SUBTRACT);
        int actual = calculator.calcResult(info);
        assertEquals(2, actual);
    }

    @Test
    public void calcResultDivide() throws InvalidAlgorithmParameterException {
        CalcInfo info = new CalcInfo(10, 3, CalcInfo.DIVIDE);
        int actual = calculator.calcResult(info);
        assertEquals(3, actual);
    }

    @Test
    public void calcResultModulus() throws InvalidAlgorithmParameterException {
        CalcInfo info = new CalcInfo(10, 3, CalcInfo.MODULUS);
        int actual = calculator.calcResult(info);
        assertEquals(1, actual);
    }

    @Test
    public void calcResultMultiply() throws InvalidAlgorithmParameterException {
        CalcInfo info = new CalcInfo(10, 3, CalcInfo.MULTIPLY);
        int actual = calculator.calcResult(info);
        assertEquals(30, actual);
    }

    @Test
    public void getResultAsStringTest() throws InvalidAlgorithmParameterException {
        CalcInfo calcInfo = new CalcInfo(1, 1, CalcInfo.ADD);
        String actual = calculator.getResultAsString(calcInfo, 2);
        String expected = "\n1 + 1 = 2";
        assertEquals(expected, actual);
    }
}
