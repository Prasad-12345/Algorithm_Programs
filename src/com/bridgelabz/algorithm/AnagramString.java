package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Author: Prasad
 * Program to check the two strings are anagram or not
 */
public class AnagramString {
	

	public static void main(String[] args) {
		//input string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.next();
		System.out.println("Enter second string");
		String str2 = sc.next();

		//removing all spaces from string and converting it to lower case
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		
		if(isAnagram(str1, str2)) {
			System.out.println(str1 + " " + str2 + " " + "are anagram strings");
		}
		else {
			System.out.println(str1 + " " + str2 + " " + "are not anagram string");
		}
	}

	/*
	 * This method check the two entered strings are anagram or not
	 */
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		else {
			//converting string to character array
			char[] str1Array = str1.toCharArray();
			char[] str2Array = str2.toCharArray();
			
			//sorting array
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			
			//check to arrays are equal or not
			return Arrays.equals(str1Array, str2Array);
		}
	}
}
