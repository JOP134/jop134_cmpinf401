package jop134_lab9;

public class Cylinder extends Circle {
	private double height;

	// Cylinder Constructors
	public Cylinder() {
		super();

	}

	public Cylinder(double r, double h) {
		super(r);
		height = h;
	}

	public Cylinder(double r, double h, String c) {
		super(r, c);
		height = h;
	}

	// Cylinder height getter
	public double getHeight() {
		return height;
	}

	// Cylinder height setter
	public void setHeight(double h) {
		height = h;
	}

	// Cylinder volume getter
	public double getVolume() {
		double r = this.getRadius();
		return Math.round(Math.PI * Math.pow(r, 2) * height * 100) / 100.0; // round to 2 decimals
	}
}
