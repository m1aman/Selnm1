package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qtalk_xpath 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	Thread.sleep(2000);
	driver.get("https://chat.qspiders.com/");
	
	driver.findElement(By.xpath("//input[@ autocomplete='username']")).sendKeys("9875687791");
	driver.findElement(By.xpath("//input[@ name='password']")).sendKeys("Qspid#01");
	driver.findElement(By.xpath("//button[@ type='submit']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[@href='/student-dashboard/QKO-JSAJVD-M1']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[text()='Niranjan L T']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@ name='message']")).sendKeys("Hi sir, Msg sent using Automation..");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@ class='chatSubmitButton']")).click();
	
	Thread.sleep(5000);
	driver.close();
}
}
