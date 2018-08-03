//Students class with constructor taking all the arguments and having hashCode and equals method to remove duplicate values

package com.cg.basicassignment;

public class Students implements Comparable<Students> {
	private String name;

	// constructor initializing all the values
	public Students(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + "]";
	}

	public int compareTo(Students stu) {
		// TODO Auto-generated method stub
		int cmp = name.compareTo(stu.name);

		return cmp;
	}

	// hashCode and equals method together use to compare
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Students other = (Students) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
