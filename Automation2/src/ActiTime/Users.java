package ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.actitime.pages.Loginpagenew;

import Helper.BrowserFactory;
import lib.Exceldataconfig;

public class Users
{
	public static void main(String[]args)
	{
		
		 Exceldataconfig data=new Exceldataconfig("C://Automationworkspace2//Automation2//src//Exceldata//Exceltoapp.xlsx");
		 int rowcount=data.
			for(int rownum=1;rownum<=rowcount;rownum++)
			{
				
			}
		 String username=data.getdata(0, 1, 0);
		 System.out.println(username);
		 String firstname=data.getdata(0, 1, 1);
		 System.out.println(firstname);
		 String lastname=data.getdata(0, 1, 2);
		 System.out.println(lastname);
		 String middleinitial=data.getdata(0, 1, 3);
		 System.out.println(middleinitial);
		 String email=data.getdata(0, 1, 4);
		 System.out.println(email);
		  WebDriver driver=BrowserFactory.startbrowser("Firefox", "http://ramesh-pc/login.do");
			Loginpagenew login=PageFactory.initElements(driver, Loginpagenew.class);
			login.loginactitime("admin", "manager");
			 driver.findElement(By.linkText("Users")).click();
			 driver.findElement(By.xpath("//input[@type='button']")).click();
		     driver.findElement(By.name("username")).sendKeys(username);
		     driver.findElement(By.name("firstName")).sendKeys(firstname);
		     driver.findElement(By.name("lastName")).sendKeys(lastname);
		     driver.findElement(By.name("middleName")).sendKeys(middleinitial);
		     driver.findElement(By.xpath("//input[@maxlength='255']")).sendKeys(email);
    }

}
