package com.reaplly.progrmming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class StringAndArrayPgms {
	/**
	 * Common String problems
	 * 
	 * - *reverse a string 						- done	[2 pointer]
	 * - *check if two strings are anagrams 	- done	[sort, compare]
	 * - *find all occurances of substring
	 * - *sort string of chars 
	 * - *count unique chars in a string
	 * - find first duplicate character			- done 	[map]
	 * - count occurances/duplicate chars		- done	[map]
	 * - check if a string is a palindrome 		- done	[2 pointer]
	 * - find first non-repeating character		- done 	[LinkedHasMmap]
	 * - longest substring without repeating chars	
	 * - find the most frequent character in a string
	 * */
	
	
	// find first duplicate character
	public static char findFirstDuplicate(String s) {
		Map<Character, Integer> cmap = new HashMap<>();
		for(char c : s.toCharArray()) {
			if(cmap.containsKey(c)) {
				return c;
			}else {
				cmap.put(c, 1);
			}
		}
		return Character.MIN_VALUE;
	}
	
	// find duplicate chars
	public static List<Character> findDuplicateChars(String s){
		Map<Character, Integer> cmap = new HashMap<>();
		for(char c : s.toCharArray()) {
			if(cmap.containsKey(c)) {
				cmap.put(c, cmap.get(c) + 1);
			}else {
				cmap.put(c, 1);
			}
		}
		List<Character> list = new ArrayList<>();
		for(Map.Entry<Character, Integer> entry: cmap.entrySet()) {
			if(entry.getValue() > 1) {
				list.add(entry.getKey());
			}
		}
		return list;
	} 
	
	//reverse a string
	public static String reverseString1(String str) {
		char[] charArray = str.toCharArray();
		int p1 = 0;
		int p2 = charArray.length - 1;
		while(p1 <= p2) {
			char temp = charArray[p1];
			charArray[p1] = charArray[p2];
			charArray[p2] = temp;
			p1++;
			p2--;
		}
		return new String(charArray);
	}
	
	public static String reverseString2(String str) {
		char[] carr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=carr.length-1; i>=0; i--) {
			sb.append(carr[i]);
		}
		return sb.toString();
	}
	
	
	// check id a string is a palindrome
	public static boolean checkPalindrome(String str) {
		int p1 = 0;
		int p2 = str.length()-1;
		while(p1<=p2) {
			if(str.charAt(p1) != str.charAt(p2)) {
				return false;
			}
			p1++;
			p2--;
		}
		return true;
	}
	
		// check if two strings are anagrams
		public static boolean checkIfAnagram(String s1, String s2) {
			
			if(s1 == null || s2 == null) { return false;}
			if(s1.length() != s2.length()) { return false;}
			
			String trimS1 = s1.replace(" ", "");
			String trimS2 = s2.replace(" ", "");
			
			String caseS1 = trimS1.toLowerCase();
			String caseS2 = trimS2.toLowerCase();
			
			char[] c1 = caseS1.toCharArray();
			char[] c2 = caseS2.toCharArray();
			
			char[] r1 = sortCharArr(c1);
			char[] r2 = sortCharArr(c2);
			
			String t1 = new String(r1).trim();
			String t2 = new String(r2).trim();
			
			System.out.println(t1 + " " + t2);
			return t1.equals(t2);
		}
		
		public static char[] sortCharArr(char[] carr) {
			for(int i=0; i<carr.length; i++) {
				char temp = carr[i];
				int j = i - 1;
				while(j >=0 && carr[j] > temp) {
					carr[j+1] = carr[j];
					j--;
				}
				carr[j+1] = temp;
			}
			return carr;
		}
	
	// find first non repeating character in a string // swiss
	public static char firstNonRepeatedChar(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char c : s.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}else {
				map.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return Character.MIN_VALUE;
	}
	
	
	
	/**
	 * Array problems
	 * 
	 * - Reverse an array of integers.
	 * - find the second largest element in array
	 * - Rotate array to right by k steps
	 * - Remove duplicates from sorted array
	 * - binary search
	 * - swap two arrays
	 * - Reverse a linked list
	 * - Detect cycle in linked list
	 * - Merge sorted linked list
	 * - Implement stack queue using array
	 * - check if parenthesis in string are balanced
	 * */
	
	// Reverse an array of integers.
	public static int[] reverseArray(int[] nums) {
		if(nums.length == 0 || nums.length == 1) {
			return nums;
		}
		int p1 = 0;
		int p2 = nums.length-1;
		while(p1<=p2) {
			int temp = nums[p1];
			nums[p1] = nums[p2];
			nums[p2] = temp;
			p1++;
			p2--;
		}
		return nums;
	}
	
	public static int secondLargest(int[] nums) {
		if(nums.length == 1) {
			return nums[0];
		}
		if(nums.length == 0) {
			return -1;
		}
		Set<Integer> set = new TreeSet<>();
		for(int i : nums) {
			set.add(i);
		}
		int[] arr = new int[set.size()];
		int k = 0;
		for(Integer i : set) {
			arr[k] = i;
			k++;
		}
		
		return arr[arr.length-2];
	}
	
	
	/**
	 * Math problems
	 * 
	 * - hcf, lcm
	 * - sum of prime numbers between 1 and N
	 * 
	 * */
	
	
	
		
	public static void main(String[] args) {
		int[] nums = {};
		System.out.println(secondLargest(nums));
	}

}
