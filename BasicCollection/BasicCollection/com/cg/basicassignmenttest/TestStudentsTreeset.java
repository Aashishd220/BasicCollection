//implementing TreeSet to sort
package com.cg.basicassignmenttest;

import java.util.Set;
import java.util.TreeSet;

public class TestStudentsTreeset {
	public static void main(String args[]) {
		Students student;
		Set<Students> studentset = new TreeSet<Students>();
		studentset.add(new Students("Aashish"));
		studentset.add(new Students("rohit"));
		studentset.add(new Students("himanshu"));

		for (Students stu : studentset) {
			System.out.println(stu);
		}

	}
}
