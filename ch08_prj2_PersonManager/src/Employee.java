
public class Employee extends Person {
	// Variables
	private String ssn;

	// Constructor
	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}

	// Getters / Setters
	public String getSsn() {
		return ssn.replaceAll("[^-\\n](?=.*?-)", "*");
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSNN: " + getSsn();
	}
}
