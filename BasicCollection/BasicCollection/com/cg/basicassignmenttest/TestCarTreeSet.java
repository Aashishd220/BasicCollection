//class with main function and using TreeSet to sort the objects
package com.cg.basicassignmenttest;

import java.util.Set;
import java.util.TreeSet;

public class TestCarTreeSet {

	public static void main(String args[]) {
		Car car;
		Set<Car> carset = new TreeSet<Car>(); // tree set creation which is used to sort

		carset.add(new Car(2011, 300503, "amaze", "honda"));
		carset.add(new Car(2012, 300523, "amaze", "honda"));
		carset.add(new Car(2013, 500503, "j7", "bmw"));
		carset.add(new Car(2015, 700503, "swift", "maruti"));

//for each loop to print 
		for (Car stu : carset) {
			System.out.println(stu);
		}
	}
}
