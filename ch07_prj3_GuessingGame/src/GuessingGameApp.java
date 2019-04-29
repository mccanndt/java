
public class GuessingGameApp {

	public static void main(String[] args) {
		
		Game.welcomeMessage();
		
		// Start try again loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			Game g = new Game();
			// Start guessing loop
			while (true) {
				int guess = Console.getInt("\nEnter number: ", 1, Game.LIMIT);
				
				if (g.isCorrectGuess(guess)) {
					break;
				}
			}
			choice = Console.getString("Try again? (y/n): ", "y", "n");
		}
	}
}
