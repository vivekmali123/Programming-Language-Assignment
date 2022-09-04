package Assignment_14;

// Q.14. Write a program to generate NoSuchMethodException

public class q14 {
	
	public static void main(String[] args)
	{

		NoSuchMethodError obj = new NoSuchMethodError();

		/* Now calling print() method which is not present
		   in NoSuchMethodErrorExample class, hence throwing
		   exception  */

		obj.print("Hello World");
	}


}

class NoSuchMethodError {

	// Method 1
	// Void demo method created to be called
	// in another class containing main() method

	public void printer(String myString) {

		System.out.println(myString);
	}

}

