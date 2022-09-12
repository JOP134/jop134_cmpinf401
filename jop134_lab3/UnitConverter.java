package jop134_lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		//Prompt for input
		String input = JOptionPane.showInputDialog("Enter measurement and unit (in, cm, yd, m, oz, gm, kg, lb): ");

		//Process and store input
		double measurement = Double.parseDouble(input.substring(0, input.indexOf(' ')));
		String unit = input.substring(input.indexOf(' ') + 1);

		//Convert measurement
		double conversion = 0;
		String conversionUnit = "";
		if (unit.equals("cm")) {
			conversion = measurement * 0.3937;
			conversionUnit = "in";
		}
		else if (unit.equals("in")) {
			conversion = measurement * 2.54;
			conversionUnit = "cm";
		}
		else if (unit.equals("yd")) {
			conversion = measurement * 0.9144;
			conversionUnit = "m";
		}
		else if (unit.equals("m")) {
			conversion = measurement * 1.0936;
			conversionUnit = "yd";
		}
		else if (unit.equals("oz")) {
			conversion = measurement * 28.3495;
			conversionUnit = "gm";
		}
		else if (unit.equals("gm")) {
			conversion = measurement * 0.03527;
			conversionUnit = "oz";
		}
		else if (unit.equals("lb")) {
			conversion = measurement * 0.4536;
			conversionUnit = "kg";
		}
		else if (unit.equals("kg")) {
			conversion = measurement * 2.2046;
			conversionUnit = "lb";
		}
		
		//Output
		System.out.print(input + " = " + conversion + " " + conversionUnit);
	}

}
