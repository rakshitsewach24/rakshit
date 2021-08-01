package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step1 {
	WebDriver d1;
	
	@Given("Open Chrome and url of the application")
	public void open_chrome_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
	

	d1=new ChromeDriver();
	d1.get("https://www.amazon.in/");
	}
		
	
	@When("Enter username and password")
	public void enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	
	d1.findElement(By.xpath("//span [@id=\'nav-link-accountList-nav-line-1\']")).click();
	
	}
	
	@Then("login to account")
	public void login_to_account() {
	    // Write code here that turns the phrase above into concrete actions
	   
	
	    d1.findElement(By.id("ap_email")).sendKeys("rsewach@gmail.com");
	
	

	}

}
