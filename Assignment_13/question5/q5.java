package Assignment_13.question5;

/* Q.5. Write two methods with the same name, number of parameters and data type but
         different return Type  */

public class q5 {

     void method(int a){     // first method
	     System.out.println("This is first method with value: " + a);
     }

     int method(int b){     // second method
	     System.out.println("This is second method with value: " + b);
     }

     public static void main(String[] args){
	     System.out.println("\nAnswer for 5th question.");

	     // we cannot call both the methods with same parameters and with same name...
     	q5 obj5 = new q5();
     	obj5.method(50);
     	obj5.method(100);      // it throws exception.... as it can not identify parameters..
     }

}
