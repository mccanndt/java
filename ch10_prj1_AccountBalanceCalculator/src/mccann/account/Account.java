package mccann.account;
import mccann.interfaces.Balanceable;
import mccann.interfaces.Depositable;
import mccann.interfaces.Withdrawable;

public class Account implements Balanceable, Depositable, Withdrawable {
	// Instance variables
	private double balance;

	// Constructor
	public Account(double balance) {
		this.balance = balance;
	}

	// Withdrawable
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	// Depositable
	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	// Balanceable (Getters / Setters)
	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		balance = amount;
	}

}
