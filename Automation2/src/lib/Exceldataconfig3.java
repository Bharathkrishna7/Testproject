package lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataconfig3 
{
	XSSFWorkbook wb;
	XSSFSheet S1;
	public Exceldataconfig3(String Excelpath)
	{
		try 
		{
			File f1=new File("Excelpath");
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
		   S1=wb.getSheetAt(sheetnumber);
		   String data=S1.getRow(row).getCell(column).getStringCellValue();
	    	  return data;
	   }
}
