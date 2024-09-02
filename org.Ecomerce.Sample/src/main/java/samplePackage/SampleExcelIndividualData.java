package samplePackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SampleExcelIndividualData {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\trive\\Desktop\\SeleniumFolder\\TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.getRow(0);
		Cell c=r.getCell(0);
		String s = c.getStringCellValue();
		System.out.println(s);
		String value=sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		String val=sh.getRow(0).getCell(1).getStringCellValue();
		System.out.println(val);
		String valu=sh.getRow(0).getCell(2).getStringCellValue();
		System.out.println(valu);
		String v=sh.getRow(1).getCell(0).getStringCellValue();//getCell(1).getStringCellValue() illegal State Exception
		System.out.println(v);
		
		
	

	}

}
