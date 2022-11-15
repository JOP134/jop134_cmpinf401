package jop134_lab9;

public class DriverTwo {

	public static void main(String[] args) {
		// Staff Tester
		Staff t1 = new Staff("Teacher1", "123 Street", 100000);
		t1.setSchool("Pitt");
		System.out.println(t1.toString());

		// Student Tester
		Student s1 = new Student("Josh", "123 Street", "Computer Science", 2022, 30000.0);
		System.out.println(s1.toString());
	}

}
