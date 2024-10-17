package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DWS_traverse 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();

	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	Thread.sleep(2000);
	
	
}

}
