package business;

public class CheckingAccount extends Account {
	// Instance variables
	private double monthlyFee;

	// Constructor
	public CheckingAccount(double balance, double monthlyFee) {
		super(balance);
		this.monthlyFee = monthlyFee;
	}

	// Getters / Setters
	public double getMonthlyFee() {
		return monthlyFee;
	}

	// Methods
	public void subtractMonthyFee() {
		withdraw(monthlyFee);
	}

}
