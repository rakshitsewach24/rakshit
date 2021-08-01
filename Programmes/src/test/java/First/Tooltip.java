package First;
//import org.junit.Test;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
	@Test
	
	  public void script1()  {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
			 
			 WebDriver driver=new ChromeDriver();
			 
			 
			 driver.get("http://www.leafground.com/pages/tooltip.html");
			 
			WebElement el1= driver.findElement(By.id("age"));
			 
		String msg=	el1.getAttribute("title");
		
}}
