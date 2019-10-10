package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Excelutil 
{
	WebDriver driver;
	public void Exceldata(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	File f1=new File("C:/Users/RAMESH/git/Testproject/Automation2/src/Exceldata/Exceltoapp.xlsx");
	FileInputStream fis=null;
	XSSFWorkbook wb=null;
	XSSFSheet s1=null;
	public void Exceldata(String url)
	{
		
		File f1=new File(url);
		FileInputStream fis;
		XSSFWorkbook wb;
		XSSFSheet s1;
		
	}
	

}
