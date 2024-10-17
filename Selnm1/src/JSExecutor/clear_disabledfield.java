package JSExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clear_disabledfield 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/Nagendra%20Kr%20Ojha/Desktop/Selenium_all.html");
	JavascriptExecutor js= (JavascriptExecutor) driver;
	Thread.sleep(2000);
	js.executeScript("document.getElementById('a1').value=''");
	
	Thread.sleep(4000);
	driver.close();		
}
}
