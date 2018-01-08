package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
	
	@Test
	public void tc_3() throws Exception
	{
		FirstTest.driver.findElement(By.partialLinkText("Downloads")).click();
		Thread.sleep(1500);
		FirstTest.driver.close();
	}

}
