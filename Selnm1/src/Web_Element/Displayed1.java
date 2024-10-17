package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Displayed1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	
	Thread.sleep(2000);
	driver.get("file:///C:/Users/Nagendra%20Kr%20Ojha/Desktop/Blankpg.html");	
	
	driver.findElement(By.xpath("//input[@type='text']"));
	Thread.sleep(2000);
	
	driver.close();	
}
}
