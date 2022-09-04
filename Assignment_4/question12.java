package Assignment_4;

import java.util.Scanner;

public class question12 {


//Q.12. Write a method to remove duplicate elements from an array......

	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];

		for (int i = 0; i < j; i++) {      // Changing original array
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {

		System.out.println("*** Answer for 12th question....\n");
		int arr[] = {10, 20, 20, 30, 30, 40, 50, 50};
		int length = arr.length;
		length = removeDuplicateElements(arr, length);

		for (int i = 0; i < length; i++) {     //printing array elements
			System.out.print(arr[i] + " ");
		}



//Q.13. Write a method to find the second largest number in an array.....
//Q.14. Write a method to find the second largest number in an array.....   Same answer.

		int a[] = {1, 2, 5, 6, 3, 2};
		System.out.println("\n\n*** Answer for 13th and 14th question....\n\nSecond Largest number from array is: " + getSecondLargest(a, 6));
	}

	public static int getSecondLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];
	}
}




