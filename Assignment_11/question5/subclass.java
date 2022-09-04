package Assignment_11.question5;

// Q.5.Call constructor of the parent class using super()

public class subclass extends superclass{    //subclass

     subclass(){

     	super();       // call for super class constructor
	     System.out.println("Here we called our superclass class constructor in child class. ");
     }

     public static void main(String[] args){
     	subclass sub = new subclass();
     }
}
