
public class UserIOTestApp {
	// Console variable
	static ConsoleIO cio = IOFactory.getUserIO();

	public static void main(String[] args) {
		// Welcome message
		cio.println("Welcome to the Console Tester application\n");

		// Int test
		cio.println("Int Test");
		cio.getInt("Enter an integer between -100 and 100: ", -101, 101);
		cio.println();

		// Double test
		cio.println("Double Test");
		cio.getDouble("Enter any number between -100 and 100: ", -101, 101);
		cio.println();

		// Required string test
		cio.println("Required String Test");
		cio.getString("Enter your email address: ");
		cio.println();

		// String choice test
		cio.println("String Choice Test");
		cio.getString("Select one (x/y): ", "x", "y");

	}

}
