package First;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	@Test

	   public void script1() {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.leafground.com/pages/checkbox.html");
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
}
}
