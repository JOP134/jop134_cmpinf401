package jop134_lab9;

public class Circle {
	private double radius;
	private String color;

	public Circle() {

	}

	public Circle(double dbl) {
		radius = dbl;
	}

	public Circle(double dbl, String s) {
		radius = dbl;
		color = s;
	}

	// Radius getter
	public double getRadius() {
		return radius;
	}

	// Color getter
	public String getColor() {
		return color;
	}

	// Radius setter
	public void setRadius(double dbl) {
		radius = dbl;
	}

	// Color Setter
	public void setColor(String s) {
		color = s;
	}

	// Area getter
	public double getArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return Math.round(area * 100) / 100.0; // round to 2 decimals
	}
}
