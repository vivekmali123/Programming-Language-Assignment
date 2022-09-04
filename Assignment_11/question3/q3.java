package Assignment_11.question3;

// Q.3. Call constructor of the current class using this().

public class q3 {
	int a;
	int b;

	q3()      // No argument constructor
	{
		this.a = 10;
		this.b = 20;
	}

	void display()
	{
		//Displaying value of variables a and b
		System.out.println("Printing constructor without arguments:- a = " + a + "  b = " + b);
	}

	public static void main(String[] args)
	{
		q3 object = new q3();
		object.display();
	}

}
