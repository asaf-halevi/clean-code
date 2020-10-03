package srp;

import static org.junit.Assert.assertEquals;

import java.security.InvalidAlgorithmParameterException;

import org.junit.BeforeClass;
import org.junit.Test;

public class SingleResponsibilityPrincipleAfterTest {

	private static SingleResponsibilityPrincipleAfter calculator;

	@BeforeClass
	public static void beforeTests() {
		calculator = new SingleResponsibilityPrincipleAfter();
	}

	@Test
	public void addTest() {
		int actual = calculator.add(9 ,5);
		int expected = 9 + 5;
		assertEquals(expected, actual);
	}

	@Test
	public void subtractTest() {
		int actual = calculator.subtract(9 ,5);
		int expected = 9 - 5;
		assertEquals(expected, actual);
	}

	@Test
	public void mutlitplyTest() {
		int actual = calculator.multiply(9 ,5);
		int expected = 9 * 5;
		assertEquals(expected, actual);
	}

	@Test
	public void divideTest() {
		int actual = calculator.divide(9 ,5);
		int expected = 9 / 5;
		assertEquals(expected, actual);
	}

	@Test
	public void modulusTest() {
		int actual = calculator.modulus(9 ,5);
		int expected = 9 % 5;
		assertEquals(expected, actual);
	}

	@Test
	public void getResultAsStringTest() throws InvalidAlgorithmParameterException {
		CalcInfo calcInfo = new CalcInfo(1, 1, CalcInfo.ADD);
		String actual = calculator.getResultAsString(calcInfo, 2);
		String expected = "\n1 + 1 = 2";
		assertEquals(expected, actual);
	}
}
