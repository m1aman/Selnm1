package Synchronisation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//Implicitly wait
public class Shoppersstack_Ewait2 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	WebDriverWait w= new WebDriverWait(driver, 15);	
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	driver.close();	
	

}
}
