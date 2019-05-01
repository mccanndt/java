
public class Bart extends Player {

	public Bart() {
		name = "Bart";
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
