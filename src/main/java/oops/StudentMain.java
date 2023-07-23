package oops;

public class StudentMain {

	public static void main(String[] args) {
		// 1st Approach:By using Variable
		// Student s = new Student();
		/*
		 * s.sid = 101; s.sname = "Rohit"; s.grade = 'A';
		 */

		// 2nd Approach:By using method
		/*
		 * s.setData(102, "Rohim", 'B');
		 */
		// 3rd Approach: By using Contructor
		Student s = new Student(103, "Rahul", 'B');
		s.show();
	}

}
