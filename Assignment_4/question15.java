package Assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class question15 {

//Q.15. Write a method to find number of even number and odd numbers in an array....

    public static void method(){
	    int Size, i;
	    int evenCount = 0, oddCount = 0;
	    System.out.println("Answer for 15th question....\n");
	    Scanner sc = new Scanner(System.in);     // take input from user.
	    System.out.println(" Please Enter Number of elements in an array : ");
	    Size = sc.nextInt();

	    int[] array = new int[Size];

	    System.out.print(" Please Enter " + Size + " elements of an Array  : \n");
	    for (i = 0; i < Size; i++) {
		    array[i] = sc.nextInt();
	    }

	    for (i = 0; i < Size; i++) {
		    if (array[i] % 2 == 0) {
			    evenCount++;
		    } else {
			    oddCount++;
		    }
	    }
	    System.out.println("Total Number of Even Numbers in this Array= " + evenCount);
	    System.out.println("Total Number of Odd  Numbers in this Array= " + oddCount);
    }

	public static void main(String[] args) {
      question15 a = new question15();
      a.method();


//Q.16. Write a function to get the difference of largest and smallest value.....

		System.out.println("\nAnswer for 16th question....\n");
		int[] arraynums = {5, 7, 2, 4, 9};
		System.out.println("Original Array: "+ Arrays.toString(arraynums));
		int max_val = arraynums[0];
		int min = arraynums[0];
		for(int i = 1; i < arraynums.length; i++) {
			if(arraynums[i] > max_val) {
				max_val = arraynums[i];
			}else if(arraynums[i] < min){
				min = arraynums[i];
		}
	  }
		System.out.println("Difference between the largest and smallest values of the said array: "+(max_val-min));

    }

}


