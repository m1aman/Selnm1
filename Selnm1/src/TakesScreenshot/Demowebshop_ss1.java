package TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Demowebshop_ss1 
{
public static void main(String[] args) throws InterruptedException, IOException 
{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("https://demowebshop.tricentis.com/apparel-shoes");
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
	boolean msg = driver.findElement(By.xpath("//div[@id='bar-notification']")).isDisplayed();
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	Thread.sleep(2000);

	if (!msg)
	{
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
	}
	else
	{
		System.out.println("11111");
		TakesScreenshot t= (TakesScreenshot)driver;
		File img= t.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\PC\\Desktop\\DWS task\\defect1.jpeg");
		FileHandler.copy(img, target);
		System.out.println("22222");	
	}
	Thread.sleep(4000);
	driver.close();	
}
}
