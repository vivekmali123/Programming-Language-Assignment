package com.intershala.javaapp;
import java.lang.reflect.Array;
import java.util.Arrays;
                                          //4. Arrays

public class question7 {

//Q.7. Write a function to insert an element at a specific position in the array........

		private static int[] insert(int[] a, int key, int index) {


			System.out.println("\n*** Answer for 7th question....\n");
			int[] result = new int[a.length + 1];

			for (int i = 0, j = 0; i < a.length; i++, j++) {
				if (i == index) {
					result[j] = key;
					j++;
				}
				result[j] = a[i];
			}

			return result;
		}


		public static void main(String[] args) {
			int[] a = { 1, 2, 4, 5 };                //first array....
			int key = 3;
			int index = 2;

			a = insert(a, key, index);                 //inserting new element...
			System.out.println(Arrays.toString(a));    //printing new array.....



//Q.8. Write a function to find the minimum and maximum value of an array............

			int[] nums = { 5, 7, 2, 4, 9, 6 };      //for question 8
			findMinAndMax(nums);

		}

	    public static void findMinAndMax(int[] nums){

		   System.out.println("\n*** Answer for 8th question....\n");
		   int max = nums[0];
		   int min = nums[0];

		    for (int i = 1; i < nums.length; i++) {
			    if (nums[i] > max) {        // if the current element is greater than the maximum found so far
				    max = nums[i];
			    } else if (nums[i] < min) {      // if the current element is smaller than the minimum found so far
				    min = nums[i];
			    }
		    }
		    System.out.println("The minimum array element is " + min);
		    System.out.println("The maximum array element is " + max);
		}

}





