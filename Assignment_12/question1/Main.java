package Assignment_12.question1;

                              //12.Constructor

/* Q.1. Write a class with a default constructor, one argument constructor and two argument constructors.
     Instantiate the class to call all the constructors of that class from a main class  */

public class Main {

    Main(){
        System.out.println("This is default constructor.");
    }

    Main(int x){
        System.out.println("THis is constructor with one argument. Its value is: " + x);
    }

    Main(int y, int z){
        System.out.println("This is constructor with two arguments. Its Values are: " + y + " & " + z);
    }

    public static void main(String[] args) {

        System.out.println("\nAnswer for 1st question..");

        Main object = new Main();
        Main object1 = new Main(10);
        Main object2 = new Main(40,90);
    }
}
