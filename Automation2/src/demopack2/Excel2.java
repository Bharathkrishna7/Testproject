package demopack2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2  
{
	public static void main(String[] args) throws Exception
	{
		File f1=new File("F:/Testdata/userdata3.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s1=wb.getSheetAt(0);
		s1.createRow(4).createCell(1).setCellValue("min young park");
		FileOutputStream fout=new FileOutputStream(f1);
		wb.write(fout);
	    wb.close();	
		
	}

}
