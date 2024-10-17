package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class filedownload_popup 
{
public static void main(String[] args) throws InterruptedException, AWTException 
{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[.='4.21.0 (May 16, 2024)'])[3]")).click();
	Thread.sleep(2000);
	
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_J);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_J);
	
	//Thread.sleep(4000);
	//driver.close();
	
}
}
