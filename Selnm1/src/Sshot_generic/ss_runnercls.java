package Sshot_generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ss_runnercls 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	ss_generic.ssgeneric(driver);
}
}
