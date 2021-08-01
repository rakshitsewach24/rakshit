package First;
//import org.junit.Test;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrderList {
	@Test

	   public void script1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 
		 driver.get("http://demo.automationtesting.in/Selectable.html");
		 
		 java.util.List<WebElement> ele1 =driver.findElements(By.xpath("//*[@id='Serialize']/ul/li"));
		 
		 driver.findElement(By.linkText("Serialize")).click();
		    
		 int size_list =ele1.size();
		 System.out.println(size_list);

		 Actions act1=new Actions(driver);
		 
		 act1.keyDown(Keys.CONTROL)
		 
		 .click(ele1.get(0))
		 .click(ele1.get(2))
		 .click(ele1.get(4))
		 .click(ele1.get(6))
		 .build().perform();
			 
}
}
