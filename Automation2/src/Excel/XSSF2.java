package Excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.actitime.pages.Loginpagenew;

import Helper.BrowserFactory;

public class XSSF2
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=BrowserFactory.startbrowser("Firefox", "http://ramesh-pc/login.do");
		Loginpagenew login=PageFactory.initElements(driver, Loginpagenew.class);
		login.loginactitime("admin", "manager");
		 driver.findElement(By.linkText("Users")).click();
		 driver.findElement(By.xpath("//input[@type='button']")).click();
		File f1=new File("C:/Users/RAMESH/git/Testproject/Automation2/src/Exceldata/Exceltoapp.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s1=wb.getSheetAt(0);
	     int rowcount=s1.getLastRowNum();
	     System.out.println("number of rows "+rowcount);
	     for(int i=1;i<=rowcount;i++)
	     {
	     String username=s1.getRow(i).getCell(0).getStringCellValue();
	     System.out.println("data in excel is "+username);
	     String firstname=s1.getRow(i).getCell(1).getStringCellValue();
	     System.out.println("data in excel is "+firstname);
	     String lastname=s1.getRow(i).getCell(2).getStringCellValue();
	     System.out.println("data in excel is "+lastname);
	     String middleinitial=s1.getRow(i).getCell(3).getStringCellValue();
	     System.out.println("data in excel is "+middleinitial);
	     String email=s1.getRow(i).getCell(4).getStringCellValue();
	     System.out.println("data in excel is "+email);
	     driver.findElement(By.name("username")).clear(); 
	     driver.findElement(By.name("username")).sendKeys(username);
	     driver.findElement(By.name("firstName")).clear();
	     driver.findElement(By.name("firstName")).sendKeys(firstname);
	     driver.findElement(By.name("lastName")).clear();
	     driver.findElement(By.name("lastName")).sendKeys(lastname);
	     driver.findElement(By.name("middleName")).clear();
	     driver.findElement(By.name("middleName")).sendKeys(middleinitial);
	     driver.findElement(By.xpath("//input[@maxlength='255']")).clear();
	     driver.findElement(By.xpath("//input[@maxlength='255']")).sendKeys(email); 
	     }
	   wb.close();
  }
}
