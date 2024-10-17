package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_xpath 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("8981745767");
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Insta#01");
	driver.findElement(By.xpath("//button[@ type='submit']")).click();
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//button[text()='Save info']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[text()='Not Now']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[text()='Messages']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//div[text()='Send message']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys(" niranjan_ka");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[text()='niranjan_ka_18']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//div[text()='Chat']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//div[@aria-label='Message']")).sendKeys("Hi Sir, Msg sent using Selenium..");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//div[text()='Send']")).click();
	Thread.sleep(6000);
	
	Thread.sleep(5000);
	driver.close();

}
}
