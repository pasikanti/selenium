package TestScripts;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter  {
	
	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Case Failed: "+ tr.getName());
		File scr = ((TakesScreenshot)FirstTest.driver).getScreenshotAs(OutputType.FILE);
		
			try {
				FileUtils.copyFile(scr, new File("D:\\GopiFrameWork"+tr.getName()+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test Case Sucess: "+tr.getName());
	}

}
