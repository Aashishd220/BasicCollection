//School class with constructor taking all the arguments and having hashCode and equals method to remove duplicate values
package com.cg.basicassignment;

public class School {
	String name, city, school_district;
	int great_school_ranking;

//constructor initializing all the values
	public School(String name, String city, String school_district, int great_school_ranking) {
		super();
		this.name = name;
		this.city = city;
		this.school_district = school_district;
		this.great_school_ranking = great_school_ranking;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", school_district=" + school_district
				+ ", great_school_ranking=" + great_school_ranking + "]";
	}

//hashCode and equals method together use to compare
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((school_district == null) ? 0 : school_district.hashCode());
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
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (school_district == null) {
			if (other.school_district != null)
				return false;
		} else if (!school_district.equals(other.school_district))
			return false;
		return true;
	}

}
