//Car class with constructor taking all the arguments and having hashCode and equals method to remove duplicate values
package com.cg.basicassignment;

public class Car implements Comparable<Car> {

	int year, price;
	String model, make;
//constructor initializing all the values
	public Car(int year, int price, String model, String make) {

		this.year = year;
		this.price = price;
		this.model = model;
		this.make = make;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", price=" + price + ", model=" + model + ", make=" + make + "]";
	}
//hashCode and equals method together use to compare
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

//use to sort the elements
	@Override
	public int compareTo(Car car) {
		int cmp = make.compareTo(car.make);
		return cmp;
	}

}
