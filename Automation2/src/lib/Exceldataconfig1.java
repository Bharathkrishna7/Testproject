package lib;

import java.io.File; 
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataconfig1 
{
	XSSFWorkbook wb;
	XSSFSheet Sheet1;
   public Exceldataconfig1(String excelpath)
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
    	  Sheet1=wb.getSheetAt(sheetnumber);
    	  String data=Sheet1.getRow(row).getCell(column).getStringCellValue();
    	  return data;
      }
}
