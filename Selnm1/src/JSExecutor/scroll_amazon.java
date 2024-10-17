package JSExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scroll_amazon 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	JavascriptExecutor js= (JavascriptExecutor) driver;
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-500)");
	
	Thread.sleep(4000);
	driver.close();		
}
}
