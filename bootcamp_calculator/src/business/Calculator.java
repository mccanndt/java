package business;

public class Calculator implements Addable, Divisable, Modulable, Multiplicable, Subtractable {
	// Instance Variable
	private int answer;

	// Constructor
	public Calculator() {
		super();
	}

	// Getter
	// answer is calculated so no setter
	public int getAnswer() {
		return answer;
	}

	// Implement interfaces
	@Override
	public void subtract(int i1, int i2) {
		answer = i1 - i2;
	}

	@Override
	public void multiply(int i1, int i2) {
		answer = i1 * i2;
	}

	@Override
	public void modulus(int i1, int i2) {
		answer = i1 % i2;
	}

	@Override
	public void divide(int i1, int i2) {
		answer = i1 / i2;
	}

	@Override
	public void add(int i1, int i2) {
		answer = i1 + i2;
	}

	@Override
	public String toString() {
		String s = "This calculator can do:\n";
		s += "'+' : Addition\n";
		s += "'-' : Subtraction\n";
		s += "'*' : Multiplication\n";
		s += "'/' : Division\n";
		s += "'%' : Modulus";
		return s;
	}

	// Method for data validation array in Console.java
	public String[] getOperators() {
		String[] s = { "+", "-", "*", "/", "%" };
		return s;
	}
}
