package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail  {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver;
	
	
	
		
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);
		Actions act = new Actions(driver);
		
		
		driver.get("https://www.jcpenney.com");
		/*Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();*/
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='button']/button")));
	    WebElement button = driver.findElement(By.xpath("//*[@id='button']/button"));
		System.out.println(button.getText());
		button.click();
		driver.close();
		driver.quit();
		
	}

}
