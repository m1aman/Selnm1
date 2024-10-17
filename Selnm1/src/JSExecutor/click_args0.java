package JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class click_args0 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	JavascriptExecutor js= (JavascriptExecutor) driver;
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.name("login"));
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();",ele);
	
	Thread.sleep(4000);
	driver.close();		
}
}
