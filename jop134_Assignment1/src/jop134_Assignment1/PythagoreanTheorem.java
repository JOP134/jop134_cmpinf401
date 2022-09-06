package jop134_Assignment1;
import javax.swing.JOptionPane;
public class PythagoreanTheorem {

	public static void main(String[] args) {
		//Prompting
		String sideOne = JOptionPane.showInputDialog("Enter the first side's length:");
		String sideTwo = JOptionPane.showInputDialog("Enter the second side's length:");

		//Converting
		double side1 = Double.valueOf(sideOne);
		double side2 = Double.valueOf(sideTwo);
		
		//Calculating and rounding
		double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2,  2));
		hypotenuse = Math.round(hypotenuse * 100.0);
		hypotenuse = hypotenuse / 100.0;
		
		//Outputting
		JOptionPane.showMessageDialog(null, "The hypotenuse is " + hypotenuse);
		
	}

}
