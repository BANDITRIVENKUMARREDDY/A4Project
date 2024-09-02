package samplePackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SampleExcelIndividualDataNumberGet {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\trive\\Desktop\\SeleniumFolder\\TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		DataFormatter format =new DataFormatter();
		String data1=format.formatCellValue(sh.getRow(1).getCell(1));
		System.out.println(data1);
		String data2=format.formatCellValue(sh.getRow(2).getCell(1));
		System.out.println(data2);
		String data3=format.formatCellValue(sh.getRow(3).getCell(1));
		System.out.println(data3);
		
	

	}

}
