package Locators1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demowebshop 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.manage().window().maximize();

driver.get("https://demowebshop.tricentis.com/");
driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //Alternative of multiple Thread.sleeps for findelement only

driver.findElement(By.className("ico-register")).click();
driver.findElement(By.id("gender-male")).click();
driver.findElement(By.id("FirstName")).sendKeys("abc6");
driver.findElement(By.id("LastName")).sendKeys("xzy6");
driver.findElement(By.id("Email")).sendKeys("mee.abc02@gmail.com");
driver.findElement(By.name("Password")).sendKeys("abc@1234");
driver.findElement(By.name("ConfirmPassword")).sendKeys("abc@1234");
driver.findElement(By.id("register-button")).click();
driver.findElement(By.className("button-1 register-continue-button")).click(); //continue button not working

Thread.sleep(2000);
driver.close();

}
}
