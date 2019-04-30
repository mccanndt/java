
public class Rectangle extends Square {
	// Variables
	private double height;

	// Constructor
	public Rectangle(double width, double height) {
		super(width);
		this.height = height;
	}

	// Getters / Setters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Misc. Methods
	@Override
	public double getArea() {
		return getWidth() * height;
	}
}
