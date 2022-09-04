package Assignment_9.question4;

// Q.4. Create an instance for the child class in child class and call non-abstract methods

public class subclass extends mainclass {    // child class

	public static void main(String[] args){
		subclass sub = new subclass();
		System.out.println("\nAnswer for 4th question..");
		sub.nonabstractmethod();        // call for non abstract method..
	}

}
