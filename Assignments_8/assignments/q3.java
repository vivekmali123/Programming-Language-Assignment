package Assignments_8.assignments;

/* Q.3. Create a class with PROTECTED fields and methods.
        Access these fields and methods from any other class in the same package.
        Also, Access the PROTECTED fields and methods from child class located in a different package.
        Access the PROTECTED fields and methods from any class in different package  */

public class q3{

      protected String proctfield;   // protected field
      protected void proctmethod(){  // protected method
	      System.out.println("Hii this is protected method of subclass");
      }
 /*     public static void main(String[] args){

      	// call for protected members of different package...

	      question3_continue newobj = new question3_continue();
	      newobj.newproctfield = "This protected field from other package";
	      System.out.println(newobj.newproctfield);

	      newobj.newproctmethod();  // so we cant access protected field and method from different package, it thorws exceptions..
 */


}
