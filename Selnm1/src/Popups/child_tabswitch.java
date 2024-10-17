package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class child_tabswitch 
{
	public static void main(String[] args) throws InterruptedException 
	{	
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.naukri.com/");
	driver.findElement(By.xpath("//div[.='Services']")).click();
	Set<String> allid = driver.getWindowHandles();
	ArrayList<String> l= new ArrayList<String>(allid);
	
	String cid = l.get(1);
	driver.switchTo().window(cid);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='LOGIN']")).click();
	
	Thread.sleep(4000);
	driver.close();
	}
}
