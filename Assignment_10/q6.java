package Assignment_10;

/* Q.6. Create an interface with a default method and implement it in a class.
        Do not provide implementation to the default method and call the method. */

   interface defaultmethod{
   	   default void function(){};
   }

   public class q6 {
	   public void function(){
		   System.out.println("\nAnswer for 6th question....");
		   System.out.println("Implementation of default method.");
	   }
   }
