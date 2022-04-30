package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Author: Prasad
 * Binary search the word from word list
 */
public class BinarySearch {

	public static void main(String[] args) {
		//string array
		String[] wordList = {"apple", "mango", "banana", "orange", "pineapple"};
		//sorting wordList
		Arrays.sort(wordList);
		System.out.println("List of words:");
		//printing word list
		System.out.println(Arrays.toString(wordList));
		
		//input the word you want to search
		System.out.println("Enter the word you wanr to search");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.next();
		
		//calling binary search
		int result = binarySearch(wordList, searchName);
		if(result == -1) {
			System.out.println("word is not present in the list");
		}
		else {
			System.out.println("word is found at index" + result);
		}
	}

	/*
	 * This method is to binary search the word from wordlist
	 */
	public static int binarySearch(String[] wordList, String searchName) {
		int start = 0, length = wordList.length - 1;
		while(start <= length) {
			int middle = start + (length - start) / 2;
			int result = searchName.compareToIgnoreCase(wordList[middle]);
			if(result == 0) {
				return middle;
			}
			else if(result > 0){
				start = middle + 1;
			}
			else {
				length = middle - 1;
			}
		}
		return -1;
	}
}
