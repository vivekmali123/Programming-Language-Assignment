package Assignments_8.q4;

/* Q.4. Create a class with PUBLIC fields and methods.
        Access the public methods and fields from any class in the same package or different package. */

import Assignments_8.assignments.q4;
import com.intershala.javaapp.*;

public class question4_continue extends q4 {

	public static void main(String[] args){

		q4 newobj1 = new q4();
		newobj1.publicfield = "This is public method from different package";
		System.out.println("\nAnswer for 4th question");
		System.out.println(newobj1.publicfield);
		newobj1.publicmethod();

	}
}
