package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class FirstTest {
	public static WebDriver driver;
	
	@Parameters("Sbrowser")
	@BeforeClass
	public void setup(String Sbrowser)
	{
		if(Sbrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (Sbrowser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://www.google.co.in");
		//WebDriverWait wait = new WebDriverWait(driver,20);
		
	}
	
	@Test
	public void tc_1()
	{
	  
		driver.findElement(By.name("q")).sendKeys("selenium");
		//Assert.assertEquals("Hi", "Hello");
		}
	
	@Test
	public void tc_2()
	{
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	

}
