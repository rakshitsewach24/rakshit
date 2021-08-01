package StepDef2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step2 {
	WebDriver d1;

@Given("Open Chrome and url of the application")
public void open_chrome_and_url_of_the_application() {
    // Write code here that turns the phrase above into concrete actions
    
	  
	   System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
	

	d1=new ChromeDriver();
	d1.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
}
@When("Enter username and password")
public void enter_username_and_password() {
	
	d1.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("9412183143");
}
@Then("login to account")
public void login_to_account() {
	 
	d1.findElement(By.xpath("//*[@class=\"submitBottomOption\"]"));
}
}
