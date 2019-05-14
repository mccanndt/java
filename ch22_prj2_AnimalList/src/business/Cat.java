package business;

import java.util.Random;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void speak() {
		Random r = new Random();
		if (r.nextInt(2) == 0) {
			super.speak(c -> System.out.println(c.getNameAndType() + " says 'Meow'"));
		} else {
			super.speak(c -> System.out.println(c.getNameAndType() + " says 'Hiss'"));
		}
	}

}
