package Assignment_15;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

// Q.1. Write a program to read text from .txt file using InputStream

public class q1 {

		public static void main(String[] args) {
			try {
				File myObj = new File("E:/Courses/jala acedemy/java assignment 15/vivek");
				Scanner myReader = new Scanner(myObj);

				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					System.out.println(data);
				}
				myReader.close();
			    }catch (FileNotFoundException e) {

				System.out.println("An error occurred.");
				e.printStackTrace();
			}

			// It will read content of file

		}
}


