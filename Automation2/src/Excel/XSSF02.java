package Excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Helper.BrowserFactory;
import Helper.Loginpagenew;

public class XSSF02 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=BrowserFactory.startbrowser("Firefox", "http://ramesh-pc/login.do");
		Loginpagenew login=PageFactory.initElements(driver, Loginpagenew.class);
		login.loginactitime("admin", "manager");
		driver.findElement(By.linkText("My Account")).click();
		File f1=new File("C:/Users/RAMESH/git/Testproject/Automation2/src/Exceldata/Exceltoapp.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s1=wb.getSheetAt(1);
	     int rowcount=s1.getLastRowNum();
	     System.out.println("number of rows "+rowcount);	
           for(int i=1;i<=rowcount;i++)
  	     {
      	     String currentpassword=s1.getRow(i).getCell(0).getStringCellValue();
      	     System.out.println("data in excel is "+currentpassword);
      	     String newpassword=s1.getRow(i).getCell(1).getStringCellValue();
    	     System.out.println("data in excel is "+newpassword);
    	     String retypepassword=s1.getRow(i).getCell(2).getStringCellValue();
      	     System.out.println("data in excel is "+retypepassword);
      	     String firstname=s1.getRow(i).getCell(3).getStringCellValue();
    	     System.out.println("data in excel is "+firstname);
    	     String lastname=s1.getRow(i).getCell(4).getStringCellValue();
    	     System.out.println("data in excel is "+lastname);
    	     String middleinitial=s1.getRow(i).getCell(5).getStringCellValue();
    	     System.out.println("data in excel is "+middleinitial);
    	     String mailaddress=s1.getRow(i).getCell(6).getStringCellValue();
    	     System.out.println("data in excel is "+mailaddress);
    	    // String phone=s1.getRow(i).getCell(7).getStringCellValue();
    	     //System.out.println("data in excel is "+phone);
    	     //String fax=s1.getRow(i).getCell(8).getStringCellValue();
    	     //System.out.println("data in excel is "+fax);
    	     //String mobile=s1.getRow(i).getCell(9).getStringCellValue();
    	     //System.out.println("data in excel is "+mobile);
    	     driver.findElement(By.xpath("//input[@type='password']")).clear();
    	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys(currentpassword);
    	     driver.findElement(By.xpath("//input[@type='password']")).clear();
    	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys(newpassword);
    	     driver.findElement(By.xpath("//input[@type='password']")).clear();
    	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys(retypepassword);
    	     driver.findElement(By.xpath("//input[@type='text']")).clear();
             driver.findElement(By.xpath("//input[@type='text']")).sendKeys(firstname);
             driver.findElement(By.xpath("//input[@type='text']")).clear();
    	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys(lastname);
    	     driver.findElement(By.xpath("//input[@type='text']")).clear();
    	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys(middleinitial);
    	     //driver.findElement(By.xpath("//input[@type='text']")).clear();
    	     //driver.findElement(By.xpath("//input[@type='text']")).sendKeys(phone);
    	     //driver.findElement(By.xpath("//input[@type='text']")).clear();
    	     //driver.findElement(By.xpath("//input[@type='text']")).sendKeys(fax);
    	     //driver.findElement(By.xpath("//input[@type='text']")).clear();
    	     //driver.findElement(By.xpath("//input[@type='text']")).sendKeys(mobile);
    	}
      wb.close();
	}
}
