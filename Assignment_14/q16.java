package Assignment_14;

// Q.16. Write a program to generate NumberFormatException

import java.util.Scanner;

public class q16 {

	public static void main(String[] arg)
	{

		int number;
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Enter any valid Integer: ");

				// Parsing user input to integer
				// using the parseInt() method

			number = Integer.parseInt(sc.next());

				// Number can be valid or invalid

				// If number is valid, print and display
				// the message and number

			System.out.println("You entered: " + number);

				// Get off from this loop
             break;
		}

		// if user input is invalid it will show NumberFormatException
	}
}
