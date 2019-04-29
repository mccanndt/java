
public class Customer extends Person {
	// Variables
	private String number;

	// Constructor
	public Customer(String firstName, String lastName, String number) {
		super(firstName, lastName);
		this.number = number;
	}

	// Getters / Setters
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCustomer Number: " + number;
	}
}
