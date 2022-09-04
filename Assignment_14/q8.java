package Assignment_14;

// Q.8. Write a program to generate Arithmetic Exception

public class q8 {

	void divide(int a, int b) {
		// performing division
		int res = a / b;
		System.out.println("Division process has been done successfully.");
		System.out.println("Result came after division is: " + res);
	}

	public static void main(String args[]) {
		Main obj = new Main();
		obj.divide(50, 0);   // it will throw Arithmetic exception....

	}
}
