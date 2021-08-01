package First;
//import org.junit.Test;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	@Test

	   public void script1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.leafground.com/");
		 
		 
		 driver.findElement(By.linkText("Edit")).click();
		 
		 WebDriverWait var_Wait=new WebDriverWait(driver,20);
		 
		 var_Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		 
		 Thread.sleep(3000);
		 
		 
		// var_Wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));  For Button
		 
		// var_Wait.until(ExpectedConditions.elementToBeSelected(By.id("email")));   For TextBox
		 
		// var_Wait.until(ExpectedConditions.alertIsPresent());   For POP
		 
		// var_Wait.until(ExpectedConditions.numberOfWindowsToBe(2));  For MultipleWindow
		 
	     driver.findElement(By.id("email")).sendKeys("rakshit248@gmail.com");
	     

}
}
