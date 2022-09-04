package Assignment_15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class q8 {

	public static void main(String args[]) {

		try {
			FileWriter writer = new FileWriter("E:/Courses/jala acedemy/java assignment 15/vivek");
			BufferedWriter bwr = new BufferedWriter(writer);
			bwr.write("Vivek Mali");

			bwr.close();
			System.out.println("successfully written to a file");
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
