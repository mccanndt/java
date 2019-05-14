package business;

public class Turtle extends Animal {

	public Turtle(String name) {
		super(name);
	}

	@Override
	public void speak() {
		super.speak(t -> System.out.println(t.getNameAndType() + " waves! (turtles don't have vocal cords)"));

	}

}
