
public class GuessingGameApp {

	public static void main(String[] args) {
		final int LIMIT = 100;
		Game.welcomeMessage(LIMIT);
		
		// Start try again loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// Get random number
			int number = Game.getRandomInt(LIMIT);
			// Start guessing loop
			int numberOfGuesses = 0;
			while (true) {
				int guess = Console.getInt("\nEnter number: ", 1, LIMIT);
				numberOfGuesses += 1;
				if (Game.isCorrectGuess(number, guess, numberOfGuesses)) {
					break;
				}
			}
			choice = Console.getString("Try again? (y/n): ", "y", "n");
		}
	}

	
}
