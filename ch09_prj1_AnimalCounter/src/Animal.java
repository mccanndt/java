
public abstract class Animal implements Countable {
	// Instance Variables
	static int count;
	
	// Countable methods
	@Override
	public void incrementCount() {
		count += 1;
	}

	@Override
	public void resetCount() {
		count = 0;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public String getCountString() {
		return null;
	}
}
