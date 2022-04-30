package com.bridgelabz.algorithm;

import java.util.ArrayList;
/*
 * Author: Prasad
 * Find the prime numbers between 0 to 1000
 */
public class PrimeNumber {

	public static void main(String[] args) {
		int num = 0;
		//creating array list
		ArrayList list = new ArrayList<>();
		
		//Taking numbers between 0 - 1000
		for(int i = 1; i <= 1000; i++) {
			int count = 0;
			//condition for prime numbers
			for(num = i; num >= 1; num--) {
				if(i % num == 0) {
					count = count + 1;
				}
			}
			//Adding prime numbers to the list
			if(count == 2) {
				list.add(i);
			}
		}
		System.out.println("Prime numbers from 0 to 1000 are");
		System.out.print(list);
	}
}
