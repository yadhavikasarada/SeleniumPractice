package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSUtil {
 public static void Flash(WebElement element,WebDriver driver)
 
 {
	 String bgcolor= element.getCssValue("backgroundColor");
	 System.out.println(bgcolor);
	 for(int i=0;i<5;i++) {
		 changeColor("#000000",element,driver);
		 changeColor(bgcolor,element,driver);
	 }
	 
	 
 }
 public static void changeColor(String color,WebElement element,WebDriver driver)
 {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].style.backgroundColor = '"+ color +"'",element);
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	 public static void drawBorder(WebElement element,WebDriver driver)
	 {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].style.border='3px solid red'",element);

	 }
	 public static void clickElement(WebElement element,WebDriver driver)
	 {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].click();",element);
	 }
	 public static void generateAltert(WebDriver driver, String message)
	 {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("alert('"+ message +"')");
	 }
	 public static void refreshPage(WebDriver driver)
	 {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("history.go(0)");
	 }
	 public static void scrolpage(WebElement element,WebDriver driver)
	 {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].scrollIntoView(true);", element);
	 }
}
