package ch04_prj1_TableOfPowers;

import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table");
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// Get user input
			System.out.print("Enter an integer: ");
			int input = sc.nextInt();

			// Display results and math
			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");

			for (int i = 1; i <= input; i++) {
				// Math
				int square = i * i;
				int cube = i * i * i;
				System.out.println(i + "\t" + square + "\t" + cube);
			}

			// Loop question
			System.out.println("Continue? (y/n)");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("Bye!");
		sc.close();

	}

}
