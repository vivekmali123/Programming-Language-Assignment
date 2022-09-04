package Assignment_13.question2;

/* Q.2. Write two methods with the same name but different number of parameters of different
       data type and call the methods from main method */

public class q2 {

	void method(String a){    // first method with single parameter, of string type
		System.out.println("THis is first method with parameter, of value: " + a);
	}

	void method(int x, int z){    // second method with two parameters, of int type
		System.out.println("This is second method with parameters, of value: " + x + " & " + z);
	}

	public static void main(String[] args){
		System.out.println("\nAnswer for 2nd question");

		q2 obj = new q2();
		obj.method("Vivek Mali");
		obj.method(50,100);
	}
}
