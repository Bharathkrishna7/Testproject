package Excelp1;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataconfig
{
	XSSFWorkbook wb;
	XSSFSheet s1;
	public Exceldataconfig(String Excelpath)
	{
		try 
		{
		File f1=new File(Excelpath);
		FileInputStream fis=new FileInputStream(f1);
			  wb=new XSSFWorkbook(fis);
		}
			  catch (Exception e)
			  {
				System.out.println(e.getMessage());  
			  }
	}
         public String getdata(int sheet,int row,int column)
         {
        	 
        	  s1=wb.getSheetAt(sheet);
        	  String data=s1.getRow(row).getCell(column).getStringCellValue();
        	  return data;
        	 
         }
         public int getRowCount(String sheetName)
         {
 			int index = wb.getSheetIndex(sheetName);
 			if(index==-1)
 				return 0;
 			else{
 			s1 = wb.getSheetAt(index);
 			int number=s1.getLastRowNum()+1;
 			return number;
 		   }
         }		
}
