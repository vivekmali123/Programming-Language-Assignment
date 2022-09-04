package Assignment_13.question3;

/* Q.3. Write two methods with the same name and same number of parameters of same type
        and call from main method  */

public class q3 {

	void samemethod(int a){   // first method, with 1 parameter of int type
		System.out.println("This is first method with one parameter, of value: " + a);
	}

    void samemethod(int b){   // second method, with 1 parameter of int type
		System.out.println("This is second method with two parameter, of value: " + b);
	}

	public static void main(String[] args) {
		q3 obj1 = new q3();

		System.out.println("\nAnswer for 3rd question.");
		// we cannot call method with same name, same number and same type of parameters...

		obj1.samemethod(20);
		obj1.samemethod(50);  // It throws exception, it cannot identify the parameters...
	}

}
