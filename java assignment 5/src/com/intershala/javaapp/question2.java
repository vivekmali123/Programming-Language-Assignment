package com.intershala.javaapp;

public class question2 {

//Q.2. Print instance variables in static methods.......

	public String newinstance="";                 // instance varibale 2.....

	public static void newmethod(String name) {   // static method 1....
		newinstance= name;
	}
	// instance variable (newinstance) cannot be referenced from a static context..

	public static void main(String[] args){
		System.out.println("Answer for 2nd question.....\n");

		question2 newobj=new question2();
		newobj.newmethod("Vivek");
		System.out.println("Name is: " + newobj.newinstance);
	}
}



