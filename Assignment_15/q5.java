package Assignment_15;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Q.5. Write a program to read text from .txt file using FileReader

public class q5 {

		public static void main(String[] args)
		{
			File file = new File("E:/Courses/jala acedemy/java assignment 15/vivek");

			try (FileReader fr = new FileReader(file))
			{
				int content;
				while ((content = fr.read()) != -1) {
					System.out.print((char) content);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

        // This will read the file....
}
