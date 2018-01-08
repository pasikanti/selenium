package pack1;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

public class amazon {
	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver;
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.pollingEvery(20, TimeUnit.SECONDS);
			//wait.ignoring(NoSuchElementException);
	//-------------------web is launched ------------------------//
		
		String title = driver.getTitle();
		String actual ="Online Shopping: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if (title.equals(actual))
		{
			System.out.println("Given Url displayed");
		}
		else
		{
			System.out.println("Given Url NOT displayed");
		}
		
	//-------------title verified------------------------------//
		Actions act = new Actions(driver);
		WebElement k= driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[1]"));
		Thread.sleep(2000);
		act.moveToElement(k).build().perform();
		k.click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
