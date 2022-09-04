package Assignment_14;

// Q.12. Write a program to generate IOException

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class q12 {

	public static void main(String[] args){


	  	//Reading the wrong file using the invalid path

		File ob = new File("/vivek/home");
		FileInputStream fl = new FileInputStream(ob);
		//Checked Exception occurs statement
		System.out.println(fl.read());

		// THis will throw FileNotFoundException and IOException

   }
}
