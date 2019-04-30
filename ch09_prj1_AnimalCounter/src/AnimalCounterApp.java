
public class AnimalCounterApp {

	public static void main(String[] args) {
		// Alligator
		System.out.println("Counting alligators...\n");
		Alligator a = new Alligator();
		count(a, 3);
		
		// First sheep
		System.out.println("\nCounting sheep...\n");
		Sheep s = new Sheep("Blackie");
		count(s, 2);
		
		// Cloned sheep
		try {
			System.out.println();
			Sheep s2 = (Sheep) s.clone();
			s2.name = "Dolly";
			count(s2, 3);
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}

	}
	
	public static void count(Countable c, int maxCount) {
		c.resetCount();
		for (int i = 1; i <= maxCount; i++) {
			c.incrementCount();
			System.out.println(c.getCountString());
		}
	}

}
