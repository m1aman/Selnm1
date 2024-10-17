package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.get("file:///C:/Users/Nagendra%20Kr%20Ojha/Desktop/Google.html");
WebElement ele = driver.findElement(By.name("n1"));
Thread.sleep(2000);
ele.sendKeys("selenium123");
Thread.sleep(2000);
driver.findElement(By.className("c2")).click();

driver.close();
}
}
