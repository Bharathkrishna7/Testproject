package lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Exceldataconfig2
{
  XSSFWorkbook wb;
  XSSFSheet s1;
   public Exceldataconfig2(String excelpath)
	{
	try 
	{
		File f1=new File(excelpath);
		FileInputStream fis=new FileInputStream(f1);
		wb=new XSSFWorkbook(fis);
	}
		
	catch (Exception e) 
	{
		System.out.println(e.getMessage());
	}
	
	}
	public String getdata(int sheetnumber,int row,int column)
	{
		 s1=wb.getSheetAt(sheetnumber);
		 String data=s1.getRow(row).getCell(column).getStringCellValue();
		 return data;
	}
  }
   

	

