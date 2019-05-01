
public enum Roshambo {
	ROCK, PAPER, SCISSORS;

	@Override
	public String toString() {
		String s = "";

		switch (this.ordinal()) {
		case 0:
			s = "Rock";
			break;
		case 1:
			s = "Paper";
			break;
		case 2:
			s = "Scissors";
			break;
		}

		return s;
	}

}
