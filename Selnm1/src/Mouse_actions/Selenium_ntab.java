package Mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_ntab 
{
public static void main(String[] args) throws InterruptedException, AWTException 
{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	Actions act= new Actions(driver);
	Robot r= new Robot();
	
	for(int i=1;i<=5;i++)
	{
		WebElement ele1= driver.findElement(By.xpath("(//a[@class='nav-link'])["+i+"]"));
		act.moveToElement(ele1).build().perform(); //Mouse hovering action
		act.contextClick(ele1).build().perform(); //Right click Mouse
		
		Thread.sleep(2000);	
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
	
	for(int j=1;j<=2;j++)
	{
		WebElement ele2= driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']"));
		act.moveToElement(ele2).build().perform(); //Mouse hovering action
		act.contextClick(ele2).build().perform(); //Right click Mouse
		
		Thread.sleep(2000);	
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
	
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_F4);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_ALT);
}
}