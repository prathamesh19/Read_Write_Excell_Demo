package com.prathamesh.readwriteexcel.readwriteexcelldemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// loading file
		File f=new File("F://write_read_excell_demo.xlsx");
		FileInputStream file = new FileInputStream(f);
		
		//loading workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// loading sheet
		XSSFSheet sheet = workbook.getSheetAt(0);
      
		// iterating over rows
		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();

			// iterating over cells of respective row
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				
				// print contents of cells
				System.out.print(cell.getStringCellValue() + "     ");
			}
			System.out.println(" ");
			file.close();
    }
	}

}
