package JSExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task_amazon_arguments_scrolldn_aboutus {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Thread.sleep(2000);
		
		while(true) //infinite loop
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			try // tryblock always if 'Aboutus' not found
			{				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[.='About Us']")).click(); //go to catch upon Exception
				//js.executeScript("arguments[0].click();",ele);
				Thread.sleep(2000);
				break; 
			}
			catch (Exception e) //do nothing whenever exception
			{ }
		}
		
		System.out.println("Loop broken successfully when No Exception is reached.");
		Thread.sleep(4000);
		driver.close();	
		
	}
}