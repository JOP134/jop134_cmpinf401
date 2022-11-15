package jop134_lab9;

abstract class Person {
	private String name;
	private String address = "String";
	
	// Name getter
	public String getName() {
		return name;
	}
	
	// Address getter
	public String getAddress() {
		return address;
	}
	
	// Name setter
	public void setName(String n) {
		name = n;
	}
	
	// Address setter
	public void setAddress(String a) {
		address = a;
	}
}
