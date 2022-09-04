package com.intershala.javaapp;

public class question3 {

//Q.3. Print static variables in Instance methods.....

	public static int variable;

	void instancemethod(int age){
	   variable=age;
	}
   //Static variable can be referenced from instance context ...

	public static void main(String[] args){
		System.out.println("Answer for 3rd question.....\n");

		question3 object= new question3();
		object.instancemethod(20);
		System.out.println("Static variable referenced in instance method...\nthat is: Age of candidate is: " + object.variable);
	}
}
