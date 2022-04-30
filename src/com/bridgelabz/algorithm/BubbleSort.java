package com.bridgelabz.algorithm;

import java.util.Scanner;
/*
 * Author: Prasad
 * Reads in integers and prints them in sorted order using bubble sort
 */
public class BubbleSort {
	/*
	 * This method will sort the array using bubble sort
	 */
	public void bubbleSort(int[] arr) {
		int temp = 0;
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the length of an array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//input array
		int[] arr = new int[n];;
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the value");
			arr[i] = sc.nextInt();
		}
		//object
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(arr);
		
		//printing sorted array
		for(int i = 0; i < n; i++){
			System.out.print("Sorted array is: " + arr[i] + " ");
		}
	}
}
