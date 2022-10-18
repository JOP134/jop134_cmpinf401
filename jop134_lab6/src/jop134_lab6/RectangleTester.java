package jop134_lab6;

/* Josh Paulovich
 * Rectangle Tester Class
 * 10/17/22
 */
public class RectangleTester {

	public static void main(String[] args) {
		// Rectangle examples
		MyRectangle rectangle = new MyRectangle(100, 50, 80, 20);
		MyRectangle rectangle2 = new MyRectangle();

		// Outputting rectangle values
		System.out.println(rectangle.toString());
		System.out.println(rectangle.area());
		System.out.println(rectangle.isInside(105, 69));

	}

}
