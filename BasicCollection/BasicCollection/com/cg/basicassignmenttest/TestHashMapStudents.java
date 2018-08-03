//class implementing HashMap and printing value of fruit according to object 
package com.cg.basicassignmenttest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMapStudents {

	public static void main(String args[]) {
		Students stu;
		Map<Students, String> map = new HashMap<>();
		map.put(new Students("Aashish"), "mango");
		map.put(new Students("Rohit"), "water melon");
		map.put(new Students("Himanshu"), "Banana");

		Students std = new Students("Aashish");
		System.out.println(map.get(std)); // printing value of fruit as per object
		Set<Entry<Students, String>> set = map.entrySet();
		set.stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));
		Set<Students> keyset = map.keySet();
		System.out.println("Key set values are: " + keyset);
	}
}
