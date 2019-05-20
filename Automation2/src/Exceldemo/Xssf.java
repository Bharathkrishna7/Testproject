package Exceldemo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xssf 
{
	public static void main(String [] args) throws Exception
	{
		File f1=new File("F:\\Excel data\\Testdata.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s1=wb.getSheetAt(0);
		String data=s1.getRow(3).getCell(1).getStringCellValue();
		String data1=s1.getRow(4).getCell(2).getStringCellValue();
		System.out.println("the data in excel is "+ data);
		System.out.println("data in excel is "+ data1);
		wb.close();
		
	}
	

}
                       