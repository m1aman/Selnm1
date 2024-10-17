package Web_Element; //getText()

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class we_gettext 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	WebElement ele= driver.findElement(By.xpath("//span[.='Sign in']"));
	String text= ele.getText();
	System.out.println(text);
	
	Thread.sleep(4000);
	driver.close();
}
}
