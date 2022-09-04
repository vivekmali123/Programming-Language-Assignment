package Assignment_15;

                          //15. JAVA IO

// lets create a file first

import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                try
                {
                    Scanner sc=new Scanner(System.in);

                    System.out.print("Enter the file name: ");
                    String name=sc.nextLine();                   //variable name to store the file name

                    FileOutputStream fos=new FileOutputStream(name, true);  // true for append mode

                    System.out.print("Enter file content: ");

                    String str=sc.nextLine()+"\n";      //str stores the string which we have entered
                    byte[] b= str.getBytes();       //converts string into bytes

                    fos.write(b);           //writes bytes into file
                    fos.close();            //close the file

                    System.out.println("file saved.");
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }




    }
}
