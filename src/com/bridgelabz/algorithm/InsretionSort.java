package com.bridgelabz.algorithm;

import java.util.Scanner;
/*
 * Author : Prasad
 * Print the sorted string array using insertion sort
 */
public class InsretionSort {
	/*
	 * this method sort the array using insertion sort
	 */
	public void insertionSort(String arr[]) {
		String temp = " ";
//		int j;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i].compareToIgnoreCase(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}				
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the length of an array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//input array
		String[] arr = new String[n];;
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the string");
			arr[i] = sc.next();
		}
		//object
		InsretionSort inserionSort = new InsretionSort();
		inserionSort.insertionSort(arr);
		//Printing array
		for(int i = 0; i < n; i++) {
			System.out.print("Sorted array: " + arr[i] + " ");
		}
	}
}
