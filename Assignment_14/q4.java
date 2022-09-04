package Assignment_14;

// Q.4. Write a program with multiple catch blocks.

public class q4 {

  public static void main(String[] args) {

  	try {

		int a[] = new int[5];
		a[5] = 30 / 0;

	} catch (ArithmeticException e) {

		System.out.println("Arithmetic Exception occurs");

	} catch (ArrayIndexOutOfBoundsException e) {

		System.out.println("ArrayIndexOutOfBounds Exception occurs");

	} catch (Exception e) {

		System.out.println("Parent Exception occurs");
	}

  }

}