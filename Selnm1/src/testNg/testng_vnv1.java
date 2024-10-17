package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testng_vnv1 
{
	@Test
	void test1() throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Facebook – log in or sign up", "Title failed");
	Assert.assertEquals(true, driver.findElement(By.name("login")).isDisplayed());
	System.out.println("done");

	Thread.sleep(4000);
	driver.close();
	
	}	
}
