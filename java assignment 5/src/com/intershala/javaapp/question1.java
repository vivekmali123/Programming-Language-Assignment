package com.intershala.javaapp;

                               //5. Static
public class question1 {

/* 1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
      methods and a main method......... */


      public static String var = "Vivek";     // static variable 1....
      public static int var1 = 20;            // static variable 2....

      public String instance= "Mohit";         // instance variable 1.....
      public int instance1 = 30;              // instance variable 2.....

      public static void method() {
          System.out.println("This is first method....");      // static method 1....
      }
      public static void method1(){
          System.out.println("This is second method....");     // static method 2....
      }

      void add(){
          System.out.println("This is first instance....");    // instance method 1....
      }

      void add1(){
          System.out.println("This is second instance....");   // instance method 2....
      }

    public static void main(String[] args) {
        System.out.println("Answer for 1st question.....\n");

        question1 obj = new question1();
       }
}
