package Assignment_13.question4;

/* Q.4. Write two methods with the same name and same number of parameters of different
        type and call from main method   */

public class q4 {

	void viveks_method(int a){        // first method of int type
		System.out.println("This is first method with one parameter of int type of value: " + a);
	}

	void viveks_method(String b){     // second method of string type
		System.out.println("This is second method with one parameter of string type of value: " + b);
	}

	public static void main(String[] args){
		System.out.println("\nAnswer for 4th question.");

		q4 q = new q4();
		q.viveks_method(20);       // call from main method.
		q.viveks_method("Vivek");
	}

}
