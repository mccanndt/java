package mccann.app;
import java.text.NumberFormat;

import mccann.account.CheckingAccount;
import mccann.account.SavingsAccount;
import mccann.presentation.Console;

public class AccountBalanceApp {

	// Account variables
	static CheckingAccount ca = new CheckingAccount(1000, 1);
	static SavingsAccount sa = new SavingsAccount(1000, 0.01);

	// Number formatting
	static NumberFormat currency = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		// Display welcome messages
		System.out.println("Welcome to the Account application\n");
		startingBalances();
		System.out.println("\nEnter the transactions for the month");

		// Start of transactions loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String wd = Console.getString("\nWithdrawal or deposit? (w/d): ", "w", "d");
			String cs = Console.getString("Checking or savings? (c/s): ", "c", "s");
			double amount = Console.getDouble("Amount?: ");

			doTransaction(wd, cs, amount);

			choice = Console.getString("\nContinue? (y/n): ", "y", "n");
		}
		// Final calculations
		ca.subtractMonthyFee();
		sa.applyMonthlyInterestPayment();

		// Display results
		displayPaymentsFees();
		displayFinalBalances();
	}

	public static void startingBalances() {
		System.out.println("Starting Balances");
		System.out.println("Checking: " + currency.format(ca.getBalance()));
		System.out.println("Savings:  " + currency.format(sa.getBalance()));
	}

	public static void doTransaction(String wd, String cs, double amount) {
		if (wd.equalsIgnoreCase("w")) {
			// Withdraw chosen
			if (cs.equalsIgnoreCase("c")) {
				// Checking chosen
				ca.withdraw(amount);
			} else if (cs.equalsIgnoreCase("s")) {
				// Savings chosen
				sa.withdraw(amount);
			}
		} else if (wd.equalsIgnoreCase("d")) {
			// Deposit chosen
			if (cs.equalsIgnoreCase("c")) {
				// Checking chosen
				ca.deposit(amount);
			} else if (cs.equalsIgnoreCase("s")) {
				// Savings chosen
				sa.deposit(amount);
			}
		}
	}

	public static void displayPaymentsFees() {
		System.out.println("\nMonthly Payments and Fees");
		System.out.println("Checking fee:             " + currency.format(ca.getMonthlyFee()));
		System.out.println("Savings interest payment: " + currency.format(sa.getMonthlyInterestPayment()));
	}

	public static void displayFinalBalances() {
		System.out.println("\nFinal Balances");
		System.out.println("Checking: " + currency.format(ca.getBalance()));
		System.out.println("Savings:  " + currency.format(sa.getBalance()));
	}
}
