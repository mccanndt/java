import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller");
		Scanner sc = new Scanner(System.in);

		// Ask initial question
		System.out.print("\nRoll the dice? (y/n): ");

		if (sc.next().equalsIgnoreCase("y")) {
			// Start of Roll Again loop
			String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				// Print results of dice roll
				printResults();

				// Loop question
				System.out.print("\nRoll again? (y/n): ");
				choice = sc.next();
			}
		}
		System.out.println("Bye!");
		sc.close();
	}

	public static int getRandomNumber() {
		return (int) (Math.random() * 6) + 1;
	}

	public static void printResults() {
		// Math
		int x = getRandomNumber();
		int y = getRandomNumber();
		int total = x + y;

		// Display
		System.out.println("\nDie 1: " + x);
		System.out.println("Die 2: " + y);
		System.out.println("Total: " + total);

		// Check for special cases
		if (total == 2) {
			System.out.println("Snake eyes!");
		} else if (total == 12) {
			System.out.println("Box cars!");
		}
	}
}
