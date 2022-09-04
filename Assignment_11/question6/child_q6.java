package Assignment_11.question6;

//Q.6. Use this() and super() in methods not in constructor

public class child_q6 extends super_q6{

	void display(){
		super.display();         // super keyword
		System.out.println("This is method of subclass");
	}

	public static void main(String[] args){
		child_q6 ob= new child_q6();
		ob.display();
	}

}
