package ch04_prj3_TipCalculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			// Number Formatting
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			
			// User input
			System.out.print("Cost of meal: ");
			BigDecimal cost = sc.nextBigDecimal();
			System.out.println();
			
			// Display and Math
			// 15%
			BigDecimal percent = new BigDecimal("0.15");
			BigDecimal tip = cost.multiply(percent);
			BigDecimal total = cost.add(tip);
			System.out.println("15%");
			System.out.println("Tip amount:   " + currency.format(tip));
			System.out.println("Total amount: " + currency.format(total));
			System.out.println();
			
			// 20%
			percent = new BigDecimal("0.20");
			tip = cost.multiply(percent);
			total = cost.add(tip);
			System.out.println("20%");
			System.out.println("Tip amount:   " + currency.format(tip));
			System.out.println("Total amount: " + currency.format(total));
			System.out.println();
			
			// 25%
			percent = new BigDecimal("0.25");
			tip = cost.multiply(percent);
			total = cost.add(tip);
			System.out.println("25%");
			System.out.println("Tip amount:   " + currency.format(tip));
			System.out.println("Total amount: " + currency.format(total));
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
			
		}
		System.out.println("Bye!");
		sc.close();
	}

}
