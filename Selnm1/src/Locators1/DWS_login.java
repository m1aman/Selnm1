package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DWS_login 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	
	Thread.sleep(2000);
	driver.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("Email")).sendKeys("mee.abc5@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("abc@1234");
	driver.findElement(By.className("button-1 login-button")).click();
	
	Thread.sleep(2000);
	driver.close();
	
}
}
