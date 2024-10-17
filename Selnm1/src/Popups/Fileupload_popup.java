package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload_popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Nagendra%20Kr%20Ojha/Desktop/File_upload.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Nagendra Kr Ojha\\Desktop\\G\\Bgtilak_img.webp");
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
