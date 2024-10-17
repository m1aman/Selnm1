package Synchronisation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//Implicitly wait
public class Shoppersstack_Iwait 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//button[@name='login']")).click();

	Thread.sleep(2000);
	driver.close();	
	

}
}
