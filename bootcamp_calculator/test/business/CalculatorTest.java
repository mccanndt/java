package business;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	static Calculator calc;
	static int a = 10;
	static int b = 5;

	// New calculator
	@BeforeClass
	public static void createCalculator() {
		calc = new Calculator();
	}

	// Add
	@Test
	public void addTest() {
		calc.add(a, b);
		assertEquals(15, calc.getAnswer());
	}

	// Subtract
	@Test
	public void subtractTest() {
		calc.subtract(a, b);
		assertEquals(5, calc.getAnswer());
	}

	// Multiply
	@Test
	public void multiplyTest() {
		calc.multiply(a, b);
		assertEquals(50, calc.getAnswer());
	}

	// Divide
	@Test
	public void divideTest() {
		calc.divide(a, b);
		assertEquals(2, calc.getAnswer());
	}

	// Modulus
	@Test
	public void modulusTest() {
		calc.modulus(a, b);
		assertEquals(0, calc.getAnswer());
	}
}
