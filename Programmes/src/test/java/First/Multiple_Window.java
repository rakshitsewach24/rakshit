package First;
import java.util.Iterator;
import java.util.Set;

//import org.junit.Test;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Multiple_Window {
	@Test

	   public void script1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.leafground.com/pages/Window.html");
		 
		 driver.findElement(By.id("home")).click();
		 
		 Thread.sleep(3000);
		 
		Set<String> window_value=driver.getWindowHandles();
		
		Iterator<String> iter=window_value.iterator();
		
		String w1=iter.next();
		
		String w2=iter.next();
		
		driver.switchTo().window(w2);
		
		System.out.println(w1);
		
		System.out.println(w2);
		
		String tittle_child=driver.getTitle();
		
		System.out.println(tittle_child);
		
		String url=driver.getCurrentUrl();
		
		String sou=driver.getPageSource();
		
		System.out.println(url);
		
		System.out.println(sou);
		 
}
}
