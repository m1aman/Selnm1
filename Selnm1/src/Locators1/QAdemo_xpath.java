package Locators1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QAdemo_xpath 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait w= new WebDriverWait(driver, 15);
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.get("https://demoqa.com/automation-practice-form");
	driver.findElement(By.xpath("//input[@ placeholder='First Name']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@ placeholder='Last Name']")).sendKeys("def");
	driver.findElement(By.xpath("//input[@ placeholder='name@example.com']")).sendKeys("abc11@gmail.com");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@ for='gender-radio-1']")).click();
	driver.findElement(By.xpath("//input[@ placeholder='Mobile Number']")).sendKeys("9999988888");
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[@ class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("Hi QAdemo");
	driver.findElement(By.xpath("//label[@ for='hobbies-checkbox-1']")).click();
	driver.findElement(By.xpath("//textarea[@ placeholder='Current Address']")).sendKeys("Abc house");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@ id='submit']")).click();

	Thread.sleep(2000);
	driver.close();
}
}
