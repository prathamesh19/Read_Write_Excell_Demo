package com.prathamesh.readwriteexcel.readwriteexcelldemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// create Workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// create sheet
		XSSFSheet sheet = workbook.createSheet("Emp Data"); 
		 
		// Creating row1
		Row row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("EMP_ID");
		row1.createCell(1).setCellValue("EMP_NAME");
		
		// Creating row2
		Row row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("101");
		row2.createCell(1).setCellValue("Prathamesh");
		
		// Creating row3
		Row row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("102");
		row3.createCell(1).setCellValue("Gaurav");
				 
		// Writing to file
		File file = new File("F://write_read_excell_demo.xlsx");
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		out.close();
		
		System.out.println("file written successfully");
	}

}
