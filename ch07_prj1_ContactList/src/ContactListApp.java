
public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List application");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			String firstName = Console.getString("Enter first name: ");
			String lastName = Console.getString("Enter last name: ");
			String email = Console.getString("Enter email: ");
			String phone = Console.getString("Enter phone: ");
			
			Contact contact = new Contact(firstName, lastName, email, phone);
			
			contact.displayContact();
			// Loop?
			choice = Console.getString("\nContinue? (y/n): ");
		}

	}

}
