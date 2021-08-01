package First;
//import org.junit.Test;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
	@Test

	   public void script1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.leafground.com/pages/Edit.html");
		 
		 WebElement ele1=driver.findElement(By.id("email"));
		 
	     Actions act1=new Actions(driver);
	
	     act1.sendKeys(ele1,"Rakshit").doubleClick(ele1)
	     .build().perform();
	     
	     
	}	
}
