package com.cg.basicassignmenttest;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestStudents {

	public static void main(String args[]) {
		Students student;
		Set<Students> studentset = new LinkedHashSet<Students>();
		studentset.add(new Students("Aashish"));
		studentset.add(new Students("Rohit"));
		studentset.add(new Students("Himanshu"));

		for (Students stu : studentset) {
			System.out.println(stu);
		}
	}
}
