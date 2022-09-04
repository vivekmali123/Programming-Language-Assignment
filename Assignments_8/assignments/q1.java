package Assignments_8.assignments;

/* Q.1. Create a class with PRIVATE fields, private method and a main method. Print the fields
       in main method. Call the private method in main method.
       Create a sub class and try to access the private fields and methods from sub class. */

public class q1 {          // Sub class

	private int privateField;          // private field....
	private void ObjectToTestDp4j() { this.privateField = 123; }

	private int privateMethod() { return 456; }     // private method

}
