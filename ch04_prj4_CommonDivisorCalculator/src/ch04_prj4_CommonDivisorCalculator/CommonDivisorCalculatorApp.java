package ch04_prj4_CommonDivisorCalculator;

import java.util.Scanner;

public class CommonDivisorCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder");

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			// User input
			System.out.print("Enter first number: ");
			int x = sc.nextInt();

			System.out.print("Enter second number: ");
			int y = sc.nextInt();

			// Math
			while (x != 0) {
				while (y >= x) {
					y -= x;
				}
				int origX = x;
				x = y;
				y = origX;
			}

			// Display results
			System.out.println("Greatest common divisor: " + y);

			// Loop question
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("Bye!");
		sc.close();
	}

}
