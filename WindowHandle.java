package dataDriven;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.air.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Tour Packages']")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> allwindows = windows.iterator();
		String Homepage = allwindows.next();
		String tourpackages = allwindows.next();
		driver.switchTo().window(tourpackages);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-target='#sign-in']")).click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(Homepage);

	}

}
