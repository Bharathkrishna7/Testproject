package Excelp1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xssf
{
	public static void main(String[]args) throws Exception
	{
		File f1=new File("F:\\Testdata\\ud1.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s1=wb.getSheetAt(0);
		String data0=s1.getRow(0).getCell(1).getStringCellValue();
		String data=s1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("data in excep is"+data);
		System.out.println("data in excep is"+data0);
       wb.close();		
		
	}

}