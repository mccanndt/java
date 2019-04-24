package ch03_prj1_TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			
			// User input
			System.out.print("Enter degrees in Fahrenheit: ");
			double f = sc.nextDouble();
			
			// Math
			double c = (((f - 32) * (5.0 / 9.0)) * 100) / 100;
			
			// Output
			System.out.println("Degrees in Celsius: " + c);
			
			// Loop question
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}
		sc.close();
	}

}
