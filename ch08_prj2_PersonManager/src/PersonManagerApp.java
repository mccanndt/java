
public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager\n");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String create = Console.getString("Create customer or employee? (c/e): ", "c", "e");
			if (create.equalsIgnoreCase("c")) {
				Customer c = createCustomer();
				System.out.println("\nYou entered a new Customer:");
				System.out.println(c.toString());

			} else {
				Employee e = createEmployee();
				System.out.println("\nYou entered a new Employee:");
				System.out.println(e.toString());
			}

			choice = Console.getString("\nContinue? (y/n): ", "y", "n");
		}
	}

	public static Customer createCustomer() {
		String firstName = Console.getString("\nFirst name: ");
		String lastName = Console.getString("Last name: ");
		String number = Console.getString("Customer number: ");

		return new Customer(firstName, lastName, number);
	}

	public static Employee createEmployee() {
		String firstName = Console.getString("\nFirst name: ");
		String lastName = Console.getString("Last name: ");
		String ssn = Console.getString("SSN: ");

		return new Employee(firstName, lastName, ssn);
	}
}
