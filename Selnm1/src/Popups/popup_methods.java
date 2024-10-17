package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup_methods 
{
	public static void main(String[] args) throws InterruptedException 
	{	
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2"); //Popup sendkeys
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Prompt Alert Box']")).click();
	Thread.sleep(2000);
	Alert al4= driver.switchTo().alert();
	al4.sendKeys("yes");
	Thread.sleep(2000);
	al4.accept();
	
	driver.get("https://demo.guru99.com/test/delete_customer.php"); //Popup accept
	Thread.sleep(2000);
	driver.findElement(By.name("cusid")).sendKeys("abc");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	Alert al= driver.switchTo().alert();
	al.accept();
	
	Thread.sleep(2000);
	driver.get("https://demo.guru99.com/test/delete_customer.php"); //Popup reject
	Thread.sleep(2000);
	driver.findElement(By.name("cusid")).sendKeys("abc");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	Alert al1= driver.switchTo().alert();
	al.dismiss();
	
	Thread.sleep(2000);
	driver.get("https://demo.guru99.com/test/delete_customer.php"); //Popup gettext
	Thread.sleep(2000);
	driver.findElement(By.name("cusid")).sendKeys("abc");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	Alert al2= driver.switchTo().alert();
	String text=al.getText();
	System.out.println(text);
	
	Thread.sleep(4000);
	driver.quit();
	
	}
}
