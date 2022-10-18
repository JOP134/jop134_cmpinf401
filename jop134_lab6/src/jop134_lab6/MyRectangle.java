package jop134_lab6;

/* Josh Paulovich
 * MyRectangle Class
 * 10/16/22
 */

public class MyRectangle {
	private int width;
	private int height;
	private int startX;
	private int startY;

	// Default Constructor
	public MyRectangle() {
		width = 0;
		height = 0;
		startX = 0;
		startY = 0;
	}

	// Constructor
	public MyRectangle(int x, int y, int w, int h) {
		startX = x;
		startY = y;
		width = w;
		height = h;
	}

	// Calculate Area
	public int area() {
		return (width * height);
	}

	// Output description
	public String toString() {
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}

	// Check if coordinates are inside
	public boolean isInside(int x, int y) {
		if (x <= (startX + width) && x >= startX)
			if (y <= (startY + height) && y >= startY)
				return true;
		return false;

	}

	// Height/Width setter
	public void setSize(int w, int h) {
		width = w;
		height = h;
	}

	// Position (x, y) setter
	public void setPosition(int x, int y) {
		startX = x;
		startY = y;
	}

}