package dataDriven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Workspace\\daraTest\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("https://krninformatix.com/");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File destFile = new File("C:\\Users\\cutem\\Desktop\\Selenium\\screenshot.png");
		 FileUtils.copyFile(src, destFile);
		 driver.close();
		 
		 //TakesScreenshot scrShot =((TakesScreenshot)driver);

	}

}
