package Assignment_14;

// Q.6. Write a program to create your own exception

public class q6 {

	public static void validate(int age) {

		if (age < 18) {

			//throw Arithmetic exception if not eligible to vote
			throw new ArithmeticException(" \nSorry! Person is not eligible to vote. This is my own exception\n");

		} else {

			System.out.println("Person is eligible to vote!!");

		}
	}

	public static void main(String args[]) {

		//calling the function
		validate(13);

	}
}


