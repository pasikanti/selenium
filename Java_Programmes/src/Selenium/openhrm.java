package Selenium;

import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class openhrm 
{
	public static void main(String[] args) throws Exception {
		System.setProperty("chrome.driver.webdriver", "E:\\chromedriver.exe");
		WebDriver Browser ;
		Browser = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(Browser, 10);
		
	//Select sel = new Select(element);
		
		
		Browser.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtUsername")));
		Browser.findElement(By.id("txtUsername")).sendKeys("user01");
		Browser.findElement(By.id("txtPassword")).sendKeys("pass1234");
		Browser.findElement(By.id("btnLogin")).click();
		
		
				
		WebElement leave = Browser.findElement(By.id("menu_leave_viewLeaveModule"));
		
		Actions act = new Actions(Browser);
		act.moveToElement(leave).build().perform();
		
		Assert.assertTrue(false);
		
		//Alert alt = Browser.switchTo().alert();
				
		WebElement applyleave = Browser.findElement(By.id("menu_leave_applyLeave"));
		
		act.moveToElement(applyleave).build().perform();
		act.click().build().perform();;
		
		
		//-----------------//
		wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//*[@id='apply-leave']/div[1]/h1"), "Apply Leave"));
		
		WebElement select = Browser.findElement(By.id("applyleave_txtLeaveType"));
		Select sel = new Select(select);

		
		List <WebElement>leavelist= sel.getOptions();
		for (WebElement list : leavelist) {
			System.out.println(list.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}