package com.intershala.Assignment_7;

public class C extends B{     //Sub Class C....

	/* Create three methods in each class, 2 methods are specific to each class and third
       method (override method) should be in all three Classes A, B and C  */


	public static void methodC1(){
		System.out.println("\nFirst method of class C.");
	}
	public static void methodC2(){
		System.out.println("Second method of class C.");
	}
	public static void method(){       //overridden method...

		int numberofmethods = 9;       // Data Member.....

		System.out.println("\nTotal number of methods are: " + numberofmethods);
	}

}
