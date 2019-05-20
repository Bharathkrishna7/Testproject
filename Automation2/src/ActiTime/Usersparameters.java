package ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.actitime.pages.Loginpagenew;

import Helper.BrowserFactory;

public class Usersparameters 
{
	public static void main(String[]args)
	{
		 WebDriver driver=BrowserFactory.startbrowser("Firefox", "http://ramesh-pc/login.do");
			Loginpagenew login=PageFactory.initElements(driver, Loginpagenew.class);
			login.loginactitime("admin", "manager");
			 driver.findElement(By.linkText("Users")).click();
			 driver.findElement(By.xpath("//input[@type='button']")).click();
		  
		Xls_Reader1 data=new Xls_Reader1("C://Automationworkspace2//Automation2//src//Exceldata//Exceltoapp.xlsx");
		int rowcount=data.getRowCount("0");
		for(int rownum=1;rownum<=rowcount;rownum++)
		{
			String username=data.getCellData(0, 0, rownum);
			System.out.println(username);
			String firstname=data.getCellData(0, 1, rownum);
			System.out.print(firstname);
		    String lastname=data.getCellData(0, 2, rownum);
			 System.out.println(lastname);
			 String middleinitial=data.getCellData(0, 3, rownum);
			 System.out.println(middleinitial);
			 String email=data.getCellData(0, 4, rownum);
			 System.out.println(email);
			   driver.findElement(By.name("username")).sendKeys(username);
			     driver.findElement(By.name("firstName")).sendKeys(firstname);
			     driver.findElement(By.name("lastName")).sendKeys(lastname);
			     driver.findElement(By.name("middleName")).sendKeys(middleinitial);
			     driver.findElement(By.xpath("//input[@maxlength='255']")).sendKeys(email); 
	             	
			
		}
		 
	}

}
