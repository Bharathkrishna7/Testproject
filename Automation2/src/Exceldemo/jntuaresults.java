package Exceldemo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Helper.BrowserFactory;

public class jntuaresults  
{
  public static void main(String[] args) throws Exception
  {
	WebDriver  brow=BrowserFactory.startbrowser("Firefox", "https://www.google.com/search?q=jntua+results&ie=utf-8&oe=utf-8");
    brow.findElement(By.className("LC20lb")).click();
    File f1=new File("C:/Automationworkspace2/Automation2/src/Exceldata/jntuaresults.xlsx");
    FileInputStream fis=new FileInputStream(f1);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet s1=wb.getSheetAt(0);
	String result=s1.getRow(1).getCell(1).getStringCellValue();
	System.out.println("data in excel is "+result);
	brow.findElement(By.id("ContentPlaceHolder1_rptResultsData_hlIndividualResults_1")).click(); 
    wb.close();
  }
  
}
