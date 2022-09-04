package com.intershala.javaapp;

import java.util.Arrays;

public class question9 {

//Q.9. Write a function to reverse an array of integer values......

	static void reverse(int a[], int n) {
		int[] b = new int[n];
		int j = n;
		System.out.println("Answer for 9th question....\n");
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}
		System.out.println("Reversed array is: ");        // printing the reversed array
		for (int k = 0; k < n; k++) {
			System.out.println(b[k]);
		}


//Q.10. Write a function to find the duplicate values of an array......

		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		System.out.println("\nAnswer for 10th question....\n");
		for (int i = 0; i < my_array.length-1; i++) {
			for (int z = i+1; z < my_array.length; z++) {
				if ((my_array[i] == my_array[z]) && (i != z)) {
					System.out.println("Duplicate Element : "+my_array[z]);
				}
			}
		}

//Q.11. Write a program to find the common values between two arrays......

		int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
		int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
		System.out.println("\nAnswer for 11th question....\n");
		System.out.println("Array1 : "+ Arrays.toString(array1));
		System.out.println("Array2 : "+ Arrays.toString(array2));


		for (int i = 0; i < array1.length; i++) {
			for (int c = 0; c < array2.length; c++) {
				if(array1[i] == (array2[c])) {
					System.out.println("Common element is : "+(array1[i]));
				}
			}
		}

	}

	public static void main(String[] args) {
		int [] arr = {10, 20, 30, 40, 50};      //Answer for 9th question..
		reverse(arr, arr.length);
	}

}
