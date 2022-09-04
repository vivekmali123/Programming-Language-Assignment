package Assignment_10;

/* 8. Create a PUBLIC interface with fields and methods, fields should have values assigned.
      Implement this interface to some class and print the values of the interface fields and
      call the interface methods */

    interface inf{   // by default interface is public..

    	public static void newmethod(int a){
        }
    }

    public class q8 implements inf{
        public static void newmethod(int a){
            System.out.println("\nAnswer for 8th question......");
            System.out.println("It is printing, value of interface method that is: " + a);
        }

    }
