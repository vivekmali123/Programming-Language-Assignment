package Assignment_10;

//Q.4. Create two interfaces with one method each. Implement these two interfaces in one class.

     interface first{    // first interface
     	void method1();
     }

     interface  second{   // second interface
	     void method2();
     }

     public class q4 implements first, second{

         // implementation of 2 interfaces in one class
     	public void method1(){
	        System.out.println("\nAnswer for 4th question.....");
	        System.out.println("This is first interface");
	    }
	    public void method2(){
		    System.out.println("This is second interface");
	    }

     }
