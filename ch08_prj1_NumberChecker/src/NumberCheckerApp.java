
public class NumberCheckerApp {

	public static void main(String[] args) {
		MyConsole mc = new MyConsole();

		System.out.println("Welcome to the Odd/Even Checker!\n");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int n = mc.getInt("Enter an integer: ");

			if (n % 2 == 0) {
				System.out.println("The number " + n + " is even.");
			} else {
				System.out.println("The number " + n + " is odd.");
			}
			choice = mc.getString("Continue? (y/n): ");
		}
	}
}
