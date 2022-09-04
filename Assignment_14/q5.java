package Assignment_14;

// Q.5. Write a program to throw exception with your own message

public class q5 {

	public static void validate(int age) {

		if(age<18) {

			//throw Arithmetic exception if not eligible to vote
			throw new ArithmeticException(" Sorry! Person is not eligible to vote");

		} else {

			System.out.println("Person is eligible to vote!!");

		}
	}

	public static void main(String args[]){

		//calling the function
		validate(13);

	}
}
