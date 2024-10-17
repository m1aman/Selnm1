package Webdriver_pkg; // All Webdriver methods usage

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.get("https://www.google.com");

String title= driver.getTitle();
System.out.println(title);

String source= driver.getPageSource();
System.out.println(source);

String url= driver.getCurrentUrl();
System.out.println(url);

Thread.sleep(5000);
driver.close();
}
}
