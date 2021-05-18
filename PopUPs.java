package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUPs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/rising-wolf-men-brown-casual/"
				+ "p/itmfe2c0549cb6c2?pid=SNDFBGYGWFYR3CNU&lid=LSTSNDFBGYGWFYR3CNUSI"
				+ "AMNE&marketplace=FLIPKART&srno=b_1_3&otracker=hp_omu_Men%2527s%2BFootwear%2B_1_9.dealCard.OMU_PXQAH2J1349T_5&otracker1=hp_omu_WHITELISTED_neon%2Fmerchandising_Men%2527s%2BFootwear%2B_NA_dealCard_cc_1_NA_view-all_5&fm=neon%2Fmerchandising&iid=67a7c3d5-6a1c-44a8-844d-fea0a86c7bd7.SNDFBGYGWFYR3CNU.SEARCH&ppt=browse&ppn=browse&ssid=m0w3p17t800000001610122290532");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='Bv11UC']//span[@class='question'])[1]")).click();
		Thread.sleep(3000);
		String group=driver.findElement(By.xpath("//div[@class='_2JH8X1']")).getText();
		System.out.println(group);
		driver.close();

		}

}
