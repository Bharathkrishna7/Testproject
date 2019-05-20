package Excelp1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xssf1
{
	public static void main(String[]args) throws Exception
	{
		File f1=new File("F:\\Testdata\\ud1.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s1=wb.getSheetAt(0);
	  int rowcount=s1.getLastRowNum();
	System.out.println("row data in sheet" +rowcount);
	for(int i=0;i<=rowcount;i++)
	{
		String data=s1.getRow(i).getCell(0).getStringCellValue();
		String data1=s1.getRow(i).getCell(1).getStringCellValue();
		String data2=s1.getRow(i).getCell(2).getStringCellValue();
		System.out.println("data in excel" +  data  +  data1  +  data2);
	
	}
	 wb.close();
	}

}
