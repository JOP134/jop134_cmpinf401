package jop134_lab7;
import javax.swing.JOptionPane;

public class ArrayTester {

	public static void main(String[] args) {
		// Prompt and assign input
		int length = Integer.valueOf(JOptionPane.showInputDialog("Enter how many numbers to generate: "));
		double[] array = new double[length];
		
		// Assign random values to array 1.00-10.00
		for(int i = 0; i < array.length; i++) {
			array[i] = Math.round(Math.random()*1000) / 100.0;
		}
		
		// Output methods
		System.out.println("Array Max: " + MyArray.max(array));
		System.out.println("Array Min: " + MyArray.min(array));
		System.out.println("Array Sum: " + MyArray.sum(array));
		System.out.println("Array Average: " + MyArray.ave(array));
	}

}
