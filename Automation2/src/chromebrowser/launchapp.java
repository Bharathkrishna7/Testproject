package chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchapp 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ramesh-pc/login.do");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.close();
	}

}
