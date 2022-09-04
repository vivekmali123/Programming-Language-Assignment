package com.intershala.Assignment_7;

public class B extends A{    //Sub Class B....

	/* Create three methods in each class, 2 methods are specific to each class and third
       method (override method) should be in all three Classes A, B and C  */


	public static void methodB1(){
		System.out.println("\nFirst method of class B.");
	}
	public static void methodB2(){
		System.out.println("Second method of class B.");
	}
	public static void method(){    //overridden method...

	    int numberofmethod= 3;      // Data member.....

		System.out.println("Number of Overridden method " + numberofmethod);
	}

}
