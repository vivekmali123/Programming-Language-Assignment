package Assignment_12.question2;

// Q.2. Call the constructors(both default and argument constructors) of super class from a child class

public class child_q2 extends parent_q2{

	child_q2(){
		super();
		System.out.println("Here we call default constructor form parent class.\n");
	}

	child_q2(int a){
		super(50);
		System.out.println("Here we call argument constructor from parent class.");
	}

	public static void main(String[] args){
		System.out.println("\nAnswer for 2nd question..");
		child_q2 child = new child_q2();
		child_q2 child2 = new child_q2();
	}

}
