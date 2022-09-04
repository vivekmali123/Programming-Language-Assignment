package Assignment_9.question3;

// Q.3. Create an instance for the child class in child class and call abstract methods.

public class child extends parent{    // child class

	void abstmethod()         // overridden abstract method
	{
		System.out.println("This is call for abstract method");
	}

	public static void main(String[] args){
		child obj3 = new child();
		System.out.println("\nAnswer for 3rd question.");
		obj3.abstmethod();
	}

}
