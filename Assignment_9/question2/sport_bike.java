package Assignment_9.question2;

/* Q.2. Create a sub class for an abstract class. Create an object in the child class for the
        abstract class and access the non-abstract methods  */

public class sport_bike extends Bike {    // Child Class

	public static void main(String[] args){

		sport_bike obj1 = new sport_bike();
		System.out.println("\nAnswer for 2nd question.");
		obj1.wheel();                   // access of non-abstract method

	}
}
