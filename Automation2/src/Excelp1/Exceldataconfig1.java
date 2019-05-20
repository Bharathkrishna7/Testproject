package Excelp1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataconfig1
{
	XSSFWorkbook wb;
	 XSSFSheet s1;
 public Exceldataconfig1(String excelpath)
 {
	 try
	 {
		File f1=new File(excelpath);
		 FileInputStream fis=new FileInputStream(f1);
		  wb=new XSSFWorkbook(fis);
	 }
	 catch (IOException e) 
	 {
		System.out.println(e.getMessage());
	 }
 } 
	 public String getdata(int sheetnumber,int rownum,int cellnum)
	 {
		  s1=wb.getSheetAt(sheetnumber);
		 String data=s1.getRow(rownum).getCell(cellnum).getStringCellValue();
		 return data;
		 
	 }
	 public String getdata1(int sheetnumber,int rownum,int cellnum)
	 {
		  s1=wb.getSheetAt(sheetnumber);
		 String data=s1.getRow(rownum).getCell(cellnum).getStringCellValue();
		 return data;
		 
	 }
   }
