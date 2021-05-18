package dataDriven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class spicejet {
	static WebDriver driver;
	public static void main(String[] args)
			{
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
	 driver.get("https://www.spicejet.com/");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
	 String month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
	 System.out.println("month is"+month);
	 String year = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
	 System.out.println("yesr is "+year);
	 List<WebElement> tablerow = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]//tr"));
	 int row = tablerow.size();
	String expMonth = "January";
	String expYear ="2021";
	String day = "26";
	String beforeXpath ="//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[";
	String afterXpath="]/td[";
	String dayVal= null;
	boolean flag= false;
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(expMonth.equals(expMonth)&&expYear.equals(expYear))
	{
		for(int i=4;i<row;i++)
		{
			for(int j=1;j<8;j++)
			{
				dayVal=driver.findElement(By.xpath(beforeXpath+i+afterXpath+j+"]/a")).getText();
				//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[4]/td[3]/a
				if(dayVal.equals(day))
				{
					driver.findElement(By.xpath(beforeXpath+i+afterXpath+j+"]/a")).click();
					flag = true;
					break;
					
				}
				if(flag)
				{
					break;
				}
			}
		}
	}
	else
	{
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all'and @data-handler='next']")).click();
	}
	driver.close();
	
			}
	
}



