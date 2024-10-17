package Chromefox_start;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chromefox_start
{
public static void main(String[] args) throws InterruptedException 
{
String key= "webdriver.gecko.driver";
String value= "./Software/geckodriver.exe";
System.setProperty(key, value);

String key1= "webdriver.chrome.driver";
String value1= "./Software/chromedriver.exe";
System.setProperty(key1, value1);

FirefoxDriver driver= new FirefoxDriver();
Thread.sleep(5000);

ChromeDriver driver1= new ChromeDriver();
driver.quit();
Thread.sleep(5000);
driver1.close();
}
}
