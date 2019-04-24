package ch03_prj2_TravelTimeConverter;

import java.util.Scanner;

public class TravelTimeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			// User input
			System.out.print("Enter miles: ");
			double miles = sc.nextDouble();
			
			System.out.print("Enter miles per hour: ");
			double mph = sc.nextDouble();
			
			// Math
			int hours = (int) (miles / mph);
			int minutes = (int) (((miles / mph) * 60) % 60);
			
			// Output
			System.out.println("Estimated travel time");
			System.out.println("---------------------");
			System.out.println("Hours:   " + hours);
			System.out.println("Minutes: " + minutes);
			
			// Loop question
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		sc.close();
	}

}
