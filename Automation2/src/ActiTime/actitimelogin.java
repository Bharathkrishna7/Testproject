package ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.naveenexcelutility;

public class actitimelogin 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		naveenexcelutility data=new naveenexcelutility("C:\\Users\\RAMESH\\git\\Testproject\\Automation2\\src\\Exceldata\\ActitimeLogin.xlsx");
	   int  row=data.getRowCount("Actimelogindata");
	  for(int i=2;i<=row;i++)
	   {
		  driver.get("http://ramesh-pc/login.do");
		String username=data.getCellData("Actimelogindata", "username", i);
	    System.out.println(username);
	    String password=data.getCellData("Actimelogindata", "password", i);
	    System.out.println(password);
	    driver.findElement(By.xpath("//input[@name='username']")).clear();
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@name='pwd']")).clear();
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	   }
	}
  }
