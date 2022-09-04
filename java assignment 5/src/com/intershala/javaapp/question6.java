package com.intershala.javaapp;

public class question6 {

//Q.6. Print all the static, instance variables in main method.....

	public static String name = "Vivek";     // static variable 1....
	public static int age=21;            // static variable 2....

	public String dept="computer";         // instance variable 1.....
	public int cgpa= 9 ;              // instance varibale 2.....

	public static void main(String[] args){
		question6 n=new question6();
		System.out.println("Answer for 6th question.....");
        System.out.println("All the static and instance variables are: \n");

		//printing all the static and instance variables in main method...
		System.out.println("Name of the students is: " + question6.name + "\nage is: " + question6.age);
		System.out.println("Department of student is: " + n.dept + "\nand his cgpa is: " + n.cgpa);
	}
}
