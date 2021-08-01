package First;
//import org.junit.Test;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation {
	@Test

	   public void script1() {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.leafground.com/");
		 
		 driver.navigate().back();
		 
		 driver.navigate().forward();  
		 
		 driver.navigate().refresh();
		 
		 driver.navigate().to("https://www.irctc.co.in/nget/");
		 
		 driver.manage().window().maximize();
		 
		 
		 

	}
}
