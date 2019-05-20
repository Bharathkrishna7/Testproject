package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeexcelsheet2 
{
	public static void main(String[] args) throws Exception
	{
	File f1=new File("F:\\Testdata\\userdata2.xlsx");
	FileInputStream fis=new FileInputStream(f1);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	   XSSFSheet s1=wb.getSheetAt(0);
	s1.getRow(1).createCell(0).setCellValue("park");
	s1.getRow(1).createCell(1).setCellValue("parkmin");
	s1.getRow(1).createCell(6).setCellValue("parkminyoung");
	s1.createRow(6).createCell(0).setCellValue("radha");
	FileOutputStream fout=new FileOutputStream(f1);
	wb.write(fout);
	wb.close();
	}
}
