
public class Circle extends Shape {
	// Variables
	private double radius;

	// Constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// Getters / Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Misc. Methods
	@Override
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

}
