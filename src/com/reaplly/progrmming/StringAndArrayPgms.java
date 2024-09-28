package com.reaplly.progrmming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class StringAndArrayPgms {
	/**
	 * Common String problems
	 * 0. find duplicate characters
	 * 1. reverse a string 						- done
	 * 2. check if a string is a palindrome 	- done
	 * 3. find first non-repeating character	-
	 * 4. count occurances of a character in a string
	 * 5. check if two strings are anagrams - done
	 * 6. longest substring without repeating characters
	 * 7. check if a string only contains digits
	 * 8. string compression ->  Input: "aaabbccc", Output: "a3b2c3"
	 * 9. find all permutations of string
	 * 10.find the most frequent character in a string
	 * */
	
	
	// count duplicate character
	public static char findDuplicates(String s) {
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
	
	// find first non repeating character in a string
//	public static char firstRepeatingChar(String s) {
//		for
//	}
		
	public static void main(String[] args) {
		String s1 = "abcabc";
		System.out.println(findDuplicates(s1));
	}

}
