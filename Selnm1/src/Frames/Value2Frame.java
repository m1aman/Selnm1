package Frames;
//Pass the Value to both Frames using Indexing
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Value2Frame 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("C:\\Users\\Nagendra Kr Ojha\\Desktop\\Mnframe1.html");	
	driver.findElement(By.id("a1")).sendKeys("abc");
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	driver.findElement(By.id("a2")).sendKeys("pqr");
}
}
