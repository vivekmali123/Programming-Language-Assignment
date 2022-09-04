package com.intershala.Assignment_7;
                                           //7. Inheritance.
public class Main {

	public static void main(String[] args) {

         System.out.println(".....Answer for 7th Assignment.....");
	     /* Create a class with main method. Create an object for each class A, B and C in main
            method and call every method of each class using its own object/instance.  */


     A obj = new A();  //object for Super Class A,....
     obj.methodA1();
     obj.methodA2();

     B obj1 = new B();  //Object for Sub Class B, using subclass reference....
     obj1.methodB1();
     obj1.methodB2();


     C obj2 = new C();  //Object for Sub Class C, using subclass reference....
     obj2.methodC1();
     obj2.methodC2();


          // Call an overridden method with super class reference to B and C class’s objects...


     A referenceobj= new B();
     referenceobj.method(" This Overridden method, called with super class reference to B class objects");

     A referenceobj2= new C();
     referenceobj2.method(" called overridden method, with super class reference to C class objects");


          /*  Runtime Polymorphism with Data Members/Instance variables, Repeat the above
              process only for data member  */

     B newobj = new C();          // Runtime polymorphism for variable in class B method(),....

         System.out.println("\nRuntime polymorphism for variable in class B using method(),....");
     newobj.method();

	}
}
