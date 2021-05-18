package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	@Test
	public  void mouseTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement course = driver.findElement(By.xpath("//span[text()='Courses Offered']"));
		Actions act = new Actions(driver);
		act.moveToElement(course).perform();
		Thread.sleep(2000);
		WebElement software = driver.findElement(By.xpath("//span[text()='Software Testing']"));
		act.moveToElement(software).perform();
		WebElement automation = driver.findElement(By.xpath("//a[text()='Automation Testing']"));
		act.moveToElement(automation).perform();
		act.contextClick(automation).perform();
		act.sendKeys("T").perform();
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);
		driver.close();

		/*
		 * WebElement branches =
		 * driver.findElement(By.xpath("//a[@class='dropdown-toggle'and@role='button']")
		 * ); Actions act = new Actions(driver); act.moveToElement(branches).perform();
		 * WebElement maratha =
		 * driver.findElement(By.xpath("//span[text()='Marathahalli']"));
		 * act.moveToElement(maratha).perform(); act.contextClick(maratha).perform();
		 * Thread.sleep(1000); act.sendKeys(Keys.ARROW_DOWN).perform();
		 * act.sendKeys(Keys.ENTER).perform();
		 */

	}

}
