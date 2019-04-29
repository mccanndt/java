
public class Game {
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
