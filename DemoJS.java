package dataDriven;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoJS {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//button[@id='u_0_b']"));
		JSUtil.Flash(element, driver);
		JSUtil.drawBorder(element, driver);
		WebElement text = driver.findElement(By.xpath("//a[text()='Help']"));
		JSUtil.scrolpage(text, driver);
		//element.click();
		//JSUtil.generateAltert(driver,"You clicked sing in button");
		/*try {
		element.click();
		}
		catch(UnhandledAlertException f)
		{
			try
			{
				JSUtil.generateAltert(driver,"You clicked sing in button");
			}
			catch(NoAlertPresentException e)
			{
				e.printStackTrace();
			}
		}
		
		JSUtil.generateAltert(driver,"You clicked sing in button");
	
	/*	File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("C:\\Users\\cutem\\Desktop\\Selenium\\screenshot.png"));
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\cutem\\Desktop\\Selenium\\screenshot.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	*/
					
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	

}

