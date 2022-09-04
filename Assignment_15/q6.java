package Assignment_15;
import java.util.Scanner;
import java.io.*;

// Q.6. Write a program to write text to .txt file using FileWriter

public class q6 {

	public static void main(String [] args) throws IOException
	{
		String file = "E:/Courses/jala acedemy/java assignment 15/vivek";

		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter(file);

		while(true){
			String input = scan.nextLine();
			if("DONE".equalsIgnoreCase(input.trim())){
				break;
			}
			fw.write(input);
			break;
		}
		scan.close();
		fw.close();

	}
}
