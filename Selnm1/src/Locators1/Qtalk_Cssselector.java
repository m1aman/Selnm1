package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qtalk_Cssselector 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	Thread.sleep(2000);
	driver.get("https://chat.qspiders.com/");
	
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("9875687791");
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Qspid#01");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[href='/student-dashboard/QKO-JSAJVD-M1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div[class='']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='message']")).sendKeys("Aman123");
	//Thread.sleep(2000);
	//driver.findElement(By.cssSelector("button[type='button']")).click();

	
	Thread.sleep(2000);
	driver.close();
	
}
}
