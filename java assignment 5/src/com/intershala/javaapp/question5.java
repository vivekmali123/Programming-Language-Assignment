package com.intershala.javaapp;

public class question5 {

//Q.5. Call static methods in instance methods.....

	public static void method(){       // static method.....
		int b=40;
		System.out.println("Variable of static method is printing in instance method: " + b);
	}

	void instancemethod(){               // instance method.....
		question5 ob =new question5();
		ob.method();            // calling instance method..
	}

	public static void main(String[] args){
		System.out.println("Answer for 5th question.....\n");

		question5 obj = new question5();
		obj.instancemethod();
	}


}
