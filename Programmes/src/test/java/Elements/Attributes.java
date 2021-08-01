package Elements;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Attributes {
	@FindBy(xpath="//input[@type='tel']")
	public static WebElement  emailid;
	
	@FindBy(xpath="//div[@class='submitBottomOption']")
	public static WebElement login_button;

	
	/*public static WebElement emailid(WebDriver driver) {
		
	return	driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
	}
	
	public  static WebElement login_button(WebDriver driver) {
		
		  return driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		  
		  
	}
	*/
}
