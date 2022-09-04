package Assignment_15;
import com.opencsv.CSVWriter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Q.11. Write a program to write data to excel


public class q11 {
	private static final String FILE_PATH = "E:/Courses/jala acedemy/java assignment 15/vivek.xlsx";

	//We are making use of a single instance to prevent multiple write access to same file.
	private static final q11 INSTANCE = new q11();

	public static q11 getInstance() {
		return INSTANCE;
	}

	private q11() {
	}

	public static void main(String args[]){

		List studentList = new ArrayList();
		studentList.add(new Student("Magneto","90","100","80"));
		studentList.add(new Student("Wolverine","60","60","90"));
		studentList.add(new Student("ProfX","100","100","100"));

		writeStudentsListToExcel(studentList);

	}

	public static void writeStudentsListToExcel(List studentList){

		// Using XSSF for xlsx format, for xls use HSSF
		Workbook workbook = new XSSFWorkbook();

		Sheet studentsSheet = workbook.createSheet("Students");

		int rowIndex = 0;
		for(Student student : studentList){
			Row row = studentsSheet.createRow(rowIndex++);
			int cellIndex = 0;
			//first place in row is name
			row.createCell(cellIndex++).setCellValue(student.getName());

			//second place in row is marks in maths
			row.createCell(cellIndex++).setCellValue(student.getMaths());

			//third place in row is marks in Science
			row.createCell(cellIndex++).setCellValue(student.getScience());

			//fourth place in row is marks in English
			row.createCell(cellIndex++).setCellValue(student.getEnglish());

		}

		//write this workbook in excel file.
		try {
			FileOutputStream fos = new FileOutputStream(FILE_PATH);
			workbook.write(fos);
			fos.close();

			System.out.println(FILE_PATH + " is successfully written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}