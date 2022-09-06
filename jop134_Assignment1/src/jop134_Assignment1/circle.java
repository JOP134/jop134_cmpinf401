package jop134_Assignment1;
import javax.swing.JOptionPane;
public class circle {

	public static void main(String[] args) {
		//Prompting and converting
		String strRadius = JOptionPane.showInputDialog("Enter the radius: ");
		double radius = Double.valueOf(strRadius);
		
		//Calculating and rounding
		double area = radius * radius * Math.PI;
		double perimeter = radius * 2 * Math.PI;
		area = (Math.round(area * 100.0))/100.0;
		perimeter = (Math.round(perimeter * 100.0))/100.0;
		
		//Outputting
		JOptionPane.showMessageDialog(null, "A circle with the radius of " + radius +
				" has an area of " + area + " and a perimeter of " + perimeter);
		
	}
}
