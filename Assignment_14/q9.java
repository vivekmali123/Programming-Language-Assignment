package Assignment_14;

// Q.9. Write a program to generate ArrayIndexOutOfBoundException

public class q9 {

	public static void main(String[] args) {
		String[] arr = new String[10];
		System.out.println(arr[10]);    // it will throw .ArrayIndexOutOfBoundsException
	}


}
