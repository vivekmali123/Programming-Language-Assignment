package com.intershala.javaapp;

public class question7 {

//Q.7. Call static methods and instance methods in main method.....

	public static void method(){
	     System.out.println("This is first static method....");      // static method 1....
    }
	public static void method1(){
		System.out.println("This is second static method....");     // static method 2....
	}

	void add(){
		System.out.println("This is first instance method....");    // instance method 1....
	}

	void add1(){
		System.out.println("This is second instance method....");   // instance method 2....
	}

    public static void main(String[]args){
	    System.out.println("Answer for 7th question.....");
	    System.out.println("All static methods and instance methods are: \n");
	    question7 a=new question7();
	    question7.method();
	    question7.method1();
	    a.add();
	    a.add1();
    }
}
