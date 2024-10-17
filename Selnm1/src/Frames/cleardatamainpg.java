package Frames;
//pass the datat to both pages/frames and clear datat in mainpage
import org.openqa.selenium.By; //Ctrl+shift+O to manage suitable drivers import
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleardatamainpg 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("C:\\Users\\Nagendra Kr Ojha\\Desktop\\Mnframe1.html");	
	WebElement ele = driver.findElement(By.id("a1"));
	ele.sendKeys("abc");
	
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	driver.findElement(By.id("a2")).sendKeys("pqr");
	
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	ele.clear();
	
}
}
