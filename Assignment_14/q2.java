package Assignment_14;

// Q.2. Handle the Arithmetic exception using try-catch block

public class q2 {

	public static void main(String args[])
	{

		try {
			// code that generate exception
			int divideByZero = 1 / 0;
			System.out.println("Rest of code in try block");
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());  // it will run and give a message..
		}


	}


}
