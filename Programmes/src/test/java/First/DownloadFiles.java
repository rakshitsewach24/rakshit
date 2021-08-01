package First;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
//import org.testng.annotations.*;
public class DownloadFiles {
	@Test
	public void downloadFile()
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rakshit248\\\\Downloads\\\\SOFTWARE\\\\chromedriver_win32\\\\chromedriver.exe");

	WebDriver driver;

	driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/download.html");
	driver.findElement(By.linkText("Download Excel")).click();
	File f1 = new File("C:\\Users\\Hero\\Downloads");
	File[] var_files = f1.listFiles();
	for(File type_file : var_files)
	{
	if(type_file.getName().equalsIgnoreCase("testleaf.xlsx"));
	System.out.println("File exist in Downloads");
	break;
	}
	}
}
