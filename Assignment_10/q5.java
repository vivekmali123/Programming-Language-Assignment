package Assignment_10;

/* Q.5. Create two interfaces with the same method (same signature) in both the interfaces.
   Implement these two interfaces in one class. Call the method. */

   interface one{   // first interface
   	  void samemethod();
   }

   interface two{   // second interface
	  void samemethod();   // same method.
   }

   public class q5 implements one, two{
   	public void samemethod(){
	    System.out.println("\n Answer for 5th question......");
	    System.out.println("Called the overridden method.");
    }
   }
