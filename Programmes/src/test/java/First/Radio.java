package First;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Radio {
	@Test

	   public void script1() throws InterruptedException {

	    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.leafground.com/pages/radio.html");
		 
		// driver.findElement(By.linkText("Button")).click();
		 
		 driver.findElement(By.xpath("//input[@id='yes']")).click();
		 
		Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//input[@id='no']")).click();
		
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//input[@name='news']")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//input[@value='0']")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//input[@name='age']")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//input[@value='1']")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//input[@value='2']")).click();
		 
		 
}
}
