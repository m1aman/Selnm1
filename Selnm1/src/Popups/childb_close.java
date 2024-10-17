package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childb_close 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	String p_id = driver.getWindowHandle();
	driver.findElement(By.xpath("//a[.='Meta Pay']")).click();
	Set<String> all_wd = driver.getWindowHandles();
	
	for(String wd:all_wd)
	{
		Thread.sleep(2000);
		driver.switchTo().window(wd);
		if(!p_id.equals(wd))
		{
			driver.close();
		}
	}
	
	driver.switchTo().window(p_id);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Meta Pay']")).click();
	Set<String> all_wd2 = driver.getWindowHandles();
	
	for(String wd2:all_wd2)
	{
		Thread.sleep(2000);
		driver.switchTo().window(wd2);
	}
	
	Thread.sleep(2000);
	driver.close();
	}
}
