
public abstract class Animal implements Countable {
	// Instance Variables
	private static int count;

	public static void setCount(int count) {
		Animal.count = count;
	}

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
