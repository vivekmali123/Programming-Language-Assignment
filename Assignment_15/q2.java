package Assignment_15;
import java.util.Scanner;
import java.io.*;

// Q.2. Write a program to write text to .txt file using OutputStream

public class q2 {

	public static void main(String[] args) throws IOException {

		String file = "E:/Courses/jala acedemy/java assignment 15/vivek";

		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter(file);

		while(true){
			String output = scan.nextLine();
			if("DONE".equalsIgnoreCase(output.trim())){
				break;
			}
			fw.write(output);
			break;
		}
		scan.close();
		fw.close();

		// Write new content in file.
	}
}