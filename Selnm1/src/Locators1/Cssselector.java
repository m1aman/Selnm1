package Locators1; //CSS Locator use

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssselector 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	Thread.sleep(2000);
	driver.get("https://www.youtube.com/");	
	
	driver.findElement(By.cssSelector("input[id='search']")).sendKeys("KGF Trailer");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	
	Thread.sleep(2000);
	//driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
	driver.findElement(By.cssSelector("img[style='background-color: transparent;']")).click();
	
	Thread.sleep(5000);
	driver.close();
	
}
}
