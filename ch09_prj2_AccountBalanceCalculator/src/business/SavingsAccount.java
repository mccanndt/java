package business;

public class SavingsAccount extends Account {
	// Instance Variable
	private double monthlyInterestRate;
	private double monthlyInterestPayment;

	// Contructor
	public SavingsAccount(double balance, double monthlyInterestRate) {
		super(balance);
		this.monthlyInterestRate = monthlyInterestRate;
	}

	// Getters / Setters
	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}

	public void applyMonthlyInterestPayment() {
		monthlyInterestPayment = monthlyInterestRate * getBalance();
		deposit(monthlyInterestPayment);
	}

}
