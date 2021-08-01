package First;
//import org.junit.Test;
import org.testng.annotations.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {
	@Test
	
	  public void script1()  {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
			 
			 WebDriver driver=new ChromeDriver();
			 
			 
			 driver.get("http://demo.automationtesting.in/Datepicker.html");
			 
			 JavascriptExecutor jse=(JavascriptExecutor ) driver;
			 
			 jse.executeScript("document.getElementById('datepicker1').value='29/08/2017'");
			 
			 
			 
}
}
