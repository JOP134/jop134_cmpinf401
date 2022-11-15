package jop134_lab9;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	
	// Student Constructor
	public Student(String n, String a, String p, int y, double f) {
		this.setName(n);
		this.setAddress(a);
		program = p;
		year = y;
		fee = f;
	}
	
	// Program Getter
	public String getProgram() {
		return program;
	}
	
	// Year getter
	public int getYear() {
		return year;
	}
	
	// Fee getter
	public double getFee() {
		return fee;
	}
	
	// Program Setter
	public void setProgram(String p) {
		program = p;
	}
	
	// Year setter
	public void setYear(int y) {
		year = y;
	}
	
	// Fee setter
	public void setFee(double f) {
		fee = f;
	}
	
	// Return as string
	public String toString() {
		String str = "Student\nName: " + this.getName() + "\nAddress: " + this.getAddress() + 
				"\nProgram: " + program + "\nYear: " + year + "\nFee: " + fee;
		return str;
	}
}
