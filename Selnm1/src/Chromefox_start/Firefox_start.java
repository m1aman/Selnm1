package Chromefox_start;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_start 
{
		public static void main(String[] args) throws InterruptedException 
		{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		driver.close();
			
		}

}
