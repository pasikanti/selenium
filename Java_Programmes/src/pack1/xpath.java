package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xpath {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.guru99.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new  WebDriverWait(driver, 20);
		
		
		driver.close();
		driver.quit();
}
}
