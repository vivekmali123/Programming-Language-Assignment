package Assignment_10;

//Q.10. Create an interface with private, public and protected fields.

    interface field{
    	void function1(String name);    // By default it is public

		    /* the members of an interface cannot be private or protected.
		       If you try to declare the members of an interface private or protected,
		       a compile-time error is generated saying modifier private, protected or public not allowed here */


		    //private static int age = 21;
		    //protected static String address = "Nandurbar";

		    //System.out.println(" Age is(private): " + age);
		    //System.out.println(" Address is(protected): " + address);

    }

    public class q10 implements field{
    	public void function1(String name){
		    System.out.println("\nAnswer of 10th question.....");
		    System.out.println("Name is(public): " + name);
	    }
    }
