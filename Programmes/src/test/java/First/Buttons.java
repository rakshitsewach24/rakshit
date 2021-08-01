package First;

//import org.junit.Test;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
	@Test

	   public void script1() {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
		 
		 WebDriver f1=new ChromeDriver();
		 
	
		 
		 f1.get("http://www.leafground.com/");
		 
		 f1.findElement(By.linkText("Edit")).click();
		 
	     f1.findElement(By.id("email")).sendKeys("rakshit248@gmail.com");
	     
	     f1.findElement(By.cssSelector("input[value='Append']")).clear();
	     
	     f1.findElement(By.cssSelector("input[value='Append']")).sendKeys("rakshit");
	     
	     f1.findElement(By.name("username")).click();
	     
	     f1.findElement(By.name("username")).sendKeys("script");
	     
	     f1.findElement(By.xpath("//input[@name='username'][1]")).sendKeys("clear");
		 
		 
	}
}
