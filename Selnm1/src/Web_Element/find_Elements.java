package Web_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class find_Elements 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	System.out.println("00000000000000000000000000000");
	
	driver.get("https://www.amazon.in/");
	System.out.println("111111111111111111111111111111");
	
	List<WebElement> links1 = driver.findElements(By.xpath("//a")); //store all links-address into links1-collection
	int count= links1.size(); //size/count of links1 collection
	System.out.println(count);
	System.out.println("222222222222222222222222222");
	
	for (int i=0;i<=count-1;i++) 
	{
		WebElement link1 = links1.get(i); //store every element-address into link1 variable of Webelement-type
		String href1 = link1.getAttribute("href"); //store every element-href into href1 variable of String-type
		System.out.println(href1);
	}
	System.out.println("333333333333333333333333333333");
	
	for (int i=0;i<=count-1;i++)
	{
		WebElement link1 = links1.get(i); //store every element-address into link1 variable of Webelement-type
		String text1 = link1.getText(); //store every element-text into text2 variable of String-type
		System.out.println(text1);
	}
	System.out.println("44444444444444444444444444444444");
	
	for(WebElement link2:links1)
	{
		String text2 = link2.getText(); //store every element-text into text2 variable of Webelement-type
		System.out.println(text2);
	}
	System.out.println("5555555555555555555555555555555");
	
	Thread.sleep(4000);
	driver.close();

	}
}
