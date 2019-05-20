package demopack2;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 
{
	public static void main(String[] args) throws Exception
	{
		File f1=new File("F:/Testdata/userdata2.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		Workbook w1=WorkbookFactory.create(fis);
		Sheet s1=w1.getSheet("sheet1");
	String data0 =s1.getRow(1).getCell(1).getStringCellValue();
	System.out.print("excel data "+data0);
	String data1 =s1.getRow(10).getCell(8).getStringCellValue();
	System.out.println("excel data "+data1);
	
	}

}
