
public class RoshamboApp {

	public static void main(String[] args) {
		Player p = null;
		Player1 p1 = new Player1();

		System.out.println("Welcome to the game of Roshambo\n");

		String playerName = Console.getString("Enter your name: ");
		p1.setName(playerName);

		String opponentName = Console.getString("\nWould you like to play Bart or Lisa? (B/L): ", "B", "L");

		// Choose opponent
		if (opponentName.equalsIgnoreCase("b")) {
			p = new Bart();
		} else if (opponentName.equalsIgnoreCase("l")) {
			p = new Lisa();
		}

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// Get player choice
			String rps = Console.getString("\nRock, paper, or scissors? (R/P/S): ", "r", "p", "s");
			if (rps.equalsIgnoreCase("r")) {
				p1.setR(Roshambo.ROCK);
			} else if (rps.equalsIgnoreCase("p")) {
				p1.setR(Roshambo.PAPER);
			} else {
				p1.setR(Roshambo.SCISSORS);
			}

			// Get opponent choice
			p.setR(p.generateRoshambo());

			// Calculate winner
			String winner = "";
			if (p.getR().equals(p1.getR())) {
				winner = "Draw!";
			} else if (p.getR().equals(Roshambo.ROCK) && p1.getR().equals(Roshambo.PAPER)) {
				winner = p1.getName() + " wins!";
			} else if (p.getR().equals(Roshambo.ROCK) && p1.getR().equals(Roshambo.SCISSORS)) {
				winner = p.getName() + " wins!";
			} else if (p.getR().equals(Roshambo.PAPER) && p1.getR().equals(Roshambo.ROCK)) {
				winner = p.getName() + " wins!";
			} else if (p.getR().equals(Roshambo.PAPER) && p1.getR().equals(Roshambo.SCISSORS)) {
				winner = p1.getName() + " wins!";
			} else if (p.getR().equals(Roshambo.SCISSORS) && p1.getR().equals(Roshambo.PAPER)) {
				winner = p.getName() + " wins!";
			} else if (p.getR().equals(Roshambo.SCISSORS) && p1.getR().equals(Roshambo.ROCK)) {
				winner = p1.getName() + " wins!";
			}

			// Display Results
			System.out.println();
			System.out.println(p1.getName() + ": " + p1.getR().toString());
			System.out.println(p.getName() + ": " + p.getR().toString());
			System.out.println(winner);

			choice = Console.getString("\nPlay again? (y/n): ", "y", "n");
		}

	}

}
