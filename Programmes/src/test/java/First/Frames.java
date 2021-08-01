package First;
//import org.junit.Test;
import org.testng.annotations.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {
	@Test

	   public void script1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 
		 driver.get("http://www.leafground.com/pages/frame.html");
		 
		 driver.switchTo().frame(0);
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("click")).click();
		
		 driver.switchTo().defaultContent();
		 
		 
		 
		 
}
}
