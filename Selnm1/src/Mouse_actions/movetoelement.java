package Mouse_actions; //mouse-hovering, Double-click, right-click, drag-drop

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class movetoelement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		WebElement ele= driver.findElement(By.xpath("//div[.='EN']"));
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform(); //Mouse hovering action
		
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement srce= driver.findElement(By.xpath("//a[.=' 5000 ']"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		act.dragAndDrop(srce, dest).build().perform(); //Drag and drop
		
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement srce2= driver.findElement(By.xpath("//a[.=' 5000']"));
		WebElement dest2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		act.dragAndDrop(srce2, dest2).build().perform(); //Drag and drop
		
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");		
		Thread.sleep(2000);
		WebElement ele1= driver.findElement(By.xpath("//span[.='right click me']"));
		act.contextClick(ele1).build().perform(); //Right click 
		Thread.sleep(2000);
		//sendKeys(Keys.ESCAPE);
		
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement ele2= driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		act.doubleClick(ele2).perform(); //Double click
		Thread.sleep(2000);
		//sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

	private static void sendKeys(Keys enter) 
	{
		// TODO Auto-generated method stub
		
	}
	
}
