package com.intershala.javaapp;

                                //2. Operators
public class Assignment_2 {
      static int x=20;
      static int y=40;

//Q.1. Write a function for arithmetic operators(+,-,*,/).......

    public static void operators(){

        System.out.println("\nAnswer for 1st question\n");

        // Addition ' + '
        int add= x+y;
        System.out.println("Addition is: " + add);

        //Subtraction ' - '
        int sub= y-x;
        System.out.println("Subtraction is: " + sub);

        //Multiplication ' * '
        int multi= x*y;
        System.out.println("Multiplication is: " + multi);

        //Division ' / '
        int Div= y/x;
        System.out.println("Division is: " + Div);
    }


//Q.2. Write a method for increment and decrement operators(++,--).......

    public static void method2(){

        System.out.println("\nAnswer for 2nd question\n");

        //increment operator
        x++;
        System.out.println("Variable after increment: "+x); // x was 20 now it will increment by 1

        //decrement operator
        y--;
        System.out.println("Variable after decrement: "+y); // y was 40 now it will decrement by 1


//Q.3. Program to equal operator and not equal operators.......

        int a=100;
        int b=100;

        System.out.println("\nAnswer for 3rd question\n");

        System.out.println(a==b);  // this is equal to operator
        System.out.println(a!=b);  // this is not equal to operator


//Q.4. Write a program to find the two numbers equal or not.......
      /**  this will find that two numbers are equal or not **/

        System.out.println("\nAnswer for 4th question\n");

        if(a==b){
            System.out.println("Equal numbers");
        }else if(a!=b){
            System.out.println("Not Equal numbers");
        }


//Q.5. Programs on Logical AND,OR operator and Logical NOT.........

        int var=50;
        int var1= 80;

        System.out.println("\nAnswer for 5th question\n");

        if((var>40) && (var1>40)){        // And Operator
            System.out.println("Greater than 40, using And Operator");
        }else{
            System.out.println("Not Greater than 40, using And Operator");
        }


        if((var>40) || (var1<40)){     // OR Operator
            System.out.println("Greater than 40, using OR Operator");
        }else{
            System.out.println("Not Greater than 40, using OR Operator");
        }


        if(!(var>40)){            // Not Operator
            System.out.println("Greater than 40, using NOT Operator");
        }else{
            System.out.println("Not Greater than 40, using NOT Operator");
        }


//Q.6. Program for relational operators (<,<==, >, >==).........

        int newvar= 100;
        int newvar1= 200;

        System.out.println("\nAnswer for 6th question\n");

        if(newvar < newvar1){                    //Greater than operator
            System.out.println(" Greater than operator");
        }else if(newvar <= newvar1){          //Greater than equal to operator
            System.out.println(" Greater than equal to operator");
        }else if(newvar > newvar1){          //Less than operator
            System.out.println(" Less than operator");
        }else if(newvar >= newvar1){      //Less than equal to operator
            System.out.println(" Less than equal to operator");
        }


//Q.7. Print the smaller and larger number........
        int number1=300;
        int number2=600;

        System.out.println("\nAnswer for 7th question\n");

        if(number1 > number2){
            System.out.println("\nNumber1 is greater than Number2....");
        }else{
            System.out.println("Number2 is greater than Number1....");
        }

    }
    public static void main(String[] args) {
        Assignment_2 obj =new Assignment_2();
        obj.operators();
        obj.method2();

    }
}
