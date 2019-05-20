package lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataconfig5
{
	XSSFWorkbook wb;
	XSSFSheet S1;
	public Exceldataconfig5(String excelpath)
	{
		try 
		{
			File f1=new File("excelpath");
			FileInputStream fis=new FileInputStream (f1);
			 wb=new XSSFWorkbook(fis);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			
		}
	}	
	  
	public String getdata(int Sheetnumber,int row,int column)
	{
    	S1=wb.getSheetAt(Sheetnumber);
	  String data=S1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

  }
