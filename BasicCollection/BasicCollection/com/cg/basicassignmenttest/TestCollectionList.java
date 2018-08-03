//class implementing ArrayList
package com.cg.basicassignmenttest;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionList {
	public static void main(String args[]) {
		Laptop laptop;
		List<Laptop> laptopList = new ArrayList<Laptop>();
		laptopList.add(new Laptop("Dell", "5310", "windows", "i7"));
		laptopList.add(new Laptop("hp", "2342", "windows", "i5"));
		laptopList.add(new Laptop("Apple", "23", "Mac", "i23"));
		laptopList.add(new Laptop("Apple", "23", "Mac", "i23"));

		for (Laptop lapi : laptopList) {
			System.out.println(lapi);
		}

		Car car;
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car(2011, 300503, "amaze", "honda"));
		carList.add(new Car(2013, 500503, "j7", "bmw"));
		carList.add(new Car(2015, 700503, "swift", "maruti"));
		carList.add(new Car(2015, 700503, "swift", "maruti"));

		for (Car carr : carList) {
			System.out.println(carr);
		}

		CellPhone cellphone;
		List<CellPhone> cellList = new ArrayList<CellPhone>();
		cellList.add(new CellPhone("Motorola", "x", "Bad mobile", "android", 12000));
		cellList.add(new CellPhone("Samsung", "j5", "very bad mobile", "android", 12231));
		cellList.add(new CellPhone("Oneplus", "6", "best phone", "android", 35000));
		cellList.add(new CellPhone("Samsung", "j5", "very bad mobile", "android", 12231));
		for (CellPhone carr : cellList) {
			System.out.println(carr);
		}

		School school;
		List<School> schoolList = new ArrayList<School>();
		schoolList.add(new School("ams", "chandigarh", "chandigarh", 1));
		schoolList.add(new School("dps", "mohali", "punjab", 3));
		schoolList.add(new School("ami", "saharanpur", "sre", 1));
		schoolList.add(new School("dps", "mohali", "punjab", 3));

		for (School sch : schoolList) {
			System.out.println(sch);
		}

	}
}
