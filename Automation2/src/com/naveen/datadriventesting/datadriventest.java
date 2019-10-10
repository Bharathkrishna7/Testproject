package com.naveen.datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.naveenexcelutility;

public class datadriventest
{
  public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?acntType=business&_trksid=p2052190.l44594");
		naveenexcelutility exceldata=new naveenexcelutility("C:\\Users\\RAMESH\\git\\Testproject\\Automation2\\src\\Exceldata\\ebay.xlsx");
		  int rowcount=exceldata.getRowCount("Ebayregister");
		for(int rownum=2; rownum<=rowcount; rownum++ )
		{
		    String bname=exceldata.getCellData("Ebayregister", "Legal business name", rownum);
			System.out.println(bname);
			String bemail=exceldata.getCellData("Ebayregister", "Legal business email", rownum);
			System.out.println(bemail);
			String remail=exceldata.getCellData("Ebayregister", "Reenter email", rownum);
		    System.out.println(remail);
	   	    String password=exceldata.getCellData("Ebayregister", "password", rownum);
		    System.out.println(password);
		   // String bphone=exceldata.getCellData("Ebayregister", "Legal business phone", rownum);
			//System.out.println(bphone);
		    driver.findElement(By.xpath("//input[@id='businessname']")).clear();
            driver.findElement(By.xpath("//input[@id='businessname']")).sendKeys(bname);
            driver.findElement(By.xpath("//input[@id='businessemail']")).clear();
            driver.findElement(By.xpath("//input[@id='businessemail']")).sendKeys(bemail);
            driver.findElement(By.xpath("//input[@id='rbusinessemail']")).clear();
		   driver.findElement(By.xpath("//input[@id='rbusinessemail']")).sendKeys(remail);
		   driver.findElement(By.xpath("//input[@id='PASSWORD_BIZREG']")).clear();
		   driver.findElement(By.xpath("//input[@id='PASSWORD_BIZREG']")).sendKeys(password);
		   //Select select= new Select(driver.findElement(By.xpath("//li[@class='country active highlight']")));
		   //select.selectByVisibleText(bphone);
		}	
	}
}
