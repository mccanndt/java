import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator App!\n");

		// Declare a scanner
		Scanner sc = new Scanner(System.in);

		// Declare int variables
		int x = 0;
		int y = 0;

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			// Scan for the first number
			System.out.print("Please enter the first integer: ");
			while (!sc.hasNextInt()) {
				System.out.println("Please enter a number only!\n");
				System.out.println("Please enter the first number: ");
				sc.next();
			}
			x = sc.nextInt();

			// Scan for the second number
			System.out.print("Please enter a second integer: ");
			while (!sc.hasNextInt()) {
				System.out.println("Please enter a number only!\n");
				System.out.println("Please enter the second number: ");
				sc.next();
			}
			y = sc.nextInt();

			// Do some math
			int result1 = x + y;
			int result2 = x - y;
			int result3 = x * y;
			int result4 = x / y;

			// Print results
			System.out.println("Int sum: " + result1);
			System.out.println("Int sub: " + result2);
			System.out.println("Int mult: " + result3);
			System.out.println("Int div: " + result4);
			
			// Continue question
			System.out.print("\nWould you like to continue? (y/n): ");
			choice = sc.next();

			System.out.println();

		}
		sc.close();
		System.out.println("Goodbye!");
	}

}
