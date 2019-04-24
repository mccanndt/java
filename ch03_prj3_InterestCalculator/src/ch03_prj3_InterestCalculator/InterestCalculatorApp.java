package ch03_prj3_InterestCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			// User input
			System.out.print("Enter loan amount: ");
			BigDecimal amount = sc.nextBigDecimal();
			
			System.out.print("Enter interest rate: ");
			BigDecimal rate = sc.nextBigDecimal();
			
			// Compute interest
			BigDecimal interest = amount.multiply(rate);
			
			// Create currency format and set rounding mode to half up
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			currency.setRoundingMode(RoundingMode.HALF_UP);
			
			// Create percent format and set number of decimals to 3
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);
			
			// Display output with formatting
			System.out.println("Loan Amount: " + currency.format(amount));
			System.out.println("Interest Rate: " + percent.format(rate));
			System.out.println("Interest: " + currency.format(interest));
			
			// Loop question
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		sc.close();
	}

}
