package Assignment_15;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Q.7. Read text from a .txt file using BufferedReader

public class q7 {

		public static void main(String[] args)
		{
			File file = new File("E:/Courses/jala acedemy/java assignment 15/vivek");

			try (BufferedReader br = new BufferedReader(new FileReader(file)))
			{
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

}
