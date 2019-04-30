
public class Sheep extends Animal implements Cloneable {
	//Instance variable
	String name;

	// Constructor
	public Sheep(String name) {
		this.name = name;
	}

	// Getters / Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getCountString() {
		// TODO Auto-generated method stub
		return count + " " + name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
