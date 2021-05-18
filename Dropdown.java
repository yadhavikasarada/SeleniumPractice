package dataDriven;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/");
		WebElement menu = driver.findElement(By.xpath("//button[@class='lines-button minus focused']"));

		menu.click();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.xpath("//a[text()='Tools']")).sendKeys(selectLinkOpeninNewTab);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> allwindows = windows.iterator();
		String home = allwindows.next();
		String tools = allwindows.next();
		driver.switchTo().window(tools);
		Thread.sleep(2000);

		driver.quit();

	}

}
