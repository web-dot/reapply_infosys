package com.reaplly.progrmming;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class JavaTest {

	public static void main(String[] args) {
		Map<String, Integer> ids = new TreeMap<>();
		
		ids.put("Carhan", 101);
		ids.put("Banesh", 102);
		ids.put("Aavjot", 104);
		
		for(String names : ids.keySet()) {
			System.out.println(names);
		}
		
		System.out.println();
		
		Set<String> set = new TreeSet<>();
		set.add("Geeks");
		set.add("For");
		set.add("Geeks");
		set.add("GeeksForGeeks");
		
		
		for(String temp : set) {
			System.out.println(temp);
		}
	}

}
