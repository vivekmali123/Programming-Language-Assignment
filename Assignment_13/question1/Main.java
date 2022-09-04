package Assignment_13.question1;

                             //13. Method Overloading

/* Q.1. Write two methods with the same name but different number of parameters of same type
        and call the methods from main method */

public class Main {

    void display(int x){    // first method
        System.out.println("This is first method with one parameter, with value: " + x);
    }

    void display(int y, int z){    // second method
        System.out.println("This is second method with 2 parameters, with value: " + y + " & " + z);
    }

    public static void main(String[] args) {
	    Main object = new Main();

        System.out.println("\nAnswer for 1st question");
	    object.display(20);
	    object.display(50,80);

    }
}
