//Laptop class with constructor taking all the arguments and having hashCode and equals method to remove duplicate values
package com.cg.basicassignment;

public class Laptop {

	String company, model, operating_system, processor;

	// constructor initializing all the values
	public Laptop(String company, String model, String operating_system, String processor) {

		this.company = company;
		this.model = model;
		this.operating_system = operating_system;
		this.processor = processor;
	}

	// hashCode and equals method together use to compare
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
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
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operating_system=" + operating_system
				+ ", processor=" + processor + "]";
	}

}
