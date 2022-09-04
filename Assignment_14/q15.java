package Assignment_14;

// Q.15. Write a program to generate NullPointerException

public class q15 {

	public static void main (String[] args)
	{
		String ptr = null;

		/* Checking if ptr.equals null or works fine.
		   This line of code throws NullPointerException
		   because ptr is null   */

		    if (ptr.equals("gfg")) {
			    System.out.print("Same");
		    }else {
			    System.out.print("Not Same");
		    }
	}
}
