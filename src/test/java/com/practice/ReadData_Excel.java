package com.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData_Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("../SDET_19/src/test/resources/SDET_19.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//Initialize in single line
		//String value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(1);
		Cell c = r.getCell(0);
		String value = c.getStringCellValue();
		//for numeric value getNumericCellValue() and for characters toString()
		System.out.println(value);
	}

}
