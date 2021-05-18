package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FiledownloadPopup {

	public static void main(String[] args) {
		FirefoxOptions opt = new FirefoxOptions();

		opt.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		opt.addPreference("browser.download.folderList",2);
		opt.addPreference("browser.download.dir", "C:\\Users\\cutem\\Desktop\\Selenium");
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Workspace\\daraTest\\driver\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver(opt);
		
		driver.get("https://krninformatix.com/download.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@href='https://goo.gl/uJJ5Sc']")).click();
		driver.close();
		

	
	}

}
