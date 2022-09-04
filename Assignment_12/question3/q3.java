package Assignment_12.question3;

// Q.3. Apply private, public, protected and default access modifiers to the constructor

public class q3 {

	public q3(){
		System.out.println("This is Public Default constructor.");
	}

	private q3(int x){
		System.out.println("This is Private parameterized constructor and its value is: " + x);
	}

	protected q3(int y, int z){
		System.out.println("This is Protected parameterized constructor and its value is: " + y + " & " + z);
	}

	public static void main(String[] args){
		q3 obj1 = new q3();
		q3 obj2 = new q3(20);
		q3 obj3 = new q3(5,90);
	}
}
