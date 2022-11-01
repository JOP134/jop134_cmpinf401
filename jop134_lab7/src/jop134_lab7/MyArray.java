package jop134_lab7;

public class MyArray {

	// Method for returning max
	public static double max(double[] data) {
		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}

		return max;
	}

	// Method for returning minimum
	public static double min(double[] data) {
		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}

	// Method for returning sum (rounded to 2 dec)
	public static double sum(double[] data) {
		double sum = data[0];
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return Math.round(sum * 100) / 100.0;
	}

	// Method for returning average (rounded to 2 dec)
	public static double ave(double[] data) {
		return Math.round((sum(data) / data.length) * 100) / 100.0;
	}
}
