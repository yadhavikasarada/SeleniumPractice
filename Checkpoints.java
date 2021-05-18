package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkpoints {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Workspace\\daraTest\\driver\\geckodriver.exe");
		ProfilesIni profile = new ProfilesIni();

		FirefoxProfile myprofile = profile.getProfile("Automation");//(here u have to give ur own profile name)
		myprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		myprofile.setPreference("browser.download.folderList",0 );
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(myprofile);
		driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.selenium.dev/downloads/");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

}
