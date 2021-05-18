package dataDriven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FireMouseover {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Workspace\\daraTest\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement course = driver.findElement(By.xpath("//span[text()='Courses Offered']"));
		Actions act = new Actions(driver);
		act.moveToElement(course).perform();
		// Thread.sleep(2000);
		WebElement software = driver.findElement(By.xpath("//span[text()='Software Testing']"));
		act.moveToElement(software).perform();
		WebElement automation = driver.findElement(By.xpath("//a[text()='Automation Testing']"));
		act.moveToElement(automation).perform();
		act.contextClick(automation).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\cutem\\Desktop\\Selenium\\screenshot.png");
		FileUtils.copyFile(src, destFile);

		driver.close();

	}

}
