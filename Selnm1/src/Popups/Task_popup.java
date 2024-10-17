package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Task_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/delete_customer.php"); //Popup sendkeys
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("abc");
		driver.findElement(By.name("submit")).click();
		

	}

}
