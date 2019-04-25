package ch04_prj3_TipCalculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator");

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			// Number Formatting
			NumberFormat cf = NumberFormat.getCurrencyInstance();
			NumberFormat pf = NumberFormat.getPercentInstance();

			// User input
			System.out.print("Cost of meal: ");
			BigDecimal cost = sc.nextBigDecimal();
			System.out.println();

			// Display and Math
			for (int i = 15; i <= 25; i += 5) {
				double rate = i / 100.0;

				BigDecimal percent = new BigDecimal(rate);
				BigDecimal tip = cost.multiply(percent);
				BigDecimal total = cost.add(tip);
				System.out.println(pf.format(percent));
				System.out.println("Tip amount:   " + cf.format(tip));
				System.out.println("Total amount: " + cf.format(total));
				System.out.println();
			}

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();

		}
		System.out.println("Bye!");
		sc.close();
	}

}
