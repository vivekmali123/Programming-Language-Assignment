package Assignment_15;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// Q.10. Write a program to read data from excel


public class q10 {
	public static void main(String[] args) {

		// first create excel file
		try {
			String filename = "E:/Courses/jala acedemy/java assignment 15/vivek.xlsx";
			FileOutputStream fileOut = new FileOutputStream(filename);
			fileOut.close();
			System.out.println("Excel file has been generated successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}


		// Read file
		List studentList = getStudentsListFromExcel();

		System.out.println(studentList);
	}

	private static List getStudentsListFromExcel() {
		List studentList = new ArrayList();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("E:/Courses/jala acedemy/java assignment 15/vivek.xlsx");

			// Using XSSF for xlsx format, for xls use HSSF

			Workbook workbook = new XSSFWorkbook(fis);

			int numberOfSheets = workbook.getNumberOfSheets();

			//looping over each workbook sheet
			for (int i = 0; i < numberOfSheets; i++) {
				Sheet sheet = workbook.getSheetAt(i);
				Iterator rowIterator = sheet.iterator();

				//iterating over each row
				while (rowIterator.hasNext()) {

					Student student = new Student();
					Row row = rowIterator.next();
					Iterator cellIterator = row.cellIterator();

					//Iterating over each cell (column wise)  in a particular row.
					while (cellIterator.hasNext()) {

						Cell cell = cellIterator.next();
						//The Cell Containing String will is name.
						if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
							student.setName(cell.getStringCellValue());

							//The Cell Containing numeric value will contain marks
						} else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {

							//Cell with index 1 contains marks in Maths
							if (cell.getColumnIndex() == 1) {
								student.setMaths(String.valueOf(cell.getNumericCellValue()));
							}
							//Cell with index 2 contains marks in Science
							else if (cell.getColumnIndex() == 2) {
								student.setScience(String.valueOf(cell.getNumericCellValue()));
							}
							//Cell with index 3 contains marks in English
							else if (cell.getColumnIndex() == 3) {
								student.setEnglish(String.valueOf(cell.getNumericCellValue()));
							}
						}
					}
					//end iterating a row, add all the elements of a row in list
					studentList.add(student);
				}
			}

			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return studentList;
	}


}




