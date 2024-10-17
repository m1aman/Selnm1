package Tasks; //create 10 checkboxes and tick in forward and untick in reverse direction

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cbox_untick 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize(); 
		
		driver.get("file:///C:/Users/Nagendra%20Kr%20Ojha/Desktop/10checkbox2.html");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input")); //store all checkbox-addresses into a List-collection 
		int count= checkboxes.size(); //count the size of List-collection
		System.out.println(count);	
		
		for (WebElement a:checkboxes) //tick the checkboxes using foreach-loop forward always
		{
			a.click();
		}
		Thread.sleep(2000);
		
		for (int i=count-1;i>=0;i--) //untick the checkboxes using for-loop decrement
		{
			WebElement checkb1 = checkboxes.get(i);
			checkb1.click();
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
