
public class Square extends Shape {
	// Variables
	private double width;

	// Constructor
	public Square(double width) {
		this.width = width;
	}

	// Getters / Setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	// Misc. Methods
	@Override
	public double getArea() {
		return Math.pow(width, 2);
	}

}
