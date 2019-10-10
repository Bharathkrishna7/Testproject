package Exceldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.naveenexcelutility;

public class amazonlogin
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		naveenexcelutility excel=new naveenexcelutility("C:\\Users\\RAMESH\\git\\Testproject\\Automation2\\src\\Exceldata\\amazon.xlsx");
		int sheetname=excel.getRowCount("amazonlogin");
		System.out.println(sheetname);
        driver.get("https://www.google.com/search?q=amazon&rlz=1C1CHBD_enIN734IN745&oq=a&aqs=chrome.0.69i59l2j69i61l3j69i65.976j0j7&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.xpath("//h3[@class='sA5rQ']")).click();
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Sign In')]")).click();
		String number=excel.getCellData("amazonlogin", "Mobile number", 2);
		System.out.println(number);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(number);
		driver.findElement(By.id("continue")).click();
		String password=excel.getCellData("amazonlogin", "password", 2);
		System.out.println(password);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(password);       
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

}
