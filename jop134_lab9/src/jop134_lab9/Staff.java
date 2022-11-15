package jop134_lab9;

public class Staff extends Person {
	private double pay;
	private String school;
	
	// Staff constructor
	public Staff(String n, String a, double p) {
		this.setName(n);
		this.setAddress(a);
		pay = p;
	}
	
	// School Getter
	public String getSchool() {
		return school;
	}
	
	// Pay Getter
	public double getPay() {
		return pay;
	}
	
	// School Setter
	public void setSchool(String s) {
		school = s;
	}
	
	// Pay Setter
	public void setPay(double p) {
		pay = p;
	}
	
	// Return as string
	public String toString() {
		String str = "Staff\nName: " + this.getName() + "\nAddress: " + this.getAddress() + 
				"\nSchool: " + school + "\nPay: " + pay + "\n";
		return str;
	}
}
