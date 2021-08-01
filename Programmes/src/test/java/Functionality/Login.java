package Functionality;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Elements.Attributes;
public class Login {
	@Test
	
	
	 public void F1() {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");

		PageFactory.initElements(driver,Attributes.class);
		
		Attributes.emailid.sendKeys("Rakshit248@gmail.com");
		
	    Attributes.login_button.click();
	    
      /*Attributes.emailid(driver).sendKeys("Rakshit248@gmail.com");
		
	    Attributes.login_button(driver).click();*/
	}
}
