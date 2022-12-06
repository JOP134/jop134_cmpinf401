package jop134_lab10;
/* Josh Paulovich
 * 12/5/22
 * Lab 10 - Recursion
 */

public class Recursion {

	// Print sum of all digits in a number (Task 1)
	public static int sumOfDigits(int x) {
		int sum = 0;
		int num = Math.abs(x);
		if(x == 0)
			return 0;
		sum += num %10;
		return sum + sumOfDigits(x/10);
	}

	// Print all array elements (Task 2)
	public static void printArrayElements(int a[], int index) {
		System.out.println(a[index]);
		index++;
		if (index != a.length)
			printArrayElements(a, index);
	}

	// Testing the methods
	public static void main(String args[]) {
		// Task 1 test
		System.out.println(sumOfDigits(1234));

		// Task 2 test
		int a[] = {1, 2, 3, 4};
		printArrayElements(a, 0);
	}
}
