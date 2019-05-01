package ui;
import java.text.NumberFormat;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import util.Console;

public class AccountBalanceApp {

	// Account variables
	static CheckingAccount ca = new CheckingAccount(1000, 1);
	static SavingsAccount sa = new SavingsAccount(1000, 0.01);

	// Number formatting
	static NumberFormat currency = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		// Display welcome messages
		System.out.println("Welcome to the Account application\n");
		System.out.println("Starting Balances");
		displayBalances();
		System.out.println("\nEnter the transactions for the month");

		// Start of transactions loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String wd = Console.getString("\nWithdrawal or deposit? (w/d): ", "w", "d");
			String cs = Console.getString("Checking or savings? (c/s): ", "c", "s");
			double amount = Console.getDouble("Amount?: ", 0, Double.POSITIVE_INFINITY);

			doTransaction(wd, cs, amount);

			choice = Console.getString("\nContinue? (y/n): ", "y", "n");
		}
		// Final calculations
		ca.subtractMonthyFee();
		sa.applyMonthlyInterestPayment();

		// Display results
		displayPaymentsFees();
		System.out.println("\nFinal Balances");
		displayBalances();
	}

	public static void displayBalances() {
		System.out.println("Checking: " + currency.format(ca.getBalance()));
		System.out.println("Savings:  " + currency.format(sa.getBalance()));
	}

	public static void doTransaction(String wd, String cs, double amount) {
		
		Account a;
		if (cs.equalsIgnoreCase("c")) {
			a = ca;
		} else {
			a = sa;
		}
		
		if (wd.equalsIgnoreCase("w")) {
			a.withdraw(amount);
		} else {
			a.deposit(amount);
		}
	}

	public static void displayPaymentsFees() {
		System.out.println("\nMonthly Payments and Fees");
		System.out.println("Checking fee:             " + currency.format(ca.getMonthlyFee()));
		System.out.println("Savings interest payment: " + currency.format(sa.getMonthlyInterestPayment()));
	}
}
