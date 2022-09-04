package Assignment_10;

//Q.1. Create an interface with only one method and implement it in a class. Call the method implemented.

     interface Polygon {    // interface
     	 void getArea(int length, int breadth);
     }

     public class q1 implements Polygon{        // implement the Polygon interface

		// implementation of method
		public void getArea(int length, int breadth) {
			System.out.println("Answer for 1st question......:");
			System.out.println("The area of the rectangle is " + (length * breadth));
		}

     }

