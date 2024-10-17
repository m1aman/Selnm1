package Webdriver_pkg; // maximise,navigate,delete cookies, resize, drag

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wd_navigate 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize(); // maximise the browser
	
	driver.navigate().to("https://www.google.com"); //navigate to Google page
	Thread.sleep(2000);
	driver.navigate().refresh(); //refresh
	driver.navigate().to("https://www.facebook.com"); //navigate to facebook page
	Thread.sleep(2000);
	driver.navigate().back(); //navigate back
	Thread.sleep(2000);
	driver.navigate().forward(); //navigate forward
	driver.manage().deleteAllCookies(); //delete all cookies
	
	Thread.sleep(2000);
	Dimension d= new Dimension(400,300); // new Dimensions(w,h)
	driver.manage().window().setSize(d);//Resize the Browser
	
	Thread.sleep(2000);
	Point p= new Point(1000,500); // new location of Browser(x,y)
	driver.manage().window().setPosition(p);  //Drag the Browser
	
	Thread.sleep(4000);
	driver.close();
	}
}
