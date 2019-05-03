package ui;

import business.Calculator;
import util.Console;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator app!\n");

		// Start of continue loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// TODO: Have user select from multiple calculators (simple, scientific)
			Calculator calc = new Calculator();
			// toString shows what the calculator can do
			System.out.println(calc.toString());

			// Ask user for operation type
			String opSelection = Console.getString("\nWhich operation would you like to do?: ", calc.getOperators());

			// Ask user for the two numbers
			int n1 = Console.getInt("First integer: ");
			int n2 = 1;
			if (opSelection.equalsIgnoreCase("/")) {
				// Check for divide by 0
				n2 = Console.getInt("Second integer: ", 0, Integer.MAX_VALUE);
			} else {
				n2 = Console.getInt("Second integer: ");
			}

			// Do calculations and get answer
			calculate(calc, opSelection, n1, n2);

			// Loop question
			choice = Console.getString("\nAnother calculation? (y/n): ", "y", "n");
			System.out.println();
		}
		System.out.println("Thank you for using the calculator app!");
	}

	public static void calculate(Calculator calc, String operator, int i1, int i2) {

		switch (operator) {
		case "+":
			calc.add(i1, i2);
			break;
		case "-":
			calc.subtract(i1, i2);
			break;
		case "*":
			calc.multiply(i1, i2);
			break;
		case "/":
			calc.divide(i1, i2);
			break;
		case "%":
			calc.modulus(i1, i2);
			break;
		}
		System.out.println("Answer: " + calc.getAnswer());
	}
}
