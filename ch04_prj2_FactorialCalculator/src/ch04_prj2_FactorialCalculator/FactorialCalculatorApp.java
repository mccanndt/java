package ch04_prj2_FactorialCalculator;

import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			// User input
			System.out.print("Enter a positive integer that's less than 10: ");
			int integer = sc.nextInt();
			
			long result = 1;
			for (int i = 1; i <= integer; i++) {
				result *= i;
			}
			
			System.out.println("The factorial of " + integer + " is " + result);
			
			// Loop question
			System.out.print("\nContinue? (y/n)");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("Bye!");
		sc.close();
	}

}
