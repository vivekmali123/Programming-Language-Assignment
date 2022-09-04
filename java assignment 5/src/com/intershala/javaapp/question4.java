package com.intershala.javaapp;

public class question4 {

//Q.4. Call instance methods in static methods

	public static void method(){       // static method.....
		int a;
		question4 ob =new question4();
		ob.instancemethod();            // calling instance method..
	}
	void instancemethod(){            // instance method.....
		int b=20;
		System.out.println("Variable of instance method is printing in static method: " + b);
	}

	public static void main(String[] args){
		System.out.println("Answer for 4th question.....\n");

		question4 obj = new question4();
		obj.method();
	}

}
