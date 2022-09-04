package com.intershala.javaapp;

//1. JAVA Basics
public class Assignment_1 {

//Q.1.........How to create a class, object, method and its signature......
        // Class is: Main......

   public static void new_method(int x, int y){
        //hi this is method with signature......
       System.out.println("\nAnswer for 1st question");
       System.out.println("Operation in method printing using object: ");
       System.out.print(x+y);
    }

   public static void main(String[] args) {
        //this is object........
        Assignment_1 a= new Assignment_1();
        a.new_method(10,40);


//Q.2........Write a program to print your name......
       System.out.println("\n\nAnswer for 2nd question \nName: Vivek Sanjay Mali.");




//Q.3....Write a program for a Single line comment, multi-line and documentation comments.......

       System.out.println("\nAnswer for 3rd question \nThis is comment section code... ");
       // This is single line comment......the statement her will not print.

       /* this is multi-line comment
          we can write paragraph here....
        */

       /** Documentation Comment start
        *name
        *class
        *object
        *this is example of documentation comment
        *comment ends **/


/* Q.4......Define variables for different Data Types int, Boolean, char, float, double and print on the
        Console...... */

       int z= 10;              //data type int
       char c= 'v';            //data type char
       float pi=3.14f;         //data type float
       double d=46.532146;     //data type double
       System.out.println("\nAnswer for 4th question \n" + "Data type int: " + z);
       System.out.println("Data type Char: " + c + "\nData type float: " + pi + "\nData type double: " + d );
       boolean g=true;         //data type boolean
       if (g==true){
           System.out.println("Datatype Boolean: g is true...");
       }


/* Q.5....Define the local and Global variables with the same name and print both variables and
        understand the scope of the variables...... */

       Assignment_1 b=new Assignment_1();
       b.methodOne();
       b.methodTwo();

       b.lastquestion(); //this is answer for last question...
   }
      static String globalVariable = "This is Global variable accessible every where";
         // Global Variable Accessible in every method...

      public static void methodOne()
      {
        String localvariable = "This is local variable. And Accessible only for this method";
          // Local Variable accessible only in current method...
        System.out.println("\nAnswer for 5th question\n \n.......This is first method");
        System.out.println(localvariable);
        System.out.println(globalVariable);
       // System.out.println(variable);
      }

      public static void methodTwo()
      {
        String variable = "This is second local variable. And Accessible only for this method";
          //This is another local variable, accessible only for current method...
          System.out.println(".......This is second method");
          System.out.println(globalVariable);
          System.out.println(variable);
         // System.out.println(localvariable);
      }


//Q.6.....Write a function to print your name and call the function from main method.......

          public static void lastquestion(){
          System.out.println("\nAnswer for 6th question \n...My Name is Vivek Mali...");
          //This method is called in main method using object
      }

}
