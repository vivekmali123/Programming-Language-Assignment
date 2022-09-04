package Assignment_15;
import java.io.*;
import java.util.Scanner;

// Q.4. Write text to a .txt file using BufferedOutputStream

public class q4 {

	public static void main(String[] args) throws Exception {

		try {
			Scanner sc = new Scanner(System.in);

			String file = "E:/Courses/jala acedemy/java assignment 15/vivek";

			FileWriter writer = new FileWriter(file);
			BufferedWriter buffer = new BufferedWriter(writer);

			while (true) {
				String input = sc.nextLine();
				if ("DONE".equalsIgnoreCase(input.trim())) {
					break;
				}
				buffer.write(input);
				break;
			    }
		    } catch (IOException e) {
			  e.printStackTrace();
	     	}
			   System.out.println("Success");

            // This will write in file
		}


}


