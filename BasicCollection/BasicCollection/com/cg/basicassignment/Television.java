//Television class with constructor taking all the arguments and having hashCode and equals method to remove duplicate values

package com.cg.basicassignment;

public class Television {

	String company, type, three_d_enabled;
	int price;

	// constructor initializing all the values
	public Television(String company, String type, String three_d_enabled, int price) {
		super();
		this.company = company;
		this.type = type;
		this.three_d_enabled = three_d_enabled;
		this.price = price;
	}

	// hashCode and equals method together use to compare
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", three_d_enabled=" + three_d_enabled + ", price="
				+ price + "]";
	}

}
