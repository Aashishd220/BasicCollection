//CellPhone class with constructor taking all the arguments and having hashCode and equals method to remove duplicate values
package com.cg.basicassignment;

public class CellPhone {
	String company, model, description, operating_system;
	int price;

//constructor initializing all the values
	public CellPhone(String company, String model, String description, String operating_system, int price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operating_system = operating_system;
		this.price = price;
	}

	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operating_system=" + operating_system + ", price=" + price + "]";
	}

//hashCode and equals method together use to compare
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((operating_system == null) ? 0 : operating_system.hashCode());
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
		CellPhone other = (CellPhone) obj;
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
		if (operating_system == null) {
			if (other.operating_system != null)
				return false;
		} else if (!operating_system.equals(other.operating_system))
			return false;
		return true;
	}

}
