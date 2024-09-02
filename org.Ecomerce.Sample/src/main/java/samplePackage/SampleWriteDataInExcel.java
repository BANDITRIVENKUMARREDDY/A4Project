package samplePackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import generic.IconstantUtility;



public class SampleWriteDataInExcel {

	public static void main(String[] args) throws  Exception {
		FileInputStream fis=new FileInputStream(IconstantUtility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		sh.createRow(4).createCell(0).setCellValue("NANI REDDY");
		FileOutputStream fos=new FileOutputStream(IconstantUtility.excelPath);
		book.write(fos);
		
	}

	
}
