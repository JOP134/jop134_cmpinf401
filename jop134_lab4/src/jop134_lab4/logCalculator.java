package jop134_lab4;

import javax.swing.JOptionPane;

public class logCalculator {

	public static void main(String[] args) {
		// Prompt for input and convert/store it
		int intNum = -1;
		int intBase = 0;
		while (intNum < 0) {
			String strNum = JOptionPane.showInputDialog("Enter a positive integer value for the log: ");
			intNum = Integer.valueOf(strNum);
		}
		while (intBase < 1) {
			String strBase = JOptionPane.showInputDialog("Enter a positive integer value >0 for the base: ");
			intBase = Integer.valueOf(strBase);
		}

		// Calculate the log
		int intQuotient = intNum;
		int intCount = 0;
		while (intQuotient >= intBase) {
			intQuotient = Math.floorDiv(intQuotient, intBase);
			intCount++;
		}

		// Output the calculations
		System.out.print("log" + intBase + "(" + intNum + ") = " + intCount);
	}

}
