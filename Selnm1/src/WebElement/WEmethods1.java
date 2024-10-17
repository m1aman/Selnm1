package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WEmethods1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();

	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	
	WebElement f = driver.findElement(By.xpath("//span[.='Try searching to get started']"));
	Point loc = f.getLocation();
	int x = loc.getX();
	int y= loc.getY();
	System.out.println(f);
	System.out.println(loc);
	System.out.println(x);
	System.out.println(y);
	
	Dimension s = f.getSize();
	int h= s.getHeight();
	int w= s.getWidth();
	System.out.println(s);
	System.out.println(h);
	System.out.println(w);
	
	Thread.sleep(5000);
	driver.close();
	
}
}
