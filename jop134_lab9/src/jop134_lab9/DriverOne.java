package jop134_lab9;

public class DriverOne {

	public static void main(String[] args) {
		// Circle Tester
		Circle c1 = new Circle();
		c1.setColor("Green");
		c1.setRadius(5.0);
		System.out.println(
				"Circle 1\nRadius: " + c1.getRadius() + "\nColor: " + c1.getColor() + "\nArea: " + c1.getArea() + "\n");

		// Cylinder Tester
		Cylinder cyl1 = new Cylinder();
		cyl1.setColor("Green");
		cyl1.setHeight(1.0);
		cyl1.setRadius(5.0);
		System.out.print("Cylinder 1\nRadius: " + cyl1.getRadius() + "\nColor: " + cyl1.getColor() + "\nHeight: "
				+ cyl1.getHeight() + "\nArea: " + cyl1.getArea() + "\nVolume: " + cyl1.getVolume());

	}

}
