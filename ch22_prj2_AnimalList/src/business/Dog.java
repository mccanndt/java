package business;

import java.util.Random;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		Random r = new Random();
		if (r.nextInt(2) == 0) {
			super.speak(d -> System.out.println(d.getNameAndType() + " says 'Woof'"));
		} else {
			super.speak(d -> System.out.println(d.getNameAndType() + " says 'Bark'"));
		}

	}

}
