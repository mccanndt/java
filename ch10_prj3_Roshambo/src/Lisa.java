import java.util.Random;

public class Lisa extends Player {

	public Lisa() {
		name = "Lisa";
	}

	@Override
	public Roshambo generateRoshambo() {
		Random random = new Random();
		int rand = random.nextInt(3);

		switch (rand) {
		case 0:
			return Roshambo.ROCK;
		case 1:
			return Roshambo.PAPER;
		case 2:
			return Roshambo.SCISSORS;
		}

		return null;

	}

}
