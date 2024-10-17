package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demowebshop1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();

	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@href='/apparel-shoes']")).click();
	Thread.sleep(6000);
	
	driver.findElement(By.xpath("//input[@fdprocessedid='yi0udr']")).click();
	//Thread.sleep(2000);
	//input[@fdprocessedid='yi0udr']
	
	//driver.close();
}
}
