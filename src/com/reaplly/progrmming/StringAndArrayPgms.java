package com.reaplly.progrmming;

import java.util.HashMap;
import java.util.Map;



public class StringAndArrayPgms {
	/**
	 * Common String problems
	 * 
	 * 1. reverse a string
	 * 	1a. reverse a string with space
	 * 	1b. reverse each word in a sentence.
	 * 	1c. count occurances of word in string.
	 * 2. check if a string is a palindrome
	 * 3. find first non-repeating character
	 * 4. count occurances of a character in a string
	 * 5. check if two strings are anagrams
	 * 6. longest substring without repeating characters
	 * 7. check if a string only contains digits
	 * 8. string compression ->  Input: "aaabbccc", Output: "a3b2c3"
	 * 9. find all permutations of string
	 * 10.find the most frequent character in a string
	 * */
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
//	public static boolean checkIfAnagram(String str1, String str2) {
//		String s1 = str1.toLowerCase();
//		String s2 = str2.toLowerCase();
//		
//		// listen, silent
//		StringBuilder sb = new StringBuilder();
//		for(char c : str1.toCharArray()) {
//			sb.append(c);
//		}
//		for(char c : str2.toCharArray()) {
//			sb.append(c);
//		}
//		for() {}
//		Map<Character, Integer> s1Map = new HashMap<>();
//		for(Map.Entry<Character, Integer> entry : s1Map.entrySet()) {
//			
//			return false;
//		}
//		return true;
//	}
	
	
	// find first 
	

	public static void main(String[] args) {
		String s = "m";
		System.out.println(checkPalindrome(s));
	}

}
