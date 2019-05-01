
public abstract class Player {
	String name;
	Roshambo r;

	public Player() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Roshambo getR() {
		return r;
	}

	public void setR(Roshambo r) {
		this.r = r;
	}

	public abstract Roshambo generateRoshambo();
}
