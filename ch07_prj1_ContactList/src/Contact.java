
public class Contact {
	// Variables
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	// Constructors
	public Contact() {
		firstName = "";
		lastName = "";
		email = "";
		phone = "";
	}

	public Contact(String firstName, String lastName, String email, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
	// Getter / Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
		
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phone=" + phone + "]";
	}

	public String displayContact() {
		String s = "\n";
		s += "--------------------------------------------\n";
		s += "---- Current Contact -----------------------\n";
		s += "--------------------------------------------\n";
		s += "Name: " + firstName + " " + lastName + "\n";
		s += "Email Address: " + email + "\n";
		s += "Phone Number: " + phone + "\n";
		s += "--------------------------------------------\n";
		
		return s;
	}
	
}