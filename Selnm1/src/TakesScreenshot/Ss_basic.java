package TakesScreenshot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Ss_basic 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{	
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	//driver.get("https://www.google.com");
	
	try
	{
	TakesScreenshot t= (TakesScreenshot) driver;
	File img = t.getScreenshotAs(OutputType.FILE);
	File target = new File("C:\\Users\\PC\\Desktop\\ABC\\d1.jpeg");
	FileHandler.copy(img, target);
	//ss_generic.ssgeneric(driver);
	}
	catch(Exception e)
	{
		System.out.println("File not created");
	}
	
	Thread.sleep(2000);
	driver.close();
}
}
