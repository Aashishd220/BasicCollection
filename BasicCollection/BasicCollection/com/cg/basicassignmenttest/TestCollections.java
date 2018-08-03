//class implementing LinkedHashSet
package com.cg.basicassignmenttest;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import java.util.Set;

public class TestCollections {

	public static void main(String args[]) {
		Laptop laptop;
		Set<Laptop> laptopset = new LinkedHashSet<Laptop>();
		laptopset.add(new Laptop("Dell", "5310", "windows", "i7"));
		laptopset.add(new Laptop("hp", "2342", "windows", "i5"));
		laptopset.add(new Laptop("Apple", "23", "Mac", "i23"));
		laptopset.add(new Laptop("Apple", "23", "Mac", "i23"));

		for (Laptop lapi : laptopset) {
			System.out.println(lapi);
		}

		Car car;
		Set<Car> carset = new LinkedHashSet<Car>();
		carset.add(new Car(2011, 300503, "amaze", "honda"));
		carset.add(new Car(2013, 500503, "j7", "bmw"));
		carset.add(new Car(2015, 700503, "swift", "maruti"));
		carset.add(new Car(2015, 700503, "swift", "maruti"));

		for (Car carr : carset) {
			System.out.println(carr);
		}

		CellPhone cellphone;
		Set<CellPhone> cellset = new LinkedHashSet<CellPhone>();
		cellset.add(new CellPhone("Motorola", "x", "Bad mobile", "android", 12000));
		cellset.add(new CellPhone("Samsung", "j5", "very bad mobile", "android", 12231));
		cellset.add(new CellPhone("Oneplus", "6", "best phone", "android", 35000));
		cellset.add(new CellPhone("Samsung", "j5", "very bad mobile", "android", 12231));
		for (CellPhone carr : cellset) {
			System.out.println(carr);
		}

		School school;
		Set<School> schoolset = new LinkedHashSet<School>();
		schoolset.add(new School("ams", "chandigarh", "chandigarh", 1));
		schoolset.add(new School("dps", "mohali", "punjab", 3));
		schoolset.add(new School("ami", "saharanpur", "sre", 1));
		schoolset.add(new School("dps", "mohali", "punjab", 3));

		for (School sch : schoolset) {
			System.out.println(sch);
		}

	}
}
