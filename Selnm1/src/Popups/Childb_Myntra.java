package Popups;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Childb_Myntra 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	WebElement sch = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	sch.sendKeys("hrx shoes", Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//h4[.='Men Memory Foam Running Shoes'])[1]")).click();
	Thread.sleep(2000);
	
	String pid = driver.getWindowHandle();
	Set<String> allid = driver.getWindowHandles();
	Thread.sleep(2000);
	for(String id:allid)
	{
		if(!pid.equals(id))
		{
			driver.switchTo().window(id);
			driver.getTitle();
		}
	}
	
	driver.findElement(By.xpath("//p[.='9']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='REMOVE']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='inlinebuttonV2-base-actionButton ']")).click();
	
	//Thread.sleep(4000);
	//driver.close();
}
}
