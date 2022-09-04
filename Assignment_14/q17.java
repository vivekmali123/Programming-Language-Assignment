package Assignment_14;

// Q.17. Write a program to generate StringIndexOutOfBoundsException

public class q17 {

	public static void main(String[] args) {

		String str = "Vivek\n";

		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		System.out.println(str.length());

		//Accessing element at greater than the length of the String

			System.out.println(str.charAt(40));

		// It will show StringIndexOutOfBoundsException

	}


}
