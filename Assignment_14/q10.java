package Assignment_14;

// Q.10. Write a program to generate ClassNotFoundException

public class q10 {

	public static void main(String[] args){

		try {

			Class.forName("Vivek's class");
		}
		catch (ClassNotFoundException ex) {

			// Displaying exceptions on console along

			ex.printStackTrace();

		}

	}

}
