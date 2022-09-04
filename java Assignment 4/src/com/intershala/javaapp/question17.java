package com.intershala.javaapp;

import java.util.Arrays;

public class question17 {

//Q.17. Write a method to verify if the array contains two specified elements(12,23)......

	private static void checknum1(int[] arr, int toCheckValue1) {    //Check first number 12
		boolean test = false;
		for (int element : arr) {
			if (element == toCheckValue1) {
				test = true;
				break;
			}
		}
		System.out.println("Is " + toCheckValue1 + " present in the array: " + test);
	}

	private static void checknum2(int[] arr, int toCheckValue2) {    //Check first number 23
		boolean test = false;
		for (int element : arr) {
			if (element == toCheckValue2) {
				test = true;
				break;
			}
		}
		System.out.println("Is " + toCheckValue2 + " present in the array: " + test);
	}

	public static void main(String[] args) {

		System.out.println("Answer for 17th question....\n");
		int arr[] = { 5, 1, 1, 9, 12, 23, 6, 10 };

		int toCheckValue1 = 12;
		int toCheckValue2 = 23;

		System.out.println("Array: " + Arrays.toString(arr));
		checknum1(arr, toCheckValue1);

		System.out.println("Array: " + Arrays.toString(arr));
		checknum2(arr, toCheckValue2);

	}

}
