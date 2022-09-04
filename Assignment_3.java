package com.intershala.javaapp;
import java.util.Scanner;

                                           //3. Loops
public class Assignment_3 {

//Q.1. Write a program to print “Bright IT Career” ten times using for loop.......

    public static void first(){

        System.out.println("\nAnswer for 1st question....\n");
        for(int i=0; i<10; i++) {
            System.out.println("Bright IT Career");   //It will print 10 times....
        }


//Q.2. Write a java program to print 1 to 20 numbers using the while loop.......

       int a=0;
        System.out.println("\nAnswer for 2nd question....");
        System.out.println("\nNumbers 1 to 20 are: ....");
       while(a<20){
           a++;
           System.out.println(a);
        }


//Q.3. Program to equal operator and not equal operators........

       int x=10;
       int y=20;

        System.out.println("\nAnswer for 3rd question....");
        if(x==y){                   //Equal operator.......
            System.out.println("X and Y are Equal numbers....");
        }else if(x!=y){           //NOt Equal operator......
            System.out.println("X and Y are Not Equal numbers....");
        }


//Q.4. Write a program to print the odd and even numbers.......
        int e[]={0,1,2,3,4,5,6,7,8,9,10};

        System.out.println("\nAnswer for 4th question....");
        System.out.println("Even numbers from the array [0,1,2,3,4,5,6,7,8,9,10] are: ....");
            for (int i= 0; i<e.length; i++) {      //For even Number
                if (e[i]%2==0) {
                    System.out.println(e[i]);
                }
            }
        System.out.println("Odd numbers from the array [0,1,2,3,4,5,6,7,8,9,10] are:....");
            for (int i = 0; i<e.length; i++){      //For odd Numbers
                if(e[i]%2!=0){
                    System.out.println(e[i]);
                }
            }


//Q.5. Write a program to print largest number among three numbers........

        int arr[] = {50,20,90};
        int max = arr[0];

        System.out.println("\nAnswer for 5th question....");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest number among the three is: " + max);


//Q.6. Write a program to print even number between 10 and 100 using while.......

        int even=0;
        System.out.println("\nAnswer for 6th question....");
        System.out.println("\nEven Numbers are:");
        while(even<100){
            even++;
            if(even%2==0){
            System.out.println(even);
            }
      }


//Q.7. Write a program to print 1 to 10 using the do-while loop statement.........

        int num=0;
        System.out.println("\nAnswer for 7th question....\n");
        System.out.println("\n1 to 10 numbers are:....");
        do{
            num++;
            System.out.println(num);
        }while(num<10);


//Q.8. Write a program to find Armstrong number or not......

        int number = 1634;
        int Number2;
        int remainder;
        int result = 0;
        Number2 = number;

        System.out.println("\nAnswer for 8th question....");
        while (Number2 != 0)
        {
            remainder = Number2 % 10;
            result += Math.pow(remainder, 4);
            Number2 /= 10;
        }
        if(result == number) {
            System.out.println(number + " is an Armstrong number.");
        }else{
            System.out.println(number + " is not an Armstrong number.");
        }


//Q.9. Write a program to find the prime or not.......

        int prime = 57;
        boolean flag = false;

        System.out.println("\nAnswer for 9th question....");
        for (int i = 2; i <= prime / 2; i++) {
                   //condition for prime
            if (prime % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(prime + " is a prime number.");
        }else{
            System.out.println(prime + " is not a prime number.");
        }


//Q.10. Write a program to palindrome or not........

        String original= "Vivek";
        String reverse= "";
        int length = original.length();

        System.out.println("\nAnswer for 10th question....\n");
        for ( int i=length-1; i >= 0; i-- ){
            reverse = reverse + original.charAt(i);
        if(original==reverse) {
            System.out.println("Entered string/number is a palindrome.");
        }else {
            System.out.println("Entered string/number isn't a palindrome.");
             }
        }
        System.out.println("\n"+reverse);


//Q.11. Program to check whether a number is EVEN or ODD using switch..........

        int num1=100;

        System.out.println("\nAnswer for 11th question....");
        switch(num1%2) {
            case 0:
                System.out.println(num1 + " is an Even number");
                break;
            case 1:
                System.out.println(num1 + " is an Odd number");
                break;
        }


//Q.12. Print gender (Male/Female) program according to given M/F using switch......
        Scanner sc=new Scanner(System.in);
        char gender;

        System.out.println("\nAnswer for 12th question....");
        System.out.println("Enter gender as M/F: ");          // Gender entered by user...
        gender = sc.next().charAt(0);
        switch (gender) {
            case 'M':
                System.out.println("Male.");
                break;
            case 'F':
                System.out.println("Female.");
                break;
        }


//Q.13. Program for multiple if else statement(Largest number in 10,20 and 30)........

        int n1 = 10;
        int n2 = 20;
        int n3 = 30;

        System.out.println("\nAnswer for 13th question....");
        if( n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is the largest number.");
        }else if(n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is the largest number.");
        }else{
            System.out.println(n3 + " is the largest number.");
        }
    }

    public static void main(String[] args) {
        Assignment_3 obj = new Assignment_3();
        obj.first();


    }
}
