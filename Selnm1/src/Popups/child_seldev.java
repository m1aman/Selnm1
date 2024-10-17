package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class child_seldev 
{
public static void main(String[] args) throws InterruptedException, AWTException 
{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.selenium.dev/");
	List<WebElement> all5 = driver.findElements(By.xpath("//a[@class='nav-link']"));
	Actions act=new Actions(driver);
	Robot r=new Robot();
	for(WebElement a:all5)
	{
		act.contextClick(a).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
	}
	Set<String> allid = driver.getWindowHandles();
	ArrayList<String> l= new ArrayList<String>(allid);
	String cid4 = l.get(4);
	String cid5 = l.get(5);
	Thread.sleep(2000);
	driver.switchTo().window(cid4);
	Thread.sleep(2000);
	driver.switchTo().window(cid5);
	WebElement blog = driver.findElement(By.xpath("//h1[.='Selenium Blog']"));
	System.out.println(blog.getText());
	
	//Thread.sleep(4000);
	//driver.close();	
}
}
