package com.bridgelabz.algorithm;

import java.util.Scanner;
/*
 * Author: Prasad
 * Write a program to do merge sort of  of list of strings
 */
public class MergeSort {
	//variables
	String[] array;
	String[] tempMergeArray;
	int length;
	
	/*
	 * this method assign variables for temporary
	 */
	public void sort(String[] inputArr) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArray = new String[length];
		divideArray(0, length - 1);	
	}
	
	/*
	 * This method will divide array till each element become individual
	 */
	public void divideArray(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middleIndex = lowerIndex + (higherIndex - lowerIndex) / 2;
			divideArray(lowerIndex, middleIndex);
			divideArray(middleIndex + 1, higherIndex);
			mergeArray(lowerIndex, middleIndex, higherIndex);
		}
	}
	
	/*
	 * This method merge the element in sorted order
	 */
	public void mergeArray(int lowerIndex, int middleIndex, int higherIndex) {
		//storing array in tempmergeArray
		for(int i = lowerIndex; i <= higherIndex; i++) {
			tempMergeArray[i] = array[i];
		}
		
		//creating sorted array
		int i = lowerIndex, j = middleIndex + 1, k = lowerIndex;
		while(i <= middleIndex && j <= higherIndex) {
			if(tempMergeArray[i].compareToIgnoreCase(tempMergeArray[j]) <= 0) {
				array[k] = tempMergeArray[i];
				i++;
			}
			else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}
		
		//storing tempMergeArray in array
		while(i <= middleIndex) {
			array[k] = tempMergeArray[i];
			k++;
			i++;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the length of an array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//input array
		String[] inputArr = new String[n];;
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the string");
			inputArr[i] = sc.next();
		}
		
		//object
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(inputArr);
		
		//printing array
		for(String i : inputArr) {
			System.out.print(i + " ");
		}
	}

}
