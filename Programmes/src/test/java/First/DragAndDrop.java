package First;
//import org.junit.Test;
import org.testng.annotations.*;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop {
	@Test
    public void script1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.get("http://www.leafground.com/pages/drop.html");
        
        Actions drop=new Actions(driver);
        
        WebElement dra=driver.findElement(By.id("draggable"));
        
        WebElement dop=driver.findElement(By.id("droppable"));
        
        Thread.sleep(3000);
        
        drop.dragAndDrop(dra, dop).perform();
        
        Thread.sleep(3000);
        
        //drag the element to an axis.
        driver.navigate().to("http://www.leafground.com/pages/drag.html");
       
        WebElement A=driver.findElement(By.id("draggable"));
        Actions drag=new Actions(driver);
        
        drag.moveToElement(A, 473, 217).build().perform();
              

}

}
