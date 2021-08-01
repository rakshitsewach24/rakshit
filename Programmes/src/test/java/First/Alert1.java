package First;
//import org.junit.Test;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert1 {
	@Test

	   public void script1() {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.leafground.com/pages/Alert.html");
		 
		 driver.findElement(By.xpath("//button[@onclick='normalAlert']")).click();
		 
		Alert1 alert=  (Alert1) driver.switchTo().alert();
		
		String alertMessage= driver.switchTo().alert().getText();
		
		System.out.println(alertMessage);
		
		( (org.openqa.selenium.Alert) alert).accept();
}
}
