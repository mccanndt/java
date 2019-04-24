package ch03_prj4_ChangeCalculator;

import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			// User Input
			System.out.print("Enter number of cents (0-99): ");
			int cents = sc.nextInt();
			
			// Math
			int quarters = cents / 25;
			cents -= quarters * 25;
			
			int dimes = cents / 10;
			cents -= dimes * 10;
			
			int nickles = cents / 5;
			cents -= nickles * 5;			
			
			int pennies = cents;
			
			// Output
			System.out.println("Quarters: " + quarters);
			System.out.println("Dimes:    " + dimes);
			System.out.println("Nickels:  " + nickles);
			System.out.println("Pennies:  " + pennies);
			
			// Loop question
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		
		sc.close();
	}
}
