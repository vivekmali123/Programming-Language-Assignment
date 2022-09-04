package Assignments_8.q3;

/* Q.3. Create a class with PROTECTED fields and methods.
        Access these fields and methods from any other class in the same package.
        Also, Access the PROTECTED fields and methods from child class located in a different package
        Access the PROTECTED fields and methods from any class in different package */

import Assignments_8.assignments.q3;
import com.intershala.javaapp.*;

public class question3_continue extends q3 {

	protected String newproctfield;  // protected field
	protected void newproctmethod(){  // protected method
		System.out.println("This is protected method of other package..");

	}

}
