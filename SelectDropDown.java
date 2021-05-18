package dataDriven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.tripadvisor.com/Hotels-g34438-Miami_Florida-Hotels.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='_2AGh2u0d']")).click();
		WebElement bestvalue = driver.findElement(By.xpath("//span[@class='_3hIZ3UDf _10lMSzUK']"));
		 Select dropdown = new Select(bestvalue);
		 dropdown.selectByVisibleText("Price (low to high)");
		 Thread.sleep(1000);
		List<WebElement> alloptions = dropdown.getOptions();
		int count = alloptions.size();
		for( int i =0;i<=count;i++) {
			WebElement options = alloptions.get(i);
			String values = options.getText();
			System.out.println(values);
			driver.close();
		}
		
		 


	}

}
