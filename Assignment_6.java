package com.intershala.javaapp;

import java.util.regex.Pattern;

                                //6. Strings
public class Assignment_6 {

//Q.1. Different ways creating a string

     public static void main(String[] args) {
        System.out.println("******** Answer for 1st question.....\n");

        String s = "Welcome";             // 1st way.....
        String str = new String("Welcome 2");   // 2nd way.....
        char ch[] = {'H', 'e', 'l', 'l', 'o'};
        String str2 = new String(ch);         // 3rd way......

        System.out.println("Strings created with different methods are: \n"  + s);
        System.out.println(str);
        System.out.println(str2);


//Q.2. Concatenating two strings using + operator......

        System.out.println("\n******** Answer for 2nd question.....\n");

        String s1="Vivek";
        String s2="Mali";
        String s3="Here";
        System.out.println("String After concatenation: " + s1 +" "+ s2 +" "+ s3);  // concatenation of strings....


//Q.3. Finding the length of the string........

        System.out.println("\n******** Answer for 3rd question....\n");

        String q3= "Vivek Mali Answering.";
        int length= q3.length();                           // length of string....
        System.out.println("given string is: " + q3);
        System.out.println("length of given string is: " + length);


//Q.4. Extract a string using Substring........

        System.out.println("\n******** Answer for 4th question.....\n");

        String string = "My Name is Vivek Mali";
        String substring = string.substring(11,21);    // Substring

        System.out.println("String is: " + string);
        System.out.println("Substring is: " + substring);


//Q.5. Searching in strings using indexOf().....

        System.out.println("\n******** Answer for 5th question.....\n");

        String q5 = "This is Java Assignment.";
        int index = q5.indexOf("J");         // indexOf()
        System.out.println("Index of word 'J' is: " + index);


//Q.6. Matching a String Against a Regular Expression With matches()

         System.out.println("\n******** Answer for 6th question....\n");

         /* Following line prints "true" because the whole
            text "VivekMali" matches pattern "VivekMali" */

         System.out.println("True if matches the patterns, otherwise false. ");
         System.out.println(Pattern.matches("VivekMali", "VivekMali"));


//Q.7. Comparing strings using the methods equals().....

         System.out.println("\n******** Answer for 7th question....\n");
         String q7 = "Question 7";
         String q6 = "Question 6";
         String q = "Question 7";

         System.out.println("Comparison of strings, it will return true if both the strings are equal otherwise false..");
         System.out.println("Comparison between q7 and q6 returns: " + q7.equals(q6));
         System.out.println("Comparison between q7 and q returns: " + q7.equals(q));


//Q.8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()......

         System.out.println("\n******** Answer for 8th question.....\n");

         String q8 = "This is 8th question.";
         // returns true, case is ignored....

         System.out.println("Returns true if right, otherwise false.");
         System.out.println(q8.substring(0,4).equalsIgnoreCase("this"));

         // returns true, if it starts with This.....
         System.out.println(q8.startsWith("This"));

         // returns ture, if it ends with question.
         System.out.println(q8.endsWith("8th"));


//Q.9. Trimming strings with trim().....

         System.out.println("\n******** Answer for 9th question....\n");

         String t = "   Vivek Mali   ";

         // Before Trim() method
         System.out.println("Before Trim() ");
         System.out.println("String: " + t);
         System.out.println("Length: "+ t.length());

         // applying trim() method on string s1...
         t = t.trim();

         // After Trim() method
         System.out.println("After Trim() ");
         System.out.println("String: "+ t);
         System.out.println("Length: "+ t.length());


//Q.10. Replacing characters in strings with replace()......

         System.out.println("\n******** Answer for 10th question.....\n");

         String S1 = new String("I am in Computer Department.");
         System.out.println("Original String is: \n " + S1);
         System.out.println("String after replacing 'Computer' with 'Information Technology': \n " + S1.replace("Computer", "Information Technology"));


//Q.11. Splitting strings with split().......

         System.out.println("\n******** Answer for 11th question.....\n ");

         String q11 = "Vivek@Mali";
         System.out.println("After Spliting the patterns:");
         String[] arrOfq11 = q11.split("@", 2);   // it will split in 2 parts...
         for (String a : arrOfq11) {
             System.out.println(a);
         }


//Q.12. Converting Numbers to Strings with valueOf()......

         System.out.println("\n******** Answer for 12th question.....\n");

         String q12 = "Vivek Mali" ;
         String q121= String.valueOf(q12);    // value of function....
         System.out.println("After using value of function output will be: " + q121);


//Q.13. Converting integer objects to Strings........

         System.out.println("\n******** Answer for 13th question.....\n");

         int q13 = 1234 ;
         String q131= String.valueOf(q13);    // conversion....
         System.out.println("After conversion of function output will be: " + q131);


//Q.14. Converting to uppercase and lowercase.......

         System.out.println("\n******** Answer for 14th question.....\n");

         String q14 = new String("UPPERCASE CONVERTED TO LOWERCASE");

         //Convert to LowerCase
         System.out.println(q14.toLowerCase());


     }
}

