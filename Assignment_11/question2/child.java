package Assignment_11.question2;

// Q.2. Print the fields/instance members of the parent class using super

public class child extends parent{


	public void animalSound() {
		super.animalSound();        // Call for superclass method
		System.out.println("The dog says: bow wow");
	}


	public static void main(String args[]) {
		child Dog = new child();     // Create a Dog object
		Dog.animalSound();          // Call the method on the Dog object
	}
}
