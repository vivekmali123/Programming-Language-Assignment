package Assignment_12.question5;

// Q.5.Try to call the constructor multiple times with the same object

public class q5 {

	q5(){
		System.out.println("This is our constructor..");
	}

	public static void main(String[] args){
		q5 newobj = new q5();
		q5 newobj = new q5();     // we can not call a constructor multiple times as it is called once..
		q5 newobj = new q5();
	}
}
