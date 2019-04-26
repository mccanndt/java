import java.util.Scanner;

public class DataValidationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator\n");
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// Ask for length
			double length = getDoubleWithinRange(sc, "Enter length: ", 0.0, 1000000.0);

			// Ask for width
			double width = getDoubleWithinRange(sc, "Enter width: ", 0.0, 1000000.0);

			// Math
			double area = width * length;
			double perimeter = (2 * width) + (2 * length);

			// Display results
			System.out.println("Area:      " + area);
			System.out.println("Perimeter: " + perimeter);

			// Loop Question
			choice = getStringWithinRange(sc, "\nContinue? (y/n): ");
		}
		System.out.println("Bye!");
		sc.close();
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine();
		}
		return d;
	}

	public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			d = getDouble(sc, prompt);
			if (d <= min) {
				System.out.println("Error! Number must be greater than " + min);
			} else if (d >= max) {
				System.out.println("Error! Number must be less than " + max);
			} else {
				isValid = true;
			}
		}
		return d;
	}

	public static String getString(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			s = sc.nextLine();
			if (!s.isEmpty()) {
				isValid = true;
			} else {
				System.out.println("Error! This entry is required. Try again.");
			}
		}
		return s;
	}

	public static String getStringWithinRange(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false;
		while (!isValid) {
			s = getString(sc, prompt);
			if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("n")) {
				isValid = true;
			} else {
				System.out.println("Error! This entry must be 'y' or 'n'.");
			}
		}
		return s;
	}
}
