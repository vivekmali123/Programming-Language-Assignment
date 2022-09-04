package Assignment_11.question4;

// Q.4. Call argument constructor of current class using this()

public class q4 {

	int x;
	int y;

	q4(int x, int y)      // Parameterized constructor
	{
		this.x=x;
		this.y=y;
	}

	void display()
	{
		//Displaying value of variables a and b
		System.out.println("Printing parameters of constructor:- x = " + x + "  y = " + y);
	}

	public static void main(String[] args)
	{
		q4 obj = new q4(50,80);
		obj.display();
	}

}
