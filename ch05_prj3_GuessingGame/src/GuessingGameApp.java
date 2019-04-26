import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		final int LIMIT = 100;
		Scanner sc = new Scanner(System.in);
		welcomeMessage(LIMIT);
		
		// Start try again loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// Get random number
			int number = getRandomInt(LIMIT);
			// Start guessing loop
			int numberOfGuesses = 0;
			while (true) {
				int guess = getIntWithinRange(sc, "\nEnter number: ", 1, LIMIT);
				numberOfGuesses += 1;
				if (isCorrectGuess(number, guess, numberOfGuesses)) {
					break;
				}
			}
			choice = getStringWithinRange(sc, "Try again? (y/n): ");
		}
	}

	public static void welcomeMessage(int limit) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++\n");
		System.out.println("I'm thinking of a number from 1 to " + limit);
		System.out.println("Try to guess it.");
	}

	public static int getRandomInt(int limit) {
		int randomInt = (int) (Math.random() * limit) + 1;
		return randomInt;
	}
	
	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine();
		}
		return i;
	}

	public static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			i = getInt(sc, prompt);
			if (i < min) {
				System.out.println("Error! Number must be greater than " + (min - 1));
			} else if (i > max) {
				System.out.println("Error! Number must be less than " + (max + 1));
			} else {
				isValid = true;
			}
		}
		return i;
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

	public static boolean isCorrectGuess(int number, int guess, int numberOfGuesses) {
		if (guess - number > 10) {
			System.out.println("Way too high!");
			return false;
		} else if (guess > number) {
			System.out.println("Too high!");
			return false;
		} else if (number - guess > 10) {
			System.out.println("Way too low!");
			return false;
		} else if (guess < number) {
			System.out.println("Too low!");
			return false;
		} else {
			System.out.println("You got it in " + numberOfGuesses + " tries.");
			if (numberOfGuesses <= 3) {
				System.out.println("Great work! You are a mathematical wizard.");
			} else if (numberOfGuesses <= 7) {
				System.out.println("Not too bad! You've got some potential.");
			} else {
				System.out.println("What took you so long? Maybe you should take some lessons.");
			}
		}
		return true;
	}
}
