package Assignment_10;

//2. Create an interface with two methods, but implement only one in a class. Call the method implemented.

    interface Drawable{    // interface
	   void draw();             // method 1
	   default void msg(){System.out.println("default method");}    // method 2
    }

    class q2 implements Drawable{

    	//implementation of only one method
       public void draw(){
	       System.out.println("\nAnswer for 2nd question......:");
       	System.out.println("drawing rectangle");
       }
    }

