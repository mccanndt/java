package app;

import java.text.NumberFormat;

import util.Console;

public class BattingStatisticsApp {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMinimumFractionDigits(3);
		nf.setMaximumFractionDigits(3);

		System.out.println("Welcome to the Batting Average Calculator");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// Get number of bats
			int totalBats = Console.getInt("\nEnter number of times at bat: ", 0, 31);

			// Get the results
			System.out.println("\n0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
			int[] results = new int[totalBats];
			for (int i = 0; i < results.length; i++) {
				results[i] = Console.getInt("Result for at-bat " + i + ": ", -1, 5);
			}

			// Calculate results
			int basesScored = 0;
			int numberOfBases = 0;
			for (int result : results) {
				if (result > 0) {
					basesScored += 1;
				}
				numberOfBases += result;
			}

			double average = (double) basesScored / (double) results.length;
			double slugging = (double) numberOfBases / (double) results.length;

			// Display results
			System.out.println("Batting average: " + nf.format(average));
			System.out.println("Slugging percent: " + nf.format(slugging));

			// Loop question
			choice = Console.getString("\nAnother player? (y/n): ", "y", "n");
		}

		System.out.println("\nBye!");

	}

}
