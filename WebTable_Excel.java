package dataDriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Excel {
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		//div[@id="leftcontainer"]/table/tbody/tr[2]/td[3]
         String  beforeXpath = "//div[@id='leftcontainer']/table/tbody/tr[";
         String AfterXpath ="]/td[1]";
         ////*[@id="leftcontainer"]/table/tbody/tr[1]/td[3]
         String Beforexpath_closeRate="//*[@id=\"leftcontainer\"]/table/tbody/tr[";
         String AfterXpath_CloseRate="]/td[3]";
         List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
         System.out.println("total number of rows:"+rows.size());
         int rowcount = rows.size();
         String path = System.getProperty("user.dir");         
         Xls_Reader reader = new Xls_Reader(path+"/excel/data1.xlsx");
         
         if(!reader.isSheetExist("GuruTable"))
         {
        	 reader.addSheet("GuruTable");
        	 reader.addColumn("GuruTable", "CompanyName");
        	 reader.addColumn("Gurutable", "ClosePoint");
        	 
         }
        
         
        
       for(int i=2;i<rowcount;i++)   
       {
    	 String actualXpath_Company=beforeXpath+i+AfterXpath;
    	 String Companyname = driver.findElement(By.xpath(actualXpath_Company)).getText();
    	 System.out.println(Companyname);
    	 reader.setCellData("GuruTable","CompanyName", i, Companyname);
    	 String ActualXpath_CoseRate = Beforexpath_closeRate+i+AfterXpath_CloseRate;
    	String CloserRate = driver.findElement(By.xpath(ActualXpath_CoseRate)).getText();
    	 	System.out.println(CloserRate);
    	reader.setCellData("GuruTable", "ClosePoint", i, CloserRate);
       }
      
       driver.close();
	}
	
	
	
}
