package Assignment_10;

//Q.7. Create an interface and inherit it from the other interface....

     interface A{
     	void intfA();
     }

     interface B extends A{
     	void intfB();
     }

     public class q7 implements B{
         public void intfA(){
	         System.out.println("\nAnswer for 7th question....");
	         System.out.println("This is method of first interface.");
         }
         public void intfB(){
	         System.out.println("This is inherited method of second interface");
         }
     }
